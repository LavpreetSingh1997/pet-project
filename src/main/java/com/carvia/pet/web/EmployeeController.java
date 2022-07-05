package com.carvia.pet.web;

import com.carvia.pet.dto.EmpDto;
import com.carvia.pet.service.EmpService;
import com.carvia.pet.web.dto.RequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    @Autowired
    private EmpService empService;

    @PostMapping("/employee")
    public EmpDto saveEmp(@RequestBody RequestDto dto) {
        return empService.saveEmp(dto);
    }

    @PutMapping("employee/{employeeId}")
    public Optional<EmpDto> updateEmp(@PathVariable Long employeeId, @RequestBody RequestDto dto) {
        return empService.updateEmp(employeeId, dto);
    }

    @GetMapping("/employee")
    public List<EmpDto> getEmployees(@RequestParam(value = "mobile", required = false) String mobileFilter) {
        if (StringUtils.hasText(mobileFilter)) {
            EmpDto empByMobile = empService.getEmpByMobile(mobileFilter);
            if (empByMobile != null) {
                return asList(empByMobile);
            } else {
                return Collections.emptyList();
            }
        } else {
            return empService.getEmp();
        }
    }

    @GetMapping("employee/{employeeId}")
    public Optional<EmpDto> getEmployee(@PathVariable Long employeeId) {
        return empService.getEmpDetails(employeeId);
    }

    @DeleteMapping("employee/{employeeId}")
    public void deleteEmployee(@PathVariable Long employeeId) {
        empService.deleteEmployee(employeeId);
    }

}
