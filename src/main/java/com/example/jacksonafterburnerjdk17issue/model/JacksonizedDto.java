package com.example.jacksonafterburnerjdk17issue.model;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder(toBuilder = true)
@Jacksonized
public class JacksonizedDto {

    String data;

}
