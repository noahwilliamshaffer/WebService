package com.noahshaffer.functions;

//Functions: This folder likely contains your AWS Lambda function handlers.
// Each function should correspond to a specific task or API endpoint.

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldFunction implements RequestHandler<Object, String> {
    
    @Override
    public String handleRequest(Object input, Context context) {
        return "Hello, World!";
    }
}
