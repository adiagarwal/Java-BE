package com.first_app.first_app.constants;
import java.util.List;


public interface EmployeeService {
    Employee createNewEmployee(Employee employee);
    List<Employee> getAllEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id , Employee employee);
}
