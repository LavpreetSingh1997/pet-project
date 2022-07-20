package com.carvia.pet.web;

import com.carvia.pet.dto.StudentDto;
import com.carvia.pet.dto.StudentRequestDto;
import com.carvia.pet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    private StudentDto saveStudent(@RequestBody StudentRequestDto dto){
       return studentService.saveStudent(dto);
    }

    @PutMapping("/{studentId}")
    private Optional<StudentDto> updateStudent(@PathVariable Long studentId, @RequestBody StudentRequestDto dto){
        return studentService.updateStudentDetails(studentId, dto);
    }

    @GetMapping
    private List<StudentDto> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/{studentId}")
    private Optional<StudentDto> getStudentDetails(@PathVariable Long studentId){
        return studentService.getStudentDetails(studentId);
    }

    @DeleteMapping("/{studentId}")
    private void deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
    }
}
