package com.evry.studycomputerassembler.controllers;

import com.evry.studycomputerassembler.model.MotherboardDTO;
import com.evry.studycomputerassembler.model.ProcessorDTO;
import com.evry.studycomputerassembler.services.CompatibilityService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Tag(name = "Compatibility")
public class CompatibilityController {
    private final CompatibilityService compatibilityService;

    @Operation(summary = "search processor")
    @GetMapping("/search/processor")
    public ResponseEntity<Collection<MotherboardDTO>> searchProcessor(
            @PathVariable String processor,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        List<MotherboardDTO> motherboardPage = compatibilityService.searchProcessor(processor, page, size);
        return ResponseEntity.ok(motherboardPage);
    }

    @Operation(summary = "search motherboard")
    @GetMapping("/search/motherboard")
    public ResponseEntity<Collection<ProcessorDTO>> searchMotherboard(
            @PathVariable String motherboard,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        List<ProcessorDTO> processorPage = compatibilityService.searchMotherboard(motherboard, page, size);
        return ResponseEntity.ok(processorPage);
    }


}
