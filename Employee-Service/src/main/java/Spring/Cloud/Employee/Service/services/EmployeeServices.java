package Spring.Cloud.Employee.Service.services;


import Spring.Cloud.Employee.Service.dto.ApiResponseDto;
import Spring.Cloud.Employee.Service.dto.EmployeeDto;

public interface EmployeeServices {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(Long id);
}
