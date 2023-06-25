package com.example.tutoriumslm.controller;


import com.example.tutoriumslm.service.DateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class DateContoller {

    private final DateService dateservice;

    public DateContoller(DateService dateService){
        this.dateservice = dateService;
    }

    @GetMapping("/time")
    public LocalTime getTime(){
        return dateservice.getTime();
    }

    @GetMapping("/date")
    public String getDate(@RequestParam(required = false) String format){
        return dateservice.getDate(format);
    }
}
