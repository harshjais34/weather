package com.example.weather;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class weatherservice {
    @Autowired
    weatherRepository weatherRepository;
    public String addweather(Dto Dto){
        //Convert Dto to Entity layer for saving it into in database;
        weathermodel weathermodel1= weathermodel.builder().company_name(Dto.getCompany_name()).pincode_id(Dto.getpincode_id()).Date(Dto.getDate()).bulid();

        weatherRepository.save(weathermodel1);
        return "weather added succesfully";
}
