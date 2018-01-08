package com.oyorooms.intern.bootstrap.empmngsys.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<Employee>(Arrays.asList(
            new Employee("1" , "Shivam" , "intern"),
            new Employee("2" , "Sahil" , "SDE"),
            new Employee("3" , "Sidharth" , "Senior Intern")
    ));

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

    public void removeEmployee(String id){
        for(int i = 0 ; i < employees.size() ; i++){
            if(employees.get(i).getId().equals(id)){
                employees.remove(i);
                return;
            }
        }
    }

    public void updateEmployee(String id , Employee employee){
        for( int i = 0 ; i < employees.size() ; i++){
            Employee emp = employees.get(i);
            if(emp.getId().equals(id)) {
                employees.set(i , employee);
                return;
            }
        }
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

}
