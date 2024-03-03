package labs.lab_10_2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    public static void main(String[] args) {

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