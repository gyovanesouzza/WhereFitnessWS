package com.gyovanesouzza.wherefitnessws.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Meal implements Serializable {

    private static final long serialVersionUID = -5664045065571972869L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Boolean visibility;
    private String instructions;
    private String photo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "attributes_id", foreignKey = @ForeignKey(name = "FK_meal_attributes"))
    private Attribute attribute;

    @ManyToMany
    private Set<Food> foods = new HashSet<>();


    public Meal() {

    }

    public Meal(Integer id, String name, boolean visibility, String instructions, String photo) {
        this.id = id;
        this.name = name;
        this.visibility = visibility;
        this.instructions = instructions;
        this.photo = photo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Set<Food> getFoods() {
        return foods;
    }

    public void setFoods(Set<Food> foods) {
        this.foods = foods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return id == meal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", visibility=" + visibility +
                ", instructions='" + instructions + '\'' +
                ", photo='" + photo + '\'' +
                ", attribute=" + attribute +
                ", foods=" + foods +
                '}';
    }
}
