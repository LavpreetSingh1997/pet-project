package com.carvia.pet.dto;

import com.carvia.pet.model.Employee;
import lombok.Data;

@Data
public class EmpDto {
        Long id;
        String name;
        String gender;

        public static EmpDto of(Employee entity){
            EmpDto dto=new EmpDto();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setGender(entity.getGender());
            return dto;
        }
}
