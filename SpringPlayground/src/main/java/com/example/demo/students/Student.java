package com.example.demo.students;

import javax.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int standard;
    private DivisionEnum division;

    public Student() {
    }

    public Student(String name, int standard, DivisionEnum division) {
        this.name = name;
        this.standard = standard;
        this.division = division;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", standard=" + standard +
                ", division=" + division +
                '}';
    }

    public String toJSON() {
        return "{" +
                "'id':" + id +
                ", 'name':" + name + '\'' +
                ", 'standard':" + standard +
                ", 'division':" + division +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getStandard() {
        return standard;
    }

    public Student setStandard(int standard) {
        this.standard = standard;
        return this;
    }

    public DivisionEnum getDivision() {
        return division;
    }

    public Student setDivision(DivisionEnum division) {
        this.division = division;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }
}