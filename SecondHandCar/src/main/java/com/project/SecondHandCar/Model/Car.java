package com.project.SecondHandCar.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Car")
public class Car {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int carid;
    private String model;
    private String variant;
    private String pricerange;
    private float kmtravelled;
    private int yearofmanufacturing;
    private int bodypoints;
    private int wheelpoints;
    private int enginepoints;
    private int batterypoints;
    private int overallpoints;
    
    

}
