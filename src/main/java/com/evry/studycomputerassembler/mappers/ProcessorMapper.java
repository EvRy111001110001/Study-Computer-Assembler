package com.evry.studycomputerassembler.mappers;

import com.evry.studycomputerassembler.entity.Processor;
import com.evry.studycomputerassembler.model.ProcessorDTO;
import org.mapstruct.Mapper;

/**
 */
@Mapper(componentModel = "spring")
public interface ProcessorMapper {
    ProcessorDTO toDto(Processor processor);
    Processor toEntity(ProcessorDTO dto);
}
