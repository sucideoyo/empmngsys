package com.oyorooms.intern.bootstrap.empmngsys.employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees/{parentId}/subordinates")
    public List<Employee> getSubordinates(@PathVariable String parentId){
        return employeeService.getSubordinates(parentId);
    }

    @RequestMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable String id){
        return employeeService.getEmployee(id);
    }

    @RequestMapping(method = RequestMethod.POST , value = "/employees")
    public void addEmployee(@RequestBody HashMap<String, String> payload){
        Employee emp = new Employee(payload.get("id") , payload.get("name") , payload.get("designation") , payload.get("parentId"));
        employeeService.addEmployee(emp);
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/employees/{id}")
    public void updateEmployee(@RequestBody Employee emp , @PathVariable String id){
        employeeService.updateEmployee(id , emp);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/employees/{id}")
    public void removeEmployee(@PathVariable String id){
        employeeService.removeEmployee(id);
    }

}
