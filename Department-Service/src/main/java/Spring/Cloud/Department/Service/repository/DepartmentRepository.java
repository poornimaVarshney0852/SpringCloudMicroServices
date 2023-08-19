package Spring.Cloud.Department.Service.repository;

import Spring.Cloud.Department.Service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String departmentCode);
}
