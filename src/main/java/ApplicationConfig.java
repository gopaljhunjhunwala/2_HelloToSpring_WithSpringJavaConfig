import github.gopal.repository.EmployeeRepository;
import github.gopal.repository.ListEmployeeRepositoryImpl;
import github.gopal.service.EmployeeService;
import github.gopal.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Gopal
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public EmployeeRepository getRepository() {
        return new ListEmployeeRepositoryImpl();
    }

    @Bean
    public EmployeeService getService() {
        return new EmployeeServiceImpl(getRepository());
    }

}
