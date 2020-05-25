package payroll;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository){
    return args -> {
      System.out.println(args);
      log.info("Preloading" + repository.save(new Employee("Jacky Zheng","Student")));
      log.info("Preloading" + repository.save(new Employee("Jacky Zheng2","Admin")));
    };
  }
}
