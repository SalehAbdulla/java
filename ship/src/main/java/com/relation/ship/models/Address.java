package com.relation.ship.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    private Long address_id;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String houseNumber;
    @Column(nullable = false)
    private String zipCode;

    // Relationship non-owner 1 <-> 1 Employee -> Address
    @OneToOne(mappedBy = "address")
    private Employee employee;
}
