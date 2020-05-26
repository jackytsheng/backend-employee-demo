package payroll.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import payroll.services.Employee;
//import payroll.Controller.ArchivedFeature.Order;
//import payroll.Controller.ArchivedFeature.OrderRepository;
//import payroll.Controller.ArchivedFeature.Status;

@Configuration
@Slf4j
public class LoadDatabase {
  @Bean
//  CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository){
  CommandLineRunner initDatabase(EmployeeRepository repository){
  return args -> {
      log.info("Preloading" + repository.save(new Employee("Jacky"," Zheng","Student")));
      log.info("Preloading" + repository.save(new Employee("Jacky"," Zheng2","Admin")));
//      orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
//      orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));
//      orderRepository.findAll().forEach(order -> {
//        log.info("Preloaded " + order);
//      });
    };
  }
}
