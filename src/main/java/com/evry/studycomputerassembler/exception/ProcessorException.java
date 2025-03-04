package com.evry.studycomputerassembler.exception;

/**
 */
public class ProcessorException extends RuntimeException {
    public ProcessorException(String name) {
        super("Processor with " + name + " not found");
    }
}
