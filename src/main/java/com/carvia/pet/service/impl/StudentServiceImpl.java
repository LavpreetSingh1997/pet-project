package com.carvia.pet.service.impl;

import com.carvia.pet.dto.StudentDto;
import com.carvia.pet.dto.StudentRequestDto;
import com.carvia.pet.entity.Student;
import com.carvia.pet.repo.StudentRepo;
import com.carvia.pet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public StudentDto saveStudent(StudentRequestDto dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setGender(dto.getGender());
        student.setMobile(dto.getMobile());
        student.setEmail(dto.getEmail());
        student.setAddress(dto.getAddress());
        studentRepo.save(student);
        return StudentDto.of(student);
    }

    @Override
    public List<StudentDto> getStudents() {
        return studentRepo.findAll().stream().map(StudentDto::of).collect(Collectors.toList());
    }

    @Override
    public Optional<StudentDto> getStudentDetails(Long studentId) {
        return studentRepo.findById(studentId).map(StudentDto::of);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepo.deleteById(studentId);
    }

    @Override
    public Optional<StudentDto> updateStudentDetails(Long studentId, StudentRequestDto dto) {
        return studentRepo.findById(studentId).map(student -> {
            student.setName(dto.getName());
            student.setGender(dto.getGender());
            student.setMobile(dto.getMobile());
            student.setEmail(dto.getEmail());
            student.setAddress(dto.getAddress());
            return StudentDto.of(studentRepo.save(student));
        });
    }
}
