package inversionOfControl.ExemapleEmployee;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
