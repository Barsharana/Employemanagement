package org.jt.employeemanagement.service;


import java.util.List;
import java.util.Optional;

import org.jt.employeemanagement.model.Employee;

public interface EmployeeService {
    /**
    *<h1>save employee in to DB</h1>
    *<p>this method take employee as parameter and save it into database.</p>

    * @Param org.jt.employeemanagement.model.Employee
    */
     void saveEmployee(Employee employee);

     List<Employee> getEmployee();

     void deletById(String id);

     Optional<Employee> employeeById(String id);
}
