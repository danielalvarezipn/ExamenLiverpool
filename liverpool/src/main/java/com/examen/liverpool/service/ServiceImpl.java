package com.examen.liverpool.service;


import com.examen.liverpool.model.Folio;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {


    @Override
    public Object giveFolio(String folio) {
        Folio folio1 = Folio.builder()
                .folio(folio)
                .build();
        return folio1.toInfo();
    }
}
