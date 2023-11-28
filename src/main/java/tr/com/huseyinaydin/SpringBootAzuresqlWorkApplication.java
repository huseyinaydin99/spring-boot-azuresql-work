package tr.com.huseyinaydin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot.
 *
 */

@SpringBootApplication
@RestController
public class SpringBootAzuresqlWorkApplication {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/calisan")
    public Employee addEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @GetMapping("/calisanlar")
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAzuresqlWorkApplication.class, args);
    }
}