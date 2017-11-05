package ca.giftthecode.indspire.mentormatcher.CustomerMatching;

import ca.giftthecode.indspire.mentormatcher.model.Customer;
import ca.giftthecode.indspire.mentormatcher.model.MentoringPair;
import ca.giftthecode.indspire.mentormatcher.repository.CustomerRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nathanwu on 11/4/17.
 */

@RestController
public class CustomerMatching {

    @Autowired
    CustomerRepository repository;

    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/gethighschoolmentees", method = RequestMethod.GET)
    public String getHighschoolMentees() {
        List<Customer> customerList = repository.findByEducationAndProgramTrack("highschool", "mentee");
        return Arrays.toString(customerList.toArray());
    }

    @RequestMapping(value = "/getpostsecondarymentees", method = RequestMethod.GET)
    public String getPostsecondaryMentees() {
        List<Customer> customerList = repository.findByEducationAndProgramTrack("postsecondary", "mentee");
        return Arrays.toString(customerList.toArray());
    }

    @RequestMapping(value = "/geteducatormentees", method = RequestMethod.GET)
    public String getEducatorMentees() {
        List<Customer> customerList = repository.findByIsEducatorAndProgramTrack(true, "mentee");
        return Arrays.toString(customerList.toArray());
    }

    @RequestMapping(value = "/gettopfivematches", method = RequestMethod.POST)
    public String getTopFiveMatches(@RequestBody String inputString) {
        List<Customer> mentorList = repository.findByProgramTrackIn(Arrays.asList("mentor", "both"));
        List<Customer> topMentorList = mentorList.subList(0, 5);
        return Arrays.toString(topMentorList.toArray());
    }

    @RequestMapping(value = "/pairmatches", method = RequestMethod.POST)
    public String pairMatches(@RequestBody String inputString) {
        try {
            MentoringPair mentoringPair = objectMapper.readValue(inputString, MentoringPair.class);
            Customer mentor = repository.findById(mentoringPair.mentorId);
            Customer mentee = repository.findById(mentoringPair.menteeId);
            mentor.menteeCount += 1;
            mentor.menteeList += (" " + mentoringPair.menteeId);
            mentee.mentorId = mentoringPair.mentorId;
            repository.save(mentor);
            repository.save(mentee);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "no matches";
    }

}
