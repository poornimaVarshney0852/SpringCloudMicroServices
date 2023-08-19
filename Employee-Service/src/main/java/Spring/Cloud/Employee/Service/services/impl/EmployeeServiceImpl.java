package Spring.Cloud.Employee.Service.services.impl;

import Spring.Cloud.Employee.Service.dto.ApiResponseDto;
import Spring.Cloud.Employee.Service.dto.DepartmentDto;
import Spring.Cloud.Employee.Service.dto.EmployeeDto;
import Spring.Cloud.Employee.Service.entity.Employee;
import Spring.Cloud.Employee.Service.repository.EmployeeRepository;
import Spring.Cloud.Employee.Service.services.APIClient;
import Spring.Cloud.Employee.Service.services.EmployeeServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeServices {

    EmployeeRepository employeeRepository;
//    RestTemplate restTemplate;
//    WebClient webClient;
    APIClient apiClient;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getEmpName(),
                employeeDto.getEmpMail(),
                employeeDto.getDepartmentCode()
        );
        Employee saveEmployee = employeeRepository.save(employee);

        EmployeeDto saveEmployeeDto = new EmployeeDto(
                saveEmployee.getId(),
                saveEmployee.getEmpName(),
                saveEmployee.getEmpMail(),
                saveEmployee.getDepartmentCode()
        );
        return saveEmployeeDto;
    }

    @Override
    public ApiResponseDto getEmployeeById(Long id) {

        Employee getEmployee = employeeRepository.getEmployeeById(id);
//        ResponseEntity<DepartmentDto> responseEntity = restTemplate.getForEntity("http://localhost:8089/api/departments/"+getEmployee.getDepartmentCode(), DepartmentDto.class);
//        DepartmentDto departmentDto = responseEntity.getBody();

//        DepartmentDto departmentDto = webClient.get().uri("http://localhost:8089/api/departments/"+getEmployee.getDepartmentCode()).retrieve().bodyToMono(DepartmentDto.class).block();

        DepartmentDto departmentDto = apiClient.getDepartmentByCode(getEmployee.getDepartmentCode());

        EmployeeDto employeeDto = new EmployeeDto(
                getEmployee.getId(),
                getEmployee.getEmpName(),
                getEmployee.getEmpMail(),
                getEmployee.getDepartmentCode()
        );

        ApiResponseDto apiResponseDto = new ApiResponseDto();
        apiResponseDto.setEmployeeDto(employeeDto);
        apiResponseDto.setDepartmentDto(departmentDto);

        return apiResponseDto;
    }
}
