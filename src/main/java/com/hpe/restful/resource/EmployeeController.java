package com.hpe.restful.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return employeeManager.initializeEmployees();
    }
}
