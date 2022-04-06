package com.example.demo.city;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table
public class City {
    private Long id;
    private String name;
    private int population;
    @CreationTimestamp
    @Column(name="timestamp", nullable = false, updatable = false, insertable = false)
    private Timestamp timestamp;

    public City() {}

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }


    public City(int population) {
        this.population = population;
    }

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setName(String name) {
        this.name = name;
    }
}
