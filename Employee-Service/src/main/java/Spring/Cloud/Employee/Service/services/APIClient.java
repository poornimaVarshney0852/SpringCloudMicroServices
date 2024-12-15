package Spring.Cloud.Employee.Service.services;

import Spring.Cloud.Employee.Service.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(url = "http://host.docker.internal:8084/api/departments", value = "DEPARTMENT-SERVICE")

//@FeignClient(name = "DEPARTMENT-SERVICE",path = "http://localhost:8084/")
public interface APIClient {
    @GetMapping("{department-code}")
    DepartmentDto getDepartmentByCode (@PathVariable("department-code") String departmentCode);
}
