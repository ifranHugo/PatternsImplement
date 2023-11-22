package inversionOfControl.ExemapleEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImp implements EmployeeRepository{
    private List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employees.add(employee);
    }
}
