package main.java.port.inbound;

import main.java.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HandleUserInteraction {

    List<Employee> showAllEmployee();

    Employee getEmployeeById(int id);

    void addNewEmployee(Employee employee);

}
