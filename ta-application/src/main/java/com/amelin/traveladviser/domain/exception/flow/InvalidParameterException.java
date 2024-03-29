package com.amelin.traveladviser.domain.exception.flow;

import com.amelin.traveladviser.domain.exception.base.FlowException;

/**
 * Signals about incorrect parameter was passed to method/constructor
 * @author Mike Amelin
 */
public class InvalidParameterException extends FlowException {
    private static final long serialVersionUID = 4990959228756992926L;

    public InvalidParameterException(String message) {
        super(message);
    }
}
