package com.adile.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Table(catalog = "hiberexample")
public class Meeting {
    @Id
    @GeneratedValue(strategy =IDENTITY)
    private int meetingId;
    private String meetingName;
    private String meetingDesc;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "department-meeting",catalog = "hiberexample",
            joinColumns = {@JoinColumn(name ="depertmentId")},
            inverseJoinColumns = {@JoinColumn(name = "meetingId")} )
    private Set<Meeting> meeting = new HashSet<Meeting>();


    public Meeting() {
    }

    public Meeting(String meetingName, String meetingDesc) {
        this.meetingName = meetingName;
        this.meetingDesc = meetingDesc;
    }

    public int getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingDesc() {
        return meetingDesc;
    }

    public void setMeetingDesc(String meetingDesc) {
        this.meetingDesc = meetingDesc;
    }

    public Set<Meeting> getMeeting() {
        return meeting;
    }

    public void setMeeting(Set<Meeting> meeting) {
        this.meeting = meeting;
    }
}
