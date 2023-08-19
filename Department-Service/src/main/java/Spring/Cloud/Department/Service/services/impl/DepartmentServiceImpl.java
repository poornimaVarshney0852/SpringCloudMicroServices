package Spring.Cloud.Department.Service.services.impl;

import Spring.Cloud.Department.Service.dto.DepartmentDto;
import Spring.Cloud.Department.Service.entity.Department;
import Spring.Cloud.Department.Service.repository.DepartmentRepository;
import Spring.Cloud.Department.Service.services.DepartmentServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentServices {

    private DepartmentRepository departmentRepository;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDis(),
                departmentDto.getDepartmentCode()
        );
        Department saveDepartment = departmentRepository.save(department);

        DepartmentDto saveDepartmentDto = new DepartmentDto(
                saveDepartment.getId(),
                saveDepartment.getDepartmentName(),
                saveDepartment.getDepartmentDis(),
                saveDepartment.getDepartmentCode()
        );
        return saveDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto = new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentCode(),
                department.getDepartmentDis()
        );
        return departmentDto;
    }
}
