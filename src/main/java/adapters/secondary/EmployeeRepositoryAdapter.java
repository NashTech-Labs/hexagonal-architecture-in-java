package main.java.adapters.secondary;

import main.java.domain.Employee;
import main.java.port.outbound.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class EmployeeRepositoryAdapter implements EmployeeRepository {

    private final HashMap<Integer, Employee> employeeHashMap = new HashMap<Integer, Employee>();

    @Override
    public List<Employee> fetchAllEmployees() {
        return new ArrayList<>(employeeHashMap.values());
    }

    @Override
    public Employee fetchEmployee(int id) {
        return employeeHashMap.get(id);
    }

    @Override
    public void insertEmployee(Employee employee) {
        String name = employee.getName();
        System.out.println(name);
        employeeHashMap.put(employee.getId(), employee);
    }

}
