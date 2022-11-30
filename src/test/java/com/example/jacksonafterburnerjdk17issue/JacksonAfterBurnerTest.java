package com.example.jacksonafterburnerjdk17issue;

import com.example.jacksonafterburnerjdk17issue.model.JacksonizedDto;
import com.example.jacksonafterburnerjdk17issue.model.NonJacksonizedDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class JacksonAfterBurnerTest {

    private final ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();

    @SneakyThrows
    @Test
    void shouldNotDeserializeJacksonizedBuilderDto() {
        assertThrows(IllegalAccessError.class,
                () -> objectMapper.readValue(
                        "{" +
                                "\"data\": \"jacksonized\"" +
                                "}",
                        JacksonizedDto.class));
    }

    @SneakyThrows
    @Test
    void shouldDeserializeNonJacksonizedBuilderDto() {
        objectMapper.readValue(
                "{" +
                        "\"data\": \"non-jacksonized\"" +
                        "}",
                NonJacksonizedDto.class);
    }
}
