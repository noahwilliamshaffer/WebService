package com.ethanpritchard.webservice.models.responses;

import com.ethanpritchard.webservice.i.IResponse;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@SuperBuilder
public class Response implements IResponse {
    private Date date;
}
