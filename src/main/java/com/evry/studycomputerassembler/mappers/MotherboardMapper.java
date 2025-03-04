package com.evry.studycomputerassembler.mappers;

import com.evry.studycomputerassembler.entity.Motherboard;

import com.evry.studycomputerassembler.model.MotherboardDTO;
import org.mapstruct.Mapper;

/**
 */
@Mapper(componentModel = "spring")
public interface MotherboardMapper {
    MotherboardDTO toDto(Motherboard motherboard);
    Motherboard toEntity(MotherboardDTO dto);
}
