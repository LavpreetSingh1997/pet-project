package com.carvia.pet.service;

import com.carvia.pet.dto.EmpDto;
import com.carvia.pet.web.dto.RequestDto;

import java.util.List;
import java.util.Optional;

public interface EmpService {
    public EmpDto saveEmp(RequestDto dto);

    public List<EmpDto> getEmp();

    public Optional<EmpDto> getEmpDetails(Long empId);

    public void deleteEmployee(Long empId);

    public Optional<EmpDto> updateEmp(Long empId, RequestDto dto);
}
