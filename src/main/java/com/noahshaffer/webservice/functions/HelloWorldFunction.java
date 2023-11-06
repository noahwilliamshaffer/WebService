package com.ethanpritchard.webservice.functions;

import com.amazonaws.services.lambda.runtime.Context;
import com.ethanpritchard.webservice.models.requests.HelloWorldRequest;
import com.ethanpritchard.webservice.models.responses.HelloWorldResponse;
import com.ethanpritchard.webservice.utils.ValidationUtils;
import com.google.common.base.Strings;

public class HelloWorldFunction extends Function<HelloWorldRequest, HelloWorldResponse> {
    @Override
    public HelloWorldResponse doRequest(HelloWorldRequest request, Context context) {
        return HelloWorldResponse.builder()
                .response("hello, " + request.getName() + "!")
                .build();
    }

    @Override
    public void validateRequest(HelloWorldRequest request, Context context) {
        ValidationUtils.validateRequest(request);
        if (Strings.isNullOrEmpty(request.getName())) {
            ValidationUtils.throwBadRequest("'name' cannot be null or empty.");
        }
    }
}
