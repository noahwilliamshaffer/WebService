package com.noahwilliamshaffer;

public class App {
    public static void main(String[] args) {
        // instance of your Lambda handler
        UserRegistrationHandler handler = new UserRegistrationHandler();

        // request object
        UserRegistrationRequest request = new UserRegistrationRequest();
        request.setUsername("testuser");
        request.setEmail("testuser@example.com");
        request.setPassword("password123");

        //  handler method with the mock request
        UserRegistrationResponse response = handler.handleRequest(request, null);

        // Output the response
        System.out.println(response.getMessage());
    }
}