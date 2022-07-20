package com.carvia.pet.repo;

import com.carvia.pet.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
    Page<Student> findAll(Pageable pageable);
}
