package com.employee.employeemanagment.service;

import com.employee.employeemanagment.entity.Employee;
import com.employee.employeemanagment.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1, "First Employee", "New York"),
            new Employee(2, "Second Employee", "Washingtone")
    ));
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }

    public Employee getAnEmployee(int id){
      return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Mot Found"));
    }

    public void  createEmployee(Employee employee){

        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee){

        employeeRepository.save(employee);
    }

    public  void deleteEmployee(int id){

        employeeRepository.delete(employeeRepository.getById(id));
    }
}
