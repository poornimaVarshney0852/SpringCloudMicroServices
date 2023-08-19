package Spring.Cloud.Employee.Service.controller;

import Spring.Cloud.Employee.Service.dto.ApiResponseDto;
import Spring.Cloud.Employee.Service.dto.EmployeeDto;
import Spring.Cloud.Employee.Service.services.EmployeeServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employee")
@AllArgsConstructor
public class EmployeeControllers {

    private EmployeeServices employeeServices;

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee (@RequestBody EmployeeDto employeeDto){
        EmployeeDto saveEmployee = employeeServices.saveEmployee(employeeDto);

        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{Employee-Id}")
    public ResponseEntity<ApiResponseDto> getEmployeeById (@PathVariable("Employee-Id") Long empId){
        ApiResponseDto getEmployee = employeeServices.getEmployeeById(empId);

        return new ResponseEntity<>(getEmployee, HttpStatus.OK);
    }
}
