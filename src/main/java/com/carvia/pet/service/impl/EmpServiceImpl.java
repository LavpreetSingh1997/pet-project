package com.carvia.pet.service.impl;

import com.carvia.pet.dto.EmpDto;
import com.carvia.pet.model.Employee;
import com.carvia.pet.repo.EmpRepo;
import com.carvia.pet.service.EmpService;
import com.carvia.pet.web.dto.RequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmpServiceImpl implements EmpService {
    @Autowired
    private  EmpRepo repo;

    @Override
    public EmpDto saveEmp(RequestDto dto) {
        Employee emp=new Employee();
        emp.setName(dto.getName());
        emp.setGender(dto.getGender());
        emp.setEmailAddress(dto.getEmailAddress());
        emp.setMobile(dto.getMobile());
        repo.save(emp);
        return EmpDto.of(emp);
    }

    @Override
    public List<EmpDto> getEmp() {
        return repo.findAll().stream().map(EmpDto::of).collect(Collectors.toList());
    }

    @Override
    public Optional<EmpDto> getEmpDetails(Long empId) {
        return repo.findById(empId).map(EmpDto::of);
    }

    @Override
    public void deleteEmployee(Long empId) {
        repo.deleteById(empId);
    }

    @Override
    public Optional<EmpDto> updateEmp(Long empId, RequestDto dto) {
        return repo.findById(empId).map(employee ->{
            employee.setName(dto.getName());
            employee.setGender(dto.getGender());
            return EmpDto.of(repo.save(employee));
        });
    }

    @Override
    public EmpDto getEmpByMobile(String mobile) {
        return repo.searchByMobile(mobile).map(employee -> EmpDto.of(employee)).orElse(null);
    }
}
