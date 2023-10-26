package com.project.SecondHandCar.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="buyer")
public class Buyer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int buyerid;
private String firstname;
private String lastname;
private String email;
private String mobile;
private String address;
private String City;
private String pincode;
private String State;
private String password;
}
