package com.examen.liverpool.model;



import lombok.Builder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Builder
public class Folio {

    private String folio;
    private LocalDateTime localDateTime;

    public String toInfo() {
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
        String timestampFormatted = timestamp.format(formatter);

        return folio + timestampFormatted;
    }
}
