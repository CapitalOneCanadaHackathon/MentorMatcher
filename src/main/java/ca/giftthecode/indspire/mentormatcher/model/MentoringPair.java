package ca.giftthecode.indspire.mentormatcher.model;

import java.io.Serializable;

/**
 * Created by nathanwu on 11/5/17.
 */
public class MentoringPair implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;

    public long mentorId;

    public long menteeId;

    public MentoringPair(long mentorId, long menteeId) {
        this.mentorId = mentorId;
        this.menteeId = menteeId;
    }

    public  MentoringPair(){}
}
