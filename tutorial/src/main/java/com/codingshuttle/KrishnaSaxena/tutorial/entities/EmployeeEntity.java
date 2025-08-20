package com.codingshuttle.KrishnaSaxena.tutorial.entities;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;

    private LocalDate dateOfJoining;


    private boolean isActive;

}
