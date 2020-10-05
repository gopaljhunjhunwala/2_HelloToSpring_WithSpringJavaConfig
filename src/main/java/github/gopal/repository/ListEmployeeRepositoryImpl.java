package github.gopal.repository;

import github.gopal.beans.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Gopal
 */
public class ListEmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee("Gopal", "J");
        employees.add(employee);
        return employees;
    }

}
