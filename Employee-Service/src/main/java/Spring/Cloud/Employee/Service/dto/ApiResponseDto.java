package Spring.Cloud.Employee.Service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ApiResponseDto {
    private EmployeeDto employeeDto;
    private DepartmentDto departmentDto;
}
