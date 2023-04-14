package com.carvia.pet.service;

import com.carvia.pet.dto.EmpDto;
import com.carvia.pet.entity.Employee;
import com.carvia.pet.web.dto.RequestDto;

import java.util.List;
import java.util.Optional;

public interface EmpService {
    EmpDto saveEmp(RequestDto dto);

    List<EmpDto> getEmp();

    Optional<EmpDto> getEmpDetails(Long empId);

    void deleteEmployee(Long empId);

    Optional<EmpDto> updateEmp(Long empId, RequestDto dto);

    EmpDto getEmpByMobile(String mobile);

    int getEmployeeCount();

    Optional<EmpDto> toggleManagerStatus(long employeeId);
}
