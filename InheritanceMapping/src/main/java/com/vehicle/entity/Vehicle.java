package com.vehicle.entity;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy=InheritanceType.JOINED)

public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vid;
	@Column(length=10)
	private String fuel;
	@Column(length=10)
	private String enginepower;
	@Column(length=4)
	private int speed;
	@Column(length=10)
	private String vtype;
	@Column(length=4)
	private int price;
	
}
