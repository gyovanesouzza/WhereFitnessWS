package com.gyovanesouzza.wherefitnessws.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Recipe implements Serializable {


    private static final long serialVersionUID = -2175099707788317810L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name_recipe;
    private int portion;
    private Integer base_qty;
    private boolean visibility;
    private String instructions;
    private String photo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "attributes_id", foreignKey = @ForeignKey(name = "FK_recipe_attributes"))
    private Attribute attribute;

    @ManyToMany
    private Set<Food> foods = new HashSet<>();

    public Recipe(int id, String name_recipe, int portion, Integer base_qty, boolean visibility, String instructions, String photo) {
        this.id = id;
        this.name_recipe = name_recipe;
        this.portion = portion;
        this.base_qty = base_qty;
        this.visibility = visibility;
        this.instructions = instructions;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_recipe() {
        return name_recipe;
    }

    public void setName_recipe(String name_recipe) {
        this.name_recipe = name_recipe;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
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

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }

    public Integer getBase_qty() {
        return base_qty;
    }

    public void setBase_qty(Integer base_qty) {
        this.base_qty = base_qty;
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
        Recipe recipe = (Recipe) o;
        return id == recipe.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name_recipe='" + name_recipe + '\'' +
                ", portion=" + portion +
                ", base_qty=" + base_qty +
                ", visibility=" + visibility +
                ", instructions='" + instructions + '\'' +
                ", photo='" + photo + '\'' +
                ", attribute=" + attribute +
                ", foods=" + foods +
                '}';
    }
}
