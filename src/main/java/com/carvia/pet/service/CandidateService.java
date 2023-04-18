package com.carvia.pet.service;

import com.carvia.pet.dto.CandidateDto;

import java.util.List;

public interface CandidateService {
    CandidateDto createCandidate(CandidateDto candidateDto);

    List<CandidateDto> getCandidates();
}
