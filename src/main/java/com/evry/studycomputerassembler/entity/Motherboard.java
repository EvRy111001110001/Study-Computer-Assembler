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
@Table(name = "motherboards")
public class Motherboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "socket")
    private String socket;

    @Column(name = "chipset")
    private String chipset;

    @Column(name = "price")
    private BigDecimal price;
}
