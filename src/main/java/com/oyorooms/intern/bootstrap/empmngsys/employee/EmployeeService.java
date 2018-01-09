package com.oyorooms.intern.bootstrap.empmngsys.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getSubordinates(String parentId){
        List<Employee> employees = new ArrayList<>();
        for( Employee emp:employeeRepository.findByParentId(parentId)){
            employees.add(emp);
        }
        return employees;
    }

    public Employee getEmployee(String id){
        return employeeRepository.findOne(id);
    }

    public void removeEmployee(String id){
        employeeRepository.delete(id);
    }

    public void updateEmployee(String id , Employee employee){
        employeeRepository.save(employee);
    }

    public void addEmployee(Employee emp){
        employeeRepository.save(emp);
    }

}
