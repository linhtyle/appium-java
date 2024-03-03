package labs.lab_7_1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    public static void main(String[] args) {
        //Create a class Employee with a method salary to return employee’s salary
        //There are 2 types of employee: Full time employee and contract employee
        //Full time employee has salary is 50000 and contract employee has salary 40000
        //Write a method to accept a list of Employee and calculate total salary
        //For example, company has 3 FTE and 2 contractor

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new ContractEmployee());
        employeeList.add(new ContractEmployee());
        System.out.println("The total salary of all employees: " + getTotalSalary(employeeList) );
    }
    public static int getTotalSalary(List<Employee> employeeList){
        int total = 0;
        for (Employee employee : employeeList) {
            total += employee.getSalary();
        }
        return total;
    }
}