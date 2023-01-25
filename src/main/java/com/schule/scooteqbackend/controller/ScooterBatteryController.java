package com.schule.scooteqbackend.controller;

import com.schule.scooteqbackend.entity.ScooterBattery;
import com.schule.scooteqbackend.repository.ScooterBatteryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ScooterBatteryController {
    final ScooterBatteryRepository scooterBatteryRepository;
    @PostMapping("/saveBattery")
    @CrossOrigin
    public void saveBatteryscooter(@RequestBody ScooterBattery scooterBattery){

        ScooterBattery scooterBattery1 = new ScooterBattery();
        scooterBattery1.setBatteryStatus(scooterBattery.getBatteryStatus());
        scooterBatteryRepository.save(scooterBattery1);

        System.out.println("batt "+ scooterBattery1.getBatteryStatus());
    }
    @GetMapping("/getBattery")
    @CrossOrigin
    public int getScooterBatteryStatus(){
        return scooterBatteryRepository.getSqlBatteryStatus();
    }

}

