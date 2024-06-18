package com.examen.liverpool.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder

public class ResponseGeneral {

    private String ambiente;
    private Double version;

    private Object respuesta;
    private HttpStatus codeResponse;
}
