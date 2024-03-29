package com.amelin.traveladviser.app.rest.service.base;

import javax.ws.rs.core.Response;

/**
 * Base class for all REST web-services
 * @author Mike Amelin
 */
public abstract class BaseResource {
    /**
     * Shared Response that should be returned if requested operation
     * returns no data
     */
    protected final Response NOT_FOUND;

    /**
     * Returned if client sends request in invalid or unsupported format
     */
    protected final Response BAD_REQUEST;

    public BaseResource() {
        this.NOT_FOUND = Response.status(Response.Status.NOT_FOUND).build();
        this.BAD_REQUEST = Response.status(Response.Status.BAD_REQUEST).build();
    }

    /**
     * Returns operation result as Response object
     * @param result
     * @return
     */
    protected Response ok(Object result) {
        return Response.ok(result).build();
    }
}
