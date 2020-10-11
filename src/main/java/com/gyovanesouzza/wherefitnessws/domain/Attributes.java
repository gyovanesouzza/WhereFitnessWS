package com.gyovanesouzza.wherefitnessws.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Attributes implements Serializable {
    private static final long serialVersionUID = 4025489455635149860L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double humidity_qty;
    private String humidity_unit;
    private Double protein_qty;
    private String protein_unit;
    private Double lipid_qty;
    private String lipid_unit;
    private Double cholesterol_qty;
    private String cholesterol_unit;
    private Double carbohydrate_qty;
    private String carbohydrate_unit;
    private Double fiber_qty;
    private String fiber_unit;
    private Double ashes_qty;
    private String ashes_unit;
    private Double calcium_qty;
    private String calcium_unit;
    private Double _qty;
    private String _unit;
    private Double magnesium_qty;
    private String magnesium_unit;
    private Double phosphorus_qty;
    private String phosphorus_unit;
    private Double iron_qty;
    private String iron_unit;
    private Double sodium_qty;
    private String sodium_unit;
    private Double potassium_qty;
    private String potassium_unit;
    private Double thiamine_qty;
    private String thiamine_unit;
    private Double riboflavin_qty;
    private String riboflavin_unit;
    private Double pyridoxine_qty;
    private String pyridoxine_unit;
    private Double niacin_qty;
    private String niacin_unit;
    private Double manganese_qty;
    private String manganese_unit;
    private Double retinol_qty;
    private String retinol_unit;
    private Double energy_kcal;
    private String energy_kj;
    private Double fattyAcids_saturated_qty;
    private String fattyAcids_saturated_unit;
    private Double fattyAcids_monounsaturated_qty;
    private String fattyAcids_monounsaturated_unit;
    private Double fattyAcids_polyunsaturated_qty;
    private String fattyAcids_polyunsaturatedunit;

    @OneToOne(mappedBy = "attributes")
    private Food food;

    public Attributes() {

    }

    public Attributes(Integer id, Double humidity_qty, String humidity_unit, Double protein_qty, String protein_unit, Double lipid_qty, String lipid_unit,
                      Double cholesterol_qty, String cholesterol_unit, Double carbohydrate_qty, String carbohydrate_unit, Double fiber_qty, String fiber_unit,
                      Double ashes_qty, String ashes_unit, Double calcium_qty, String calcium_unit, Double _qty, String _unit, Double magnesium_qty,
                      String magnesium_unit, Double phosphorus_qty, String phosphorus_unit, Double iron_qty, String iron_unit, Double sodium_qty, String sodium_unit,
                      Double potassium_qty, String potassium_unit, Double thiamine_qty, String thiamine_unit, Double riboflavin_qty, String riboflavin_unit, Double pyridoxine_qty,
                      String pyridoxine_unit, Double niacin_qty, String niacin_unit, Double manganese_qty, String manganese_unit, Double retinol_qty, String retinol_unit,
                      Double energy_kcal, String energy_kj, Double fattyAcids_saturated_qty, String fattyAcids_saturated_unit, Double fattyAcids_monounsaturated_qty,
                      String fattyAcids_monounsaturated_unit, Double fattyAcids_polyunsaturated_qty, String fattyAcids_polyunsaturatedunit) {

        this.id = id;
        this.humidity_qty = humidity_qty;
        this.humidity_unit = humidity_unit;
        this.protein_qty = protein_qty;
        this.protein_unit = protein_unit;
        this.lipid_qty = lipid_qty;
        this.lipid_unit = lipid_unit;
        this.cholesterol_qty = cholesterol_qty;
        this.cholesterol_unit = cholesterol_unit;
        this.carbohydrate_qty = carbohydrate_qty;
        this.carbohydrate_unit = carbohydrate_unit;
        this.fiber_qty = fiber_qty;
        this.fiber_unit = fiber_unit;
        this.ashes_qty = ashes_qty;
        this.ashes_unit = ashes_unit;
        this.calcium_qty = calcium_qty;
        this.calcium_unit = calcium_unit;
        this._qty = _qty;
        this._unit = _unit;
        this.magnesium_qty = magnesium_qty;
        this.magnesium_unit = magnesium_unit;
        this.phosphorus_qty = phosphorus_qty;
        this.phosphorus_unit = phosphorus_unit;
        this.iron_qty = iron_qty;
        this.iron_unit = iron_unit;
        this.sodium_qty = sodium_qty;
        this.sodium_unit = sodium_unit;
        this.potassium_qty = potassium_qty;
        this.potassium_unit = potassium_unit;
        this.thiamine_qty = thiamine_qty;
        this.thiamine_unit = thiamine_unit;
        this.riboflavin_qty = riboflavin_qty;
        this.riboflavin_unit = riboflavin_unit;
        this.pyridoxine_qty = pyridoxine_qty;
        this.pyridoxine_unit = pyridoxine_unit;
        this.niacin_qty = niacin_qty;
        this.niacin_unit = niacin_unit;
        this.manganese_qty = manganese_qty;
        this.manganese_unit = manganese_unit;
        this.retinol_qty = retinol_qty;
        this.retinol_unit = retinol_unit;
        this.energy_kcal = energy_kcal;
        this.energy_kj = energy_kj;
        this.fattyAcids_saturated_qty = fattyAcids_saturated_qty;
        this.fattyAcids_saturated_unit = fattyAcids_saturated_unit;
        this.fattyAcids_monounsaturated_qty = fattyAcids_monounsaturated_qty;
        this.fattyAcids_monounsaturated_unit = fattyAcids_monounsaturated_unit;
        this.fattyAcids_polyunsaturated_qty = fattyAcids_polyunsaturated_qty;
        this.fattyAcids_polyunsaturatedunit = fattyAcids_polyunsaturatedunit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getHumidity_qty() {
        return humidity_qty;
    }

    public void setHumidity_qty(Double humidity_qty) {
        this.humidity_qty = humidity_qty;
    }

    public String getHumidity_unit() {
        return humidity_unit;
    }

    public void setHumidity_unit(String humidity_unit) {
        this.humidity_unit = humidity_unit;
    }

    public Double getProtein_qty() {
        return protein_qty;
    }

    public void setProtein_qty(Double protein_qty) {
        this.protein_qty = protein_qty;
    }

    public String getProtein_unit() {
        return protein_unit;
    }

    public void setProtein_unit(String protein_unit) {
        this.protein_unit = protein_unit;
    }

    public Double getLipid_qty() {
        return lipid_qty;
    }

    public void setLipid_qty(Double lipid_qty) {
        this.lipid_qty = lipid_qty;
    }

    public String getLipid_unit() {
        return lipid_unit;
    }

    public void setLipid_unit(String lipid_unit) {
        this.lipid_unit = lipid_unit;
    }

    public Double getCholesterol_qty() {
        return cholesterol_qty;
    }

    public void setCholesterol_qty(Double cholesterol_qty) {
        this.cholesterol_qty = cholesterol_qty;
    }

    public String getCholesterol_unit() {
        return cholesterol_unit;
    }

    public void setCholesterol_unit(String cholesterol_unit) {
        this.cholesterol_unit = cholesterol_unit;
    }

    public Double getCarbohydrate_qty() {
        return carbohydrate_qty;
    }

    public void setCarbohydrate_qty(Double carbohydrate_qty) {
        this.carbohydrate_qty = carbohydrate_qty;
    }

    public String getCarbohydrate_unit() {
        return carbohydrate_unit;
    }

    public void setCarbohydrate_unit(String carbohydrate_unit) {
        this.carbohydrate_unit = carbohydrate_unit;
    }

    public Double getFiber_qty() {
        return fiber_qty;
    }

    public void setFiber_qty(Double fiber_qty) {
        this.fiber_qty = fiber_qty;
    }

    public String getFiber_unit() {
        return fiber_unit;
    }

    public void setFiber_unit(String fiber_unit) {
        this.fiber_unit = fiber_unit;
    }

    public Double getAshes_qty() {
        return ashes_qty;
    }

    public void setAshes_qty(Double ashes_qty) {
        this.ashes_qty = ashes_qty;
    }

    public String getAshes_unit() {
        return ashes_unit;
    }

    public void setAshes_unit(String ashes_unit) {
        this.ashes_unit = ashes_unit;
    }

    public Double getCalcium_qty() {
        return calcium_qty;
    }

    public void setCalcium_qty(Double calcium_qty) {
        this.calcium_qty = calcium_qty;
    }

    public String getCalcium_unit() {
        return calcium_unit;
    }

    public void setCalcium_unit(String calcium_unit) {
        this.calcium_unit = calcium_unit;
    }

    public Double get_qty() {
        return _qty;
    }

    public void set_qty(Double _qty) {
        this._qty = _qty;
    }

    public String get_unit() {
        return _unit;
    }

    public void set_unit(String _unit) {
        this._unit = _unit;
    }

    public Double getMagnesium_qty() {
        return magnesium_qty;
    }

    public void setMagnesium_qty(Double magnesium_qty) {
        this.magnesium_qty = magnesium_qty;
    }

    public String getMagnesium_unit() {
        return magnesium_unit;
    }

    public void setMagnesium_unit(String magnesium_unit) {
        this.magnesium_unit = magnesium_unit;
    }

    public Double getPhosphorus_qty() {
        return phosphorus_qty;
    }

    public void setPhosphorus_qty(Double phosphorus_qty) {
        this.phosphorus_qty = phosphorus_qty;
    }

    public String getPhosphorus_unit() {
        return phosphorus_unit;
    }

    public void setPhosphorus_unit(String phosphorus_unit) {
        this.phosphorus_unit = phosphorus_unit;
    }

    public Double getIron_qty() {
        return iron_qty;
    }

    public void setIron_qty(Double iron_qty) {
        this.iron_qty = iron_qty;
    }

    public String getIron_unit() {
        return iron_unit;
    }

    public void setIron_unit(String iron_unit) {
        this.iron_unit = iron_unit;
    }

    public Double getSodium_qty() {
        return sodium_qty;
    }

    public void setSodium_qty(Double sodium_qty) {
        this.sodium_qty = sodium_qty;
    }

    public String getSodium_unit() {
        return sodium_unit;
    }

    public void setSodium_unit(String sodium_unit) {
        this.sodium_unit = sodium_unit;
    }

    public Double getPotassium_qty() {
        return potassium_qty;
    }

    public void setPotassium_qty(Double potassium_qty) {
        this.potassium_qty = potassium_qty;
    }

    public String getPotassium_unit() {
        return potassium_unit;
    }

    public void setPotassium_unit(String potassium_unit) {
        this.potassium_unit = potassium_unit;
    }

    public Double getThiamine_qty() {
        return thiamine_qty;
    }

    public void setThiamine_qty(Double thiamine_qty) {
        this.thiamine_qty = thiamine_qty;
    }

    public String getThiamine_unit() {
        return thiamine_unit;
    }

    public void setThiamine_unit(String thiamine_unit) {
        this.thiamine_unit = thiamine_unit;
    }

    public Double getRiboflavin_qty() {
        return riboflavin_qty;
    }

    public void setRiboflavin_qty(Double riboflavin_qty) {
        this.riboflavin_qty = riboflavin_qty;
    }

    public String getRiboflavin_unit() {
        return riboflavin_unit;
    }

    public void setRiboflavin_unit(String riboflavin_unit) {
        this.riboflavin_unit = riboflavin_unit;
    }

    public Double getPyridoxine_qty() {
        return pyridoxine_qty;
    }

    public void setPyridoxine_qty(Double pyridoxine_qty) {
        this.pyridoxine_qty = pyridoxine_qty;
    }

    public String getPyridoxine_unit() {
        return pyridoxine_unit;
    }

    public void setPyridoxine_unit(String pyridoxine_unit) {
        this.pyridoxine_unit = pyridoxine_unit;
    }

    public Double getNiacin_qty() {
        return niacin_qty;
    }

    public void setNiacin_qty(Double niacin_qty) {
        this.niacin_qty = niacin_qty;
    }

    public String getNiacin_unit() {
        return niacin_unit;
    }

    public void setNiacin_unit(String niacin_unit) {
        this.niacin_unit = niacin_unit;
    }

    public Double getManganese_qty() {
        return manganese_qty;
    }

    public void setManganese_qty(Double manganese_qty) {
        this.manganese_qty = manganese_qty;
    }

    public String getManganese_unit() {
        return manganese_unit;
    }

    public void setManganese_unit(String manganese_unit) {
        this.manganese_unit = manganese_unit;
    }

    public Double getRetinol_qty() {
        return retinol_qty;
    }

    public void setRetinol_qty(Double retinol_qty) {
        this.retinol_qty = retinol_qty;
    }

    public String getRetinol_unit() {
        return retinol_unit;
    }

    public void setRetinol_unit(String retinol_unit) {
        this.retinol_unit = retinol_unit;
    }

    public Double getEnergy_kcal() {
        return energy_kcal;
    }

    public void setEnergy_kcal(Double energy_kcal) {
        this.energy_kcal = energy_kcal;
    }

    public String getEnergy_kj() {
        return energy_kj;
    }

    public void setEnergy_kj(String energy_kj) {
        this.energy_kj = energy_kj;
    }

    public Double getFattyAcids_saturated_qty() {
        return fattyAcids_saturated_qty;
    }

    public void setFattyAcids_saturated_qty(Double fattyAcids_saturated_qty) {
        this.fattyAcids_saturated_qty = fattyAcids_saturated_qty;
    }

    public String getFattyAcids_saturated_unit() {
        return fattyAcids_saturated_unit;
    }

    public void setFattyAcids_saturated_unit(String fattyAcids_saturated_unit) {
        this.fattyAcids_saturated_unit = fattyAcids_saturated_unit;
    }

    public Double getFattyAcids_monounsaturated_qty() {
        return fattyAcids_monounsaturated_qty;
    }

    public void setFattyAcids_monounsaturated_qty(Double fattyAcids_monounsaturated_qty) {
        this.fattyAcids_monounsaturated_qty = fattyAcids_monounsaturated_qty;
    }

    public String getFattyAcids_monounsaturated_unit() {
        return fattyAcids_monounsaturated_unit;
    }

    public void setFattyAcids_monounsaturated_unit(String fattyAcids_monounsaturated_unit) {
        this.fattyAcids_monounsaturated_unit = fattyAcids_monounsaturated_unit;
    }

    public Double getFattyAcids_polyunsaturated_qty() {
        return fattyAcids_polyunsaturated_qty;
    }

    public void setFattyAcids_polyunsaturated_qty(Double fattyAcids_polyunsaturated_qty) {
        this.fattyAcids_polyunsaturated_qty = fattyAcids_polyunsaturated_qty;
    }

    public String getFattyAcids_polyunsaturatedunit() {
        return fattyAcids_polyunsaturatedunit;
    }

    public void setFattyAcids_polyunsaturatedunit(String fattyAcids_polyunsaturatedunit) {
        this.fattyAcids_polyunsaturatedunit = fattyAcids_polyunsaturatedunit;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attributes that = (Attributes) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "id=" + id +
                ", humidity_qty=" + humidity_qty +
                ", humidity_unit='" + humidity_unit + '\'' +
                ", protein_qty=" + protein_qty +
                ", protein_unit='" + protein_unit + '\'' +
                ", lipid_qty=" + lipid_qty +
                ", lipid_unit='" + lipid_unit + '\'' +
                ", cholesterol_qty=" + cholesterol_qty +
                ", cholesterol_unit='" + cholesterol_unit + '\'' +
                ", carbohydrate_qty=" + carbohydrate_qty +
                ", carbohydrate_unit='" + carbohydrate_unit + '\'' +
                ", fiber_qty=" + fiber_qty +
                ", fiber_unit='" + fiber_unit + '\'' +
                ", ashes_qty=" + ashes_qty +
                ", ashes_unit='" + ashes_unit + '\'' +
                ", calcium_qty=" + calcium_qty +
                ", calcium_unit='" + calcium_unit + '\'' +
                ", _qty=" + _qty +
                ", _unit='" + _unit + '\'' +
                ", magnesium_qty=" + magnesium_qty +
                ", magnesium_unit='" + magnesium_unit + '\'' +
                ", phosphorus_qty=" + phosphorus_qty +
                ", phosphorus_unit='" + phosphorus_unit + '\'' +
                ", iron_qty=" + iron_qty +
                ", iron_unit='" + iron_unit + '\'' +
                ", sodium_qty=" + sodium_qty +
                ", sodium_unit='" + sodium_unit + '\'' +
                ", potassium_qty=" + potassium_qty +
                ", potassium_unit='" + potassium_unit + '\'' +
                ", thiamine_qty=" + thiamine_qty +
                ", thiamine_unit='" + thiamine_unit + '\'' +
                ", riboflavin_qty=" + riboflavin_qty +
                ", riboflavin_unit='" + riboflavin_unit + '\'' +
                ", pyridoxine_qty=" + pyridoxine_qty +
                ", pyridoxine_unit='" + pyridoxine_unit + '\'' +
                ", niacin_qty=" + niacin_qty +
                ", niacin_unit='" + niacin_unit + '\'' +
                ", manganese_qty=" + manganese_qty +
                ", manganese_unit='" + manganese_unit + '\'' +
                ", retinol_qty=" + retinol_qty +
                ", retinol_unit='" + retinol_unit + '\'' +
                ", energy_kcal=" + energy_kcal +
                ", energy_kj='" + energy_kj + '\'' +
                ", fattyAcids_saturated_qty=" + fattyAcids_saturated_qty +
                ", fattyAcids_saturated_unit='" + fattyAcids_saturated_unit + '\'' +
                ", fattyAcids_monounsaturated_qty=" + fattyAcids_monounsaturated_qty +
                ", fattyAcids_monounsaturated_unit='" + fattyAcids_monounsaturated_unit + '\'' +
                ", fattyAcids_polyunsaturated_qty=" + fattyAcids_polyunsaturated_qty +
                ", fattyAcids_polyunsaturatedunit='" + fattyAcids_polyunsaturatedunit + '\'' +
                '}';
    }
}

