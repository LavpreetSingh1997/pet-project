package com.carvia.pet.repo;

import com.carvia.pet.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepo extends JpaRepository<Candidate, Long> {
}
