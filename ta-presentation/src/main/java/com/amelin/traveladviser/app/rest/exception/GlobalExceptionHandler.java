package com.amelin.traveladviser.app.rest.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
/**
 * Global Jersey handler that catches any Exception-based errors
 * @author Mike Amelin
 */
public class GlobalExceptionHandler implements ExceptionMapper<Exception> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    private final Response SERVER_ERROR;

    public GlobalExceptionHandler() {
        this.SERVER_ERROR = Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
    }

    @Override
    public Response toResponse(Exception exception) {
        LOGGER.error(exception.getMessage(), exception);

        return SERVER_ERROR;
    }
}
