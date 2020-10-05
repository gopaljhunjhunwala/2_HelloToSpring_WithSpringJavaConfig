package github.gopal.repository;

import github.gopal.beans.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Author: Gopal
 */
public class ListEmployeeRepositoryImplTest {

    @Test
    public void testGetAllEmployees() {
        EmployeeRepository employeeRepository = new ListEmployeeRepositoryImpl();
        List<Employee> allEmployees = employeeRepository.getAllEmployees();
        Assert.assertEquals(1, allEmployees.size());
    }
}