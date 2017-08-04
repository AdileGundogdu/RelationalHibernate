package com.adile.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Table(catalog = "hiberexample")
public class Department {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int departmentId;
    private String name;
    private String departDesc;

    @ManyToMany(mappedBy = "meeting")
    private Set<Department> department= new HashSet<Department>();

    public Set<Department> getDepartment() {
        return department;
    }

    public void setDepartment(Set<Department> department) {
        this.department = department;
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
