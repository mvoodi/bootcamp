package com.example.demo.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users_table")
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    private String name;

    private Integer age;
    private String course;


    public void setName(String name) {
        this.name = name;
    }
}
