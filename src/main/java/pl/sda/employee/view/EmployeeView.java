package pl.sda.employee.view;

import pl.sda.employee.database.EmployeeDatabase;

public class EmployeeView {

    public void showAllEmployees(){
        for (int i = 0; i < EmployeeDatabase.employeeList.size(); i++) {
            System.out.println((i+1)+" "+EmployeeDatabase.employeeList.get(i).getName()+": "+
                    EmployeeDatabase.employeeList.get(i).getLastName()+": "+
                    EmployeeDatabase.employeeList.get(i).getSex()+":");
        }
    }
}
