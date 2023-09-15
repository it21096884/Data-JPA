package com.DataJpa.demo.Entity;

import jakarta.persistence.Entity;

@Entity
public class Employee {
    private Long id;
    private String name;
    private String email;
    private String address;
}
