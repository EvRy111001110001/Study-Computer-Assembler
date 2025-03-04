package com.evry.studycomputerassembler.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 */
@NoArgsConstructor
@Getter
@Setter
public class ProcessorDTO {
    @JsonIgnore
    private Long id;

    private String name;

    private String socket;

    private String baseClock;

    private BigDecimal price;
}
