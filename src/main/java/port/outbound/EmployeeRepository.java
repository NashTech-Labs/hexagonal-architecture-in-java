package main.java.port.outbound;

import main.java.domain.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> fetchAllEmployees();

    Employee fetchEmployee(int id);

    void insertEmployee(Employee employee);

}
