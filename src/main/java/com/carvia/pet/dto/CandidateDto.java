package com.carvia.pet.dto;

import com.carvia.pet.entity.Candidate;
import lombok.Data;

@Data
public class CandidateDto {
    Long id;
    String name;
    String designation;
    double experience;
    String currentCTC;
    String expectedCTC;
    boolean manager;

    public static CandidateDto of(Candidate candidate){
        CandidateDto candidateDto = new CandidateDto();
        candidateDto.setId(candidate.getId());
        candidateDto.setName(candidateDto.getName());
        candidateDto.setExperience(candidateDto.getExperience());
        candidateDto.setManager(candidateDto.isManager());
        candidateDto.setDesignation(candidateDto.getDesignation());
        candidateDto.setCurrentCTC(candidateDto.getCurrentCTC());
        candidateDto.setExpectedCTC(candidate.getExpectedCTC());
        return candidateDto;
    }
}
