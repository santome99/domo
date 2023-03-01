package com.sensors.domo.controller;

import com.sensors.domo.service.GetTemperatureDht11;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GetDataDht11Controller {

    private final GetTemperatureDht11 getTemperatureDht11;



    @GetMapping("/getTemperature")
    public ResponseEntity<?> getTemperatureDht11(){
        return new ResponseEntity<>(getTemperatureDht11.getTemperature2(), HttpStatus.OK);
    }

}
