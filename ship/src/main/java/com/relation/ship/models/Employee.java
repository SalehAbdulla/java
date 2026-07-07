package com.relation.ship.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private Long employeeId;
    @Column(nullable = false, unique = true)
    private String identifier;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String birthDate;
    @Column(nullable = false)
    private String role;

    // Relationship between user -> address 1 <-> 1
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    // Relationship 1..* employee to department
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Relationship *..* employees to missions
    @ManyToMany()
    @JoinTable(
            name = "employee_mission",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "mission_id")
    )
    private List<Mission> missions;
}
