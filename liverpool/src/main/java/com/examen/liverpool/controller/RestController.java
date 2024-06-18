package com.examen.liverpool.controller;


import org.springframework.http.ResponseEntity;

public interface RestController {



    public ResponseEntity<Object> createInformation(String folio);

}
