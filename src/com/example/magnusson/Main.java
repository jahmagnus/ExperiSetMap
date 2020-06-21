package com.example.magnusson;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static Set<Employee> employeeSetCopy = new HashSet<Employee>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;

        System.out.println("0 - quit\n" +
                "1 - Add new Employee\n" +
                "2 - Print Employee data");

        while(flag){
            System.out.println("Please select option");
            int option = sc.nextInt();

            switch (option){
                case 0:
                    flag = false;
                    break;
                case 1:
                    addNewEmployee();
                    break;
                case 2:
                    printEmployeeData();

            }
        }

    }

    private static void addNewEmployee(){
        sc.nextLine();
        System.out.println("Employee name");
        String nameInput = sc.nextLine();
        System.out.println("Employee age");
        String ageInput = sc.nextLine();


        Employee employee = new Employee(nameInput, ageInput);
        employee.addEmployee(employee);
        getEmployeeData(employee);
    }

    private static void getEmployeeData(Employee employee){
        employeeSetCopy.add(employee);
    }

    private static void printEmployeeData(){
        System.out.println("Name  |  Age");
        for (Employee employee : employeeSetCopy){
            System.out.println(employee.getName() + "     " + employee.getAge());
        }
    }
}
