package com.adile.domain;

import org.hibernate.mapping.FetchProfile;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "meeting")
public class Meeting {
    @Id
    @GeneratedValue(strategy =IDENTITY)
    private int meetingId;
    private String meetingName;
    private String meetingDesc;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "meeting")
    private Set<Department> department = new HashSet<Department>();


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

    public Set<Department> getDepartment() {
        return department;
    }

    public void setDepartment(Set<Department> department) {
        this.department = department;
    }
}
