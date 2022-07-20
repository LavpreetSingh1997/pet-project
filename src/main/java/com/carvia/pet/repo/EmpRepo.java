package com.carvia.pet.repo;

import com.carvia.pet.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmpRepo extends JpaRepository<Employee, Long> {
    @Query(value = "select p from Employee p where p.mobile = :mobile")
    Optional<Employee> searchByMobile (String mobile);

}
