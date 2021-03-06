package com.gyovanesouzza.wherefitnessws.domain;

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
    private Attribute attribute;

    @ManyToOne()
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "FK_Food_category"))
    private Category category;



    public Food() {

    }

    public Food(Integer id, String brand, String description, Integer base_qty, String base_unit, Category category,
                Attribute attribute) {
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.base_qty = base_qty;
        this.base_unit = base_unit;
        this.category = category;
        this.attribute = attribute;
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

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", base_qty=" + base_qty +
                ", base_unit='" + base_unit + '\'' +
                ", attributes=" + attribute +
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

