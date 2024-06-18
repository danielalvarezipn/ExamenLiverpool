package com.examen.liverpool.controller;

import com.examen.liverpool.service.Service;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.web.bind.annotation.RestController
public class RestControllerImpl implements RestController{
    @Autowired
    Service service;

    @GetMapping("/consulta")
    @Override
    public ResponseEntity<Object> createInformation(@RequestParam(required = true) String folio) {
        String folioService = (String) service.giveFolio(folio);
        return new ResponseEntity<>(folioService, HttpStatus.OK);
    }
}
