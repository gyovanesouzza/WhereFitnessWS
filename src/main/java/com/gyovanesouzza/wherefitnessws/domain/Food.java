package com.gyovanesouzza.wherefitnessws.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Food implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String description;
    private Integer base_qty;
    private String base_unit;
    private String barcode;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "attributes_id", foreignKey = @ForeignKey(name = "FK_Food_attributes"))
    private Attributes attributes;

    @ManyToOne()
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "FK_Food_category"))
    private Category category;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="meal_food",
            joinColumns={@JoinColumn(name="id_food")},
            inverseJoinColumns={@JoinColumn(name="id_meal")})
    private Set<Meal> meals = new HashSet<>();


    public Food() {

    }

    public Food(Integer id, String brand, String description, Integer base_qty, String base_unit, Category category,
                Attributes attributes) {
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.base_qty = base_qty;
        this.base_unit = base_unit;
        this.category = category;
        this.attributes = attributes;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBase_qty() {
        return base_qty;
    }

    public void setBase_qty(Integer base_qty) {
        this.base_qty = base_qty;
    }

    public String getBase_unit() {
        return base_unit;
    }

    public void setBase_unit(String base_unit) {
        this.base_unit = base_unit;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Meal> getMeals() {
        return meals;
    }

    public void setMeals(Set<Meal> meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", base_qty=" + base_qty +
                ", base_unit='" + base_unit + '\'' +
                ", attributes=" + attributes +
                ", categoria=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(id, food.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

