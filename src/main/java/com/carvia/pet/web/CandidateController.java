package com.carvia.pet.web;

import com.carvia.pet.dto.CandidateDto;
import com.carvia.pet.service.CandidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor()
@RequestMapping("/candidate")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @PostMapping
    private CandidateDto createCandidate(@RequestBody CandidateDto candidateDto){
        return candidateService.createCandidate(candidateDto);
    }

    @GetMapping
    private List<CandidateDto> getCandidates(){
        return candidateService.getCandidates();
    }
}
