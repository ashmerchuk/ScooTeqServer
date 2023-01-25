package com.schule.scooteqbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ScooterBattery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int batteryStatus;
    private int batteryStatus2;
}
