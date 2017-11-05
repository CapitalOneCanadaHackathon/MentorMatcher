package ca.giftthecode.indspire.mentormatcher.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nathanwu on 11/4/17.
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //    Identification
    @JsonProperty("firstName")
    @NotNull
    public String firstName;

    @JsonProperty("lastName")
    @NotNull
    public String lastName;

    //    Type of customer
    @JsonProperty("education")
    @NotNull
    public String education;

    @JsonProperty("isEducator")
    public boolean isEducator;

    @JsonProperty("programTrack")
    @NotNull
    public String programTrack;

    //    Matching criteria
    @JsonProperty("grade")
    public int grade;

    @JsonProperty("fieldOfStudy")
    public String fieldOfStudy;

    @JsonProperty("province")
    @NotNull
    public String province;

    @JsonProperty("gender")
    @NotNull
    public String gender;

    @JsonProperty("isIndigenous")
    public boolean isIndigenous;

    //    Extra information
    @JsonProperty("comments")
    public String comments;

    public int menteeCount = 0;
    public long mentorId = -1;
    public String menteeList = "";

    public Customer() {
    }

    public Customer(String firstName, String lastName, String education, boolean isEducator,
                    String programTrack, int grade, String fieldOfStudy, String province,
                    String gender, boolean isIndigenous, String comments) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.education = education;
        this.isEducator = isEducator;
        this.programTrack = programTrack;
        this.grade = grade;
        this.fieldOfStudy = fieldOfStudy;
        this.province = province;
        this.gender = gender;
        this.isIndigenous = isIndigenous;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s', education='%s',"+
                        " isEducator=%s, programTrack='%s', grade=%d, fieldOfStudy='%s', province='%s', "+
                        "gender='%s', isIndigenous=%s, comments='%s', menteeCount=%d, menteeList=%s, mentorId=%d]",
                id, firstName, lastName, education, isEducator, programTrack, grade, fieldOfStudy,
                province, gender, isIndigenous, comments, menteeCount, menteeList, mentorId);
    }
}