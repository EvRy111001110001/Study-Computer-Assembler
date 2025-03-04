package com.evry.studycomputerassembler.exception;

/**
 */
public class MotherboardException extends RuntimeException {
    public MotherboardException(String name) {
        super("Motherboard with " + name + " not found");
    }
}
