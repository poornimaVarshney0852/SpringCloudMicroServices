package Spring.Cloud.Employee.Service.repository;


import Spring.Cloud.Employee.Service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee getEmployeeById(Long empId);
}
