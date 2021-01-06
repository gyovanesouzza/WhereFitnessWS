package com.gyovanesouzza.wherefitnessws.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Meal implements Serializable {

    private static final long serialVersionUID = -5664045065571972869L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String instructions;

    public Meal() {

    }

    public Meal(int id, String name, String instructions) {
        this.id = id;
        this.name = name;
        this.instructions = instructions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }


}
