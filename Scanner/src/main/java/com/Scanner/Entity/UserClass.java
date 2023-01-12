package com.Scanner.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="user_details")
public class UserClass {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String firstName, lastName, email;
private int age;
}
