package com.noahwilliamshaffer;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class UserRegistrationHandler implements RequestHandler<YourRequestClass, YourResponseClass> {
    public YourResponseClass handleRequest(YourRequestClass request, Context context) {
        // Your logic here
        return new YourResponseClass();
    }
}

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
