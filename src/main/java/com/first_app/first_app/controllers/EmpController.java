package com.first_app.first_app.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.first_app.first_app.constants.Employee;
import com.first_app.first_app.constants.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmpController {
    String controllerName = "[EmpController]";

   @Autowired
   EmployeeService employeeService;

    @GetMapping("Employees")
    public ResponseEntity<List<Employee>> getData(){
        try{
            return ResponseEntity.ok(employeeService.getAllEmployees());
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping("create-employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        try{
            return ResponseEntity.ok(employeeService.createNewEmployee(employee));
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        } 
    }

    @DeleteMapping("delete-employee/{id}")
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable Long id){
        try{
            return ResponseEntity.ok(employeeService.deleteEmployee(id));
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PutMapping("update/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable Long id , @RequestBody Employee employee){
        try{
            return ResponseEntity.ok(employeeService.updateEmployee(id,employee));
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        
    }
}
