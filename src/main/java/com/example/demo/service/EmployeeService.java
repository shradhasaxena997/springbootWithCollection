package com.example.demo.service;

import com.example.demo.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("one", "shradha"),
            new Employee("two", "shivani")

    ));

    public List<Employee> getAllEmployee() {
        return employees;
    }

    public Employee getEmployee(String id) {
        return employees.stream().filter(emp -> emp.getId().equals(id)).findFirst().get();
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployee(String id, Employee employee) {
        for (int emp = 0; emp < employees.size(); emp++) {
            Employee e = employees.get(emp);
            if (e.getId().equals(id)) {
                employees.set(emp, employee);
                return;
            }
        }
    }
}