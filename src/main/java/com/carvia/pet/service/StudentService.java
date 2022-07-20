package com.carvia.pet.service;

import com.carvia.pet.dto.StudentDto;
import com.carvia.pet.dto.StudentRequestDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentDto saveStudent (StudentRequestDto dto);

    Page<StudentDto> getStudents(Pageable pageable);

    Optional<StudentDto> getStudentDetails(Long studentId);

    void deleteStudent(Long studentId);

    Optional<StudentDto> updateStudentDetails(Long studentId, StudentRequestDto dto);
}
