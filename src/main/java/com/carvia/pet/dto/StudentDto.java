package com.carvia.pet.dto;

import com.carvia.pet.entity.Student;
import lombok.Data;

@Data
public class StudentDto {
    Long id;
    String name;
    String gender;
    String mobile;
    String email;
    String address;

    public static StudentDto of(Student student){
        StudentDto dto = new StudentDto();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setGender(student.getGender());
        dto.setMobile(student.getMobile());
        dto.setEmail(student.getEmail());
        dto.setAddress(student.getAddress());
        return dto;
    }
}
