package com.example.magnusson;

import java.util.HashSet;
import java.util.Set;

public class Employee {

    private String name;
    private String age;
    Set<Employee> employeeSet = new HashSet<Employee>();

    public Employee(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public boolean addEmployee(Employee employee){
        return employeeSet.add(employee);
    }

    public Set<Employee> getEmployeeSet(){
        return new HashSet<Employee>(employeeSet);
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
