package com.luv2code.springboot.employees.service;

import com.luv2code.springboot.employees.entity.Employee;
import com.luv2code.springboot.employees.request.EmployeeRequest;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    Optional<Employee> findById(long id);
    Employee save(EmployeeRequest employeeRequest);
    Employee update(long id, EmployeeRequest employeeRequest);
    Employee convertToEmployee(long id, EmployeeRequest employeeRequest);
    void deleteById(long id);
}
