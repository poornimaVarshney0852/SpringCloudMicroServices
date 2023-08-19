package Spring.Cloud.Department.Service.services;


import Spring.Cloud.Department.Service.dto.DepartmentDto;

public interface DepartmentServices {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String departmentCode);
}
