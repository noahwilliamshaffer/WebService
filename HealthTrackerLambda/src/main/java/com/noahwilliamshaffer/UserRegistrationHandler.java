package com.noahwilliamshaffer;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class UserRegistrationHandler implements RequestHandler<UserRegistrationRequest, UserRegistrationResponse> {
    public UserRegistrationResponse handleRequest(UserRegistrationRequest request, Context context) {
        // logic here
        return new UserRegistrationResponse("User registered successfully");
    }
}