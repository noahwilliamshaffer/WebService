package com.ethanpritchard.webservice.utils;

import com.ethanpritchard.webservice.i.IRequest;

import java.util.Objects;

public class ValidationUtils {
    public static void throwBadRequest(final String message) {
        throw new RuntimeException("[400] " + message);
    }

    public static void validateRequest(final IRequest request) {
        if (Objects.isNull(request)) {
            ValidationUtils.throwBadRequest("Request is null.");
        }
    }
}
