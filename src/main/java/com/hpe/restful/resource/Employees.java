package com.hpe.restful.resource;

import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
