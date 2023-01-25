package com.schule.scooteqbackend.repository;

import com.schule.scooteqbackend.entity.ScooterBattery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ScooterBatteryRepository extends JpaRepository<ScooterBattery, Long> {
    @Query(
           value = " select battery_status from scooter_battery ORDER BY ID DESC LIMIT 1 ",
           nativeQuery = true
    )
    int getSqlBatteryStatus();

}
