package com.DataJpa.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity(name="Employee")
@Table(
        name = "Employee",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_email_unique",columnNames = "email")

        }
)

@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"

    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name="name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"

    )
    private String email;

    @Column(
            name="address",
            nullable = false,
            columnDefinition = "TEXT"

    )
    private String address;
}
