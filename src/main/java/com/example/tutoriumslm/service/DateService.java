package com.example.tutoriumslm.service;

import org.springframework.stereotype.Service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateService {

    public LocalTime getTime(){
        return LocalTime.now();
    }

    public String getDate(String format){
        //String weil DateTimeFormatter ein String ist --> STRG und drüber hoovern --> Dann siehst du Info über die Methode
        LocalDate localDate = LocalDate.now();
        if(format != null){
            //es wurde ein format übergeben
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
            return dtf.format(localDate);
        }
        //es wurde kein format übergeben
        return localDate.toString();
    }
}
