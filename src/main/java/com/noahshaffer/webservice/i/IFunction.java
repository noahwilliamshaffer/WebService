package com.ethanpritchard.webservice.i;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public interface IFunction<I extends IRequest, O extends IResponse>
        extends RequestHandler<I, O> {
    O doRequest(final I request, final Context context);
    void validateRequest(final I request, final Context context);
}
