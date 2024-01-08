package com.example.demo.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "users_table")
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
}
