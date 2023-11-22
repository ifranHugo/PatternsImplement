package inversionOfControl.ExemapleEmployee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
