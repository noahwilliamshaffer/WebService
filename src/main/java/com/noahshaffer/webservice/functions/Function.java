package com.ethanpritchard.webservice.functions;

import com.amazonaws.services.lambda.runtime.Context;
import com.ethanpritchard.webservice.i.IFunction;
import com.ethanpritchard.webservice.i.IRequest;
import com.ethanpritchard.webservice.i.IResponse;

public abstract class Function<I extends IRequest, O extends IResponse>
        implements IFunction<I, O> {
    public O handleRequest(I request, Context context) {
        validateRequest(request, context);
        return doRequest(request, context);
    }
}
