package com.carvia.pet.repo;

import com.carvia.pet.dto.EmpDto;
import com.carvia.pet.model.Employee;
import org.hibernate.cfg.annotations.reflection.internal.JPAXMLOverriddenAnnotationReader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Long> {
}
