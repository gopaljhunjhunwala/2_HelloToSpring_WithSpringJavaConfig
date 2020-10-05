package github.gopal.repository;

import github.gopal.beans.Employee;

import java.util.List;

/**
 * Author: Gopal
 */
public interface EmployeeRepository {
    List<Employee> getAllEmployees();
}
