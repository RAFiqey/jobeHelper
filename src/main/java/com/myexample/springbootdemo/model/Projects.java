package com.myexample.springbootdemo.model;

import lombok.Data;

import javax.persistence.*;

/*Подключаю таблицу Projects  */
@Data
@Entity
@Table(name= "projects" )
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "num_dogovor")
    private String num_dogovor;
    @Column(name = "month_dogovor")
    private String month_dogovor;
    @Column(name = "date_dogovor")
    private String date_dogovor;
    @Column(name = "name_adress")
    private String name_adress;
    @Column(name = "gotovnost")
    private String gotovnost;
    @Column(name = "cash")
    private String cash;
    @Column(name = "type_project")
    private String type_project;
    @Column(name = " buhg")
    private String  buhg;
    @Column(name = "comm")
    private String comm;

}
