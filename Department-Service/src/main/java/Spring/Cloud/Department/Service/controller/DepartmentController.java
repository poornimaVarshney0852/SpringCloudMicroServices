package Spring.Cloud.Department.Service.controller;

import Spring.Cloud.Department.Service.dto.DepartmentDto;
import Spring.Cloud.Department.Service.services.DepartmentServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentServices departmentServices;

    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment (@RequestBody DepartmentDto departmentDto){
        DepartmentDto saveDepartment = departmentServices.saveDepartment(departmentDto);

        return new ResponseEntity<>(saveDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode (@PathVariable("department-code") String departmentCode){
        DepartmentDto getDepartment = departmentServices.getDepartmentByCode(departmentCode);

        return new ResponseEntity<>(getDepartment, HttpStatus.OK);
    }
}
