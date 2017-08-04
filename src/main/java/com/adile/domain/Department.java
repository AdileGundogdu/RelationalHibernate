package com.adile.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int departmentId;
    private String name;
    private String departDesc;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "department_meeting",
               joinColumns = {@JoinColumn(name ="depertmentId")},
               inverseJoinColumns = {@JoinColumn(name = "meetingId")} )
    private Set<Meeting> meeting = new HashSet<Meeting>();

    public Set<Meeting> getMeeting() {
        return meeting;
    }

    public void setMeeting(Set<Meeting> meeting) {
        this.meeting = meeting;
    }

    public Department() {
    }

    public Department(String name, String departDesc) {
        this.name = name;
        this.departDesc = departDesc;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartDesc() {
        return departDesc;
    }

    public void setDepartDesc(String departDesc) {
        this.departDesc = departDesc;
    }



}
