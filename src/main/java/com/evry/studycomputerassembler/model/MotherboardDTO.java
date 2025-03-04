package com.evry.studycomputerassembler.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 */
@NoArgsConstructor
@Getter
@Setter
public class MotherboardDTO {
    @JsonIgnore
    private Long id;

    private String name;
    private String socket;
    private String chipset;
    private BigDecimal price;
}
