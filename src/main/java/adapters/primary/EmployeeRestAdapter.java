package main.java.adapters.primary;

import main.java.domain.Employee;
import main.java.port.inbound.HandleUserInteraction;
import main.java.port.outbound.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeRestAdapter implements HandleUserInteraction {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    @Override
    public List<Employee> showAllEmployee() {
        return employeeRepository.fetchAllEmployees();
    }

    @GetMapping("/{id}")
    @Override
    public Employee getEmployeeById(@PathVariable(value = "id") int id) {
        return employeeRepository.fetchEmployee(id);
    }

    @PostMapping
    @Override
    public void addNewEmployee(@RequestBody Employee employee) {
        String name = employee.getName();
        System.out.println(name);
        employeeRepository.insertEmployee(employee);
    }

}
