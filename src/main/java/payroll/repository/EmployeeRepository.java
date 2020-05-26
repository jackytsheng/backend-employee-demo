package payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.services.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
