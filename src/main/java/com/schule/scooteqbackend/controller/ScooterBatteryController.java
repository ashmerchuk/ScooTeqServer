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
        ScooterBattery scooterBattery1;

        if(scooterBattery.getId() > 0 ){
            scooterBattery1 = scooterBatteryRepository.findById(scooterBattery.getId())
                    .orElseThrow(() -> new IllegalArgumentException(
                    String.format("can not found scooterBattery ID: "+scooterBattery.getId())
            ));
        }else{
            scooterBattery1 = new ScooterBattery();
        }


        scooterBattery1.setBatteryStatus(scooterBattery.getBatteryStatus());
        scooterBattery1.setBikeBatteryStatus(scooterBattery.getBikeBatteryStatus());
        scooterBatteryRepository.save(scooterBattery1);

    }
    @GetMapping("/getBattery")
    @CrossOrigin
    public ScooterBattery getScooterBatteryStatus(){

        return scooterBatteryRepository.getSqlBatteryStatus();
    }

}

