package com.vinotech.validation;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public void processEmployee(Employee employee) {
        // Process the employee data
        System.out.println("Processing employee: " + employee.getName());
    }
}