package com.evry.studycomputerassembler.services;

import com.evry.studycomputerassembler.entity.Motherboard;
import com.evry.studycomputerassembler.entity.Processor;
import com.evry.studycomputerassembler.exception.MotherboardException;
import com.evry.studycomputerassembler.exception.ProcessorException;
import com.evry.studycomputerassembler.mappers.MotherboardMapper;
import com.evry.studycomputerassembler.mappers.ProcessorMapper;
import com.evry.studycomputerassembler.model.MotherboardDTO;
import com.evry.studycomputerassembler.model.ProcessorDTO;
import com.evry.studycomputerassembler.repositories.CompatibilityRepository;
import com.evry.studycomputerassembler.repositories.MotherboardRepository;
import com.evry.studycomputerassembler.repositories.ProcessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

/**

 */
@Service
@RequiredArgsConstructor
public class CompatibilityService {
    private final CompatibilityRepository compatibilityRepository;
    private final MotherboardRepository motherboardRepository;
    private final ProcessorRepository processorRepository;
    private final ProcessorMapper processorMapper;
    private final MotherboardMapper motherboardMapper;

    public List<MotherboardDTO> searchProcessor(String nameProcessor, int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        Processor processor = processorRepository.findByName(nameProcessor)
                .orElseThrow(() -> new ProcessorException(nameProcessor));
        Page<Motherboard> motherboardPage = compatibilityRepository.findAllWithProcessor(processor.getId(), pageable);
        return motherboardPage.getContent()
                .stream()
                .map(motherboardMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<ProcessorDTO> searchMotherboard(String nameMotherboard, int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        Motherboard motherboard = motherboardRepository.findByName(nameMotherboard)
                .orElseThrow(() -> new MotherboardException(nameMotherboard));
        Page<Processor> processorPage = compatibilityRepository.findAllWithMotherboard(motherboard.getId(), pageable);
        return processorPage.getContent()
                .stream()
                .map(processorMapper::toDto)
                .collect(Collectors.toList());
    }
}
