package com.oyorooms.intern.bootstrap.empmngsys.employee;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private String id;
    private String name;
    private String designation;

    public Employee(){

    }

    public Employee(String id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public String getId() {
        return id;
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
