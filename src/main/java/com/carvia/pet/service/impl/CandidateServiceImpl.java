package com.carvia.pet.service.impl;

import com.carvia.pet.dto.CandidateDto;
import com.carvia.pet.entity.Candidate;
import com.carvia.pet.repo.CandidateRepo;
import com.carvia.pet.service.CandidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@RequiredArgsConstructor()
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepo candiadateRepo;

    @Override
    public CandidateDto createCandidate(CandidateDto candidateDto){
        Candidate candidate = new Candidate();
        candidate.setName(candidate.getName());
        candidate.setDesignation(candidate.getDesignation());
        candidate.setCurrentCTC(candidate.getCurrentCTC());
        candidate.setExpectedCTC(candidate.getExpectedCTC());
        candidate.setManager(candidate.isManager());
        candidate.setExperience(candidate.getExperience());
        candiadateRepo.save(candidate);
        return CandidateDto.of(candidate);
    }

    @Override
    public List<CandidateDto> getCandidates(){
        return candiadateRepo.findAll().stream().map(CandidateDto::of).toList();
    }

}
