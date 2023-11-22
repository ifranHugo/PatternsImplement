package inversionOfControl.ExemapleEmployee;

import java.util.List;

public class Main {

    public static void main (String[] arg){
        EmployeeRepository employeeRepositorys = new EmployeeRepositoryImp();

        EmployeeService employeeServiceNew = new EmployeeService(employeeRepositorys);

        Employee employee1 = new Employee("ema","policia",4130843);
        Employee employee2 = new Employee("camila","vendedora mas linda del mundo",4040343);

        employeeServiceNew.addEmployee(employee1);
        employeeServiceNew.addEmployee(employee2);

        List<Employee> allEmployees = employeeServiceNew.getAllEmployees();
        for (Employee employee : allEmployees) {
            System.out.println("Employee: " + employee.getName());
        }

    }
}
