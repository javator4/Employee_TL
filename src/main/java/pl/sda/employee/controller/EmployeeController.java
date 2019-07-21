package pl.sda.employee.controller;

import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

public class EmployeeController {

    private EmployeeService employeeService;
    private EmployeeView employeeView;

    public EmployeeController(EmployeeView employeeView, EmployeeService employeeService){
        this.employeeService = employeeService;
        this.employeeView = employeeView;
    }

    public void prepareEmployee(){
        System.out.println("Podaj imie:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = input.nextLine();
        System.out.println("Podaj płeć:");
        String sexS = input.nextLine();
        char sex = sexS.charAt(0);
        System.out.println("Podaj numer działu:");
        int departmentNumber = input.nextInt();
        employeeService.addEmployee(new Employee(name, lastName, sex, departmentNumber));

    }

    public void showEmployee(){

    }
}
