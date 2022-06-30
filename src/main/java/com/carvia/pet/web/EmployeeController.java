package com.carvia.pet.web;

import com.carvia.pet.dto.EmpDto;
import com.carvia.pet.service.EmpService;
import com.carvia.pet.web.dto.RequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    @Autowired
    private EmpService empService;

    @PostMapping("/emp/save")
    public EmpDto saveEmp(@RequestBody RequestDto dto){
       return empService.saveEmp(dto);
    }

    @PutMapping("emp/{empId}/update")
    public Optional<EmpDto> updateEmp(@PathVariable Long empId, @RequestBody RequestDto dto){
       return empService.updateEmp(empId,dto);
    }


    @GetMapping("/emp/fetch")
    public List<EmpDto> getEmployees(){
        return empService.getEmp();
    }

    @GetMapping("emp/{empId}")
    public Optional<EmpDto> getEmployee(@PathVariable Long empId){
        return empService.getEmpDetails(empId);
    }

    @DeleteMapping("emp/{empId}")
    public void deleteEmployee(@PathVariable Long empId){
        empService.deleteEmployee(empId);
    }

}
