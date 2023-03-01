package com.example.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")


public class weatherController {
    @Autowired
    weatherservice weatherservice;

    @GetMapping("/weatherById")
    public ResponseEntity getweatherBypincode_id(@RequestParam("picode_id") Dto id) {
        weatherservice.addweather(id);
        return new ResponseEntity<>("weather details printed successfully ", HttpStatus.OK);
    }

    public ResponseEntity<weathermodel> addpincode(@RequestParam Dto id) {
        weatherservice.postweather(id);
        return new ResponseEntity<>("weather post successfully ", HttpStatus.OK);
    }
    @DeleteMapping("/weather/{pincode_Id}/delete")
    public ResponseEntity<weathermodel> deleteSpot(@PathVariable int pincod_id) {
        weatherservice.deleteweather(pincod_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{weatherId}/waether/{weatherId}/update")
    public ResponseEntity<weathermodel> updateSpot(@PathVariable int pincode_id) {
        weathermodel updatedSpot=weatherservice.updateweather( pincode_id);
        return new ResponseEntity<>(updatedSpot, HttpStatus.OK);
    }
}



