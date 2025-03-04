package com.evry.studycomputerassembler.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**

 */
@Entity
@Getter
@Setter
@Table(name = "processors")
public class Processor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "socket")
    private String socket;

    @Column(name = "base_clock")
    private String baseClock;

    @Column(name = "price")
    private BigDecimal price;

}
