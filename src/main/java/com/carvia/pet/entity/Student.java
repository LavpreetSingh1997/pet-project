package com.carvia.pet.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.Instant;

@Setter
@Getter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private long id;
    private String name;
    private String gender;
    @Column(length = 10)
    private String mobile;
    private String email;
    private String address;
    private Instant createdOn;
    private Instant updatedOn;
}
