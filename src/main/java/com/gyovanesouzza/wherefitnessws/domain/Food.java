package com.gyovanesouzza.wherefitnessws.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Objects;

@Entity
public class Food implements Serializable {

    private static final long serialVersionUID = 8254300774345914538L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String description;
    private Integer base_qty;
    private String base_unit;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attributes_id", foreignKey=@ForeignKey(name = "FK_Food_attributes"))
    private Attributes attributes;

    @JsonManagedReference
    @ManyToOne()
    @JoinColumn(name = "category_id", foreignKey=@ForeignKey(name = "FK_Food_category"))
    private Category category;

    public Food() {

    }

    public Food(Integer id, String description, Integer base_qty, String base_unit, Category category) {
        this.id = id;
        this.description = description;
        this.base_qty = base_qty;
        this.base_unit = base_unit;
        this.category = category;
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

