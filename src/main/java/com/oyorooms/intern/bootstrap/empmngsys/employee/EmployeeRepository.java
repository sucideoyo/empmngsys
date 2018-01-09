package com.oyorooms.intern.bootstrap.empmngsys.employee;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee , String> {

    public List<Employee> findByParentId(String id);
}
