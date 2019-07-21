package pl.sda.employee;

import pl.sda.employee.controller.EmployeeController;
import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println(EmployeeDatabase.employeeList);
        EmployeeDatabase.employeeList.add(new Employee("sad","as",'K',2));
        System.out.println(EmployeeDatabase.employeeList);

        System.out.println("1. dodoaj pracownika");
        System.out.println("2. pokaż pracownika");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        EmployeeController controller = new EmployeeController(new EmployeeView(), new EmployeeService());

        switch (value){
            case 1:
                controller.prepareEmployee();
                break;
            case 2:
                controller.showEmployee();
                break;
        }
        System.out.println(EmployeeDatabase.employeeList);
    }
}
