package ca.giftthecode.indspire.mentormatcher.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

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
    @Column(name = "firstName")
    @JsonProperty("firstName")
    public String firstName;

    @Column(name = "lastName")
    @JsonProperty("lastName")
    public String lastName;

    @Column(name = "age")
    @JsonProperty("age")
    public int age;

    //    Type of customer
    @Column(name = "education")  // "highschool" or "postsecondary" or "professional"
    @JsonProperty("education")
    public String education;

    @Column(name = "isEducator")
    @JsonProperty("isEducator")
    public boolean isEducator;

    @Column(name = "programTrack")  // "mentor" or "mentee" or "both"
    @JsonProperty("programTrack")
    public String programTrack;

    //    Matching criteria
    @Column(name = "grade")
    @JsonProperty("grade")
    public int grade;

    @Column(name = "fieldOfStudy")
    @JsonProperty("fieldOfStudy")
    public String fieldOfStudy;

    @Column(name = "province")
    @JsonProperty("province")
    public String province;

    @Column(name = "gender")
    @JsonProperty("gender")
    public String gender;

    @Column(name = "isIndigenous")
    @JsonProperty("isIndigenous")
    public boolean isIndigenous;

    //    Extra information
    @Column(name = "comments")
    @JsonProperty("comments")
    public String comments;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int age, String education, boolean isEducator,
                    String programTrack, int grade, String fieldOfStudy, String province,
                    String gender, boolean isIndigenous) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.education = education;
        this.isEducator = isEducator;
        this.programTrack = programTrack;
        this.grade = grade;
        this.fieldOfStudy = fieldOfStudy;
        this.province = province;
        this.gender = gender;
        this.isIndigenous = isIndigenous;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s', age=%d, education='%s',"+
                        " isEducator=%s, programTrack='%s', grade=%d, fieldOfStudy='%s', province='%s', "+
                        "gender='%s', isIndigenous=%s, comments='%s']",
                id, firstName, lastName, age, education, isEducator, programTrack,
                grade, fieldOfStudy, province, gender, isIndigenous, comments);
    }
}