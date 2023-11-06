package com.ethanpritchard.webservice.models.responses;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class HelloWorldResponse extends Response {
    private String response;
}
