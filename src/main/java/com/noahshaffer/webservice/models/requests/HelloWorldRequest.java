package com.ethanpritchard.webservice.models.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@NoArgsConstructor
@Setter
@SuperBuilder
public class HelloWorldRequest extends Request {
    private String name;
}
