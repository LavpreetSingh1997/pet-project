package com.carvia.pet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String designation;
    private double experience;
    private String currentCTC;
    private String expectedCTC;
    private boolean manager;


}
