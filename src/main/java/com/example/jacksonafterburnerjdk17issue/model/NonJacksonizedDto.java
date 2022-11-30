package com.example.jacksonafterburnerjdk17issue.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class NonJacksonizedDto {

    String data;

}
