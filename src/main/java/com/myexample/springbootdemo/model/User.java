package com.myexample.springbootdemo.model;

import lombok.Data;

import javax.persistence.*;
/*Соединяем колонки в БД с кодом*/
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

}
