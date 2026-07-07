package com.relation.ship.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Mission {
    @Id
    private Long mission_id;
    private String period;

    @ManyToMany(mappedBy = "missions")
    private List<Employee> employees;
}
