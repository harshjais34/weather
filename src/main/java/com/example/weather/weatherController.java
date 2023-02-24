package com.example.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")


public class weatherController {
    @Autowired
    weatherservice weatherservice;

    @PostMapping("/weather")
    public String weather(@RequestBody Dto Dto){
        return  weatherservice.addweather(Dto);
    }



}
