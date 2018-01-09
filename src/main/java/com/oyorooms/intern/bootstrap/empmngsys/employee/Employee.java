package com.oyorooms.intern.bootstrap.empmngsys.employee;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {

    @Id
    private String id;
    private String name;
    private String designation;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Employee parent;

    @OneToMany
    @JoinColumn(name = "parent_id")
    private List<Employee> subordinates = new ArrayList<>();

    public Employee(){

    }

    public Employee(String id, String name, String designation, String parentId) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        if(parentId == null)
            this.parent = null;
        else
            this.parent = new Employee(parentId , "" , "" , null);
    }

    public String getId() {
        return id;
    }

    public Employee getParent() {
        return parent;
    }

    public void setParent(Employee parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
