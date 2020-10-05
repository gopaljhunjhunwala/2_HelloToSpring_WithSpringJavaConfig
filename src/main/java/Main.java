import github.gopal.beans.Employee;
import github.gopal.repository.EmployeeRepository;
import github.gopal.repository.ListEmployeeRepositoryImpl;
import github.gopal.service.EmployeeService;
import github.gopal.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Author: Gopal
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        EmployeeService employeeServicBean = applicationContext.getBean(EmployeeService.class);

        System.out.println(employeeServicBean);

        List<Employee> allEmployees = employeeServicBean.getAllEmployees();

        System.out.println(allEmployees.get(0).getFirstName());
        System.out.println(allEmployees.get(0).getLastName());
    }
}
