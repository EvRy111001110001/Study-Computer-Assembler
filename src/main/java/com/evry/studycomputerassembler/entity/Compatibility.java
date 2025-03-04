package com.evry.studycomputerassembler.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**

 */
@Entity
@Getter
@Setter
@Table(name = "compatibility")
public class Compatibility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "processor_id", nullable = false)
    private Processor processor;

    @ManyToOne
    @JoinColumn(name = "motherboard_id", nullable = false)
    private Motherboard motherboard;
}
