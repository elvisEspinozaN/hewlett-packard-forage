package com.hpe.restful.resource;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    public static Employees initializeEmployees() {
        Employees employees = new Employees();
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setEmployee_id(1L);
        employee1.setFirst_name("John");
        employee1.setLast_name("Doe");
        employee1.setEmail("johndoe@email.com");
        employee1.setTitle("Manager");

        employeeList.add(employee1);

        Employee employee2 = new Employee();
        employee1.setEmployee_id(2L);
        employee1.setFirst_name("Jane");
        employee1.setLast_name("Dawn");
        employee1.setEmail("janedawn@email.com");
        employee1.setTitle("UX Designer");

        employeeList.add(employee2);

        Employee employee3 = new Employee();
        employee1.setEmployee_id(3L);
        employee1.setFirst_name("Bob");
        employee1.setLast_name("Boil");
        employee1.setEmail("bobboil@email.com");
        employee1.setTitle("Software Developer");

        employeeList.add(employee3);

        employees.setEmployeeList(employeeList);
        return employees;
    }
}
