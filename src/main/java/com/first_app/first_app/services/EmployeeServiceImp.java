package com.first_app.first_app.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.first_app.first_app.constants.Employee;
import com.first_app.first_app.constants.EmployeeService;
import com.first_app.first_app.models.EmpEntity;
import com.first_app.first_app.repositories.EmpRepository;


@Service
public class EmployeeServiceImp implements EmployeeService{

    List<Employee> employees = new ArrayList<>();

    @Autowired
    private EmpRepository employeeRepository;

    @Override
    public Employee createNewEmployee(Employee employee) {
        EmpEntity empEntity = new EmpEntity();
        BeanUtils.copyProperties(employee, empEntity);
        employeeRepository.save(empEntity);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<EmpEntity> empList = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();
        for(EmpEntity empEntity : empList){
            Employee emp = new Employee();
            emp.setName(empEntity.getName());
            emp.setEmail(empEntity.getEmail());
            emp.setPhone(empEntity.getPhone());
            emp.setId(empEntity.getId());
            employees.add(emp);
        }
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        EmpEntity empEntity = employeeRepository.findById(id).get();
        employeeRepository.delete(empEntity);
        return true;
    }

    @Override
    public String updateEmployee(Long id, Employee employee) {
        EmpEntity existing_emp = employeeRepository.findById(id).get();
        existing_emp.setName(employee.getName());
        existing_emp.setEmail(employee.getEmail());
        existing_emp.setPhone(employee.getPhone());
        employeeRepository.save(existing_emp);
        return "updated Successfully";
    }
}
