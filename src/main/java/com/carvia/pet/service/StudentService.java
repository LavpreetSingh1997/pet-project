package com.carvia.pet.service;

import com.carvia.pet.dto.StudentDto;
import com.carvia.pet.dto.StudentRequestDto;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentDto saveStudent (StudentRequestDto dto);

    List<StudentDto> getStudents();

    Optional<StudentDto> getStudentDetails(Long studentId);

    void deleteStudent(Long studentId);

    Optional<StudentDto> updateStudentDetails(Long studentId, StudentRequestDto dto);
}
