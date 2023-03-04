package com.hpe.restful.resource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeManager {

    public Employees initializeEmployees() {
        Employees employees = new Employees();

        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setEmployee_id(1);
        employee1.setFirst_name("John");
        employee1.setLast_name("Doe");
        employee1.setEmail("johndoe@email.com");
        employee1.setTitle("Manager");
        employeeList.add(employee1);

        Employee employee2 = new Employee();
        employee2.setEmployee_id(2);
        employee2.setFirst_name("Jane");
        employee2.setLast_name("Dawn");
        employee2.setEmail("janedawn@email.com");
        employee2.setTitle("UX Designer");
        employeeList.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmployee_id(3);
        employee3.setFirst_name("Bob");
        employee3.setLast_name("Boil");
        employee3.setEmail("bobboil@email.com");
        employee3.setTitle("Software Developer");
        employeeList.add(employee3);
        employees.setEmployeeList(employeeList);

        return employees;
    }

}
