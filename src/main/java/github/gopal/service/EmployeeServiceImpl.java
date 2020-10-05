package github.gopal.service;

import github.gopal.beans.Employee;
import github.gopal.repository.EmployeeRepository;
import github.gopal.repository.ListEmployeeRepositoryImpl;

import java.util.List;

/**
 * Author: Gopal
 */
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = repository.getAllEmployees();
        return allEmployees;
    }

}
