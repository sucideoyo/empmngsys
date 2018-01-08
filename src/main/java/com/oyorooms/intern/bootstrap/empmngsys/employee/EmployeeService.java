package com.oyorooms.intern.bootstrap.empmngsys.employee;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = Arrays.asList(
            new Employee("1" , "Shivam" , "intern"),
            new Employee("2" , "Sahil" , "SDE"),
            new Employee("3" , "Sidharth" , "Senior Intern")
    );

    public List<Employee> getSubordinates(){
        return employees;
    }

    public Employee getEmployee(String id){
        for( Employee emp: employees){
            if(emp.getId().equals(id)) {
                return emp;
            }
        }
        return null;
    }

}
