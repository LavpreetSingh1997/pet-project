package com.carvia.pet.dto;

import com.carvia.pet.entity.Employee;
import lombok.Data;

@Data
public class EmpDto {
        Long id;
        String name;
        String gender;
        String mobile;
        boolean isManager;
        String emailAddress;

        public static EmpDto of(Employee entity){
            EmpDto dto=new EmpDto();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setGender(entity.getGender());
            dto.setMobile(entity.getMobile());
            dto.setManager(entity.isManager());
            dto.setEmailAddress(entity.getEmailAddress());
            return dto;
        }
}
