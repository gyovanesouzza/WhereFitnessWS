package com.gyovanesouzza.wherefitnessws.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Attributes implements Serializable {
    private static final long serialVersionUID = 4025489455635149860L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(mappedBy = "attributes")
    private Food food;

    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Humidity humidity;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Protein protein;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Lipid lipid;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Cholesterol cholesterol;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Carbohydrate carbohydrate;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Fiber fiber;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Ashes ashes;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Calcium calcium;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Magnesium magnesium;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Phosphorus phosphorus;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Iron iron;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Sodium sodium;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Potassium potassium;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Thiamine thiamine;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Riboflavin riboflavin;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Pyridoxine pyridoxine;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Niacin niacin;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Manganese manganese;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Energy energy;
    @OneToOne(mappedBy = "attributes", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private FattyAcids fattyAcids;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public Lipid getLipid() {
        return lipid;
    }

    public void setLipid(Lipid lipid) {
        this.lipid = lipid;
    }

    public Cholesterol getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(Cholesterol cholesterol) {
        this.cholesterol = cholesterol;
    }

    public Carbohydrate getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Carbohydrate carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public Fiber getFiber() {
        return fiber;
    }

    public void setFiber(Fiber fiber) {
        this.fiber = fiber;
    }

    public Ashes getAshes() {
        return ashes;
    }

    public void setAshes(Ashes ashes) {
        this.ashes = ashes;
    }

    public Calcium getCalcium() {
        return calcium;
    }

    public void setCalcium(Calcium calcium) {
        this.calcium = calcium;
    }

    public Magnesium getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(Magnesium magnesium) {
        this.magnesium = magnesium;
    }

    public Phosphorus getPhosphorus() {
        return phosphorus;
    }

    public void setPhosphorus(Phosphorus phosphorus) {
        this.phosphorus = phosphorus;
    }

    public Iron getIron() {
        return iron;
    }

    public void setIron(Iron iron) {
        this.iron = iron;
    }

    public Sodium getSodium() {
        return sodium;
    }

    public void setSodium(Sodium sodium) {
        this.sodium = sodium;
    }

    public Potassium getPotassium() {
        return potassium;
    }

    public void setPotassium(Potassium potassium) {
        this.potassium = potassium;
    }

    public Thiamine getThiamine() {
        return thiamine;
    }

    public void setThiamine(Thiamine thiamine) {
        this.thiamine = thiamine;
    }

    public Riboflavin getRiboflavin() {
        return riboflavin;
    }

    public void setRiboflavin(Riboflavin riboflavin) {
        this.riboflavin = riboflavin;
    }

    public Pyridoxine getPyridoxine() {
        return pyridoxine;
    }

    public void setPyridoxine(Pyridoxine pyridoxine) {
        this.pyridoxine = pyridoxine;
    }

    public Niacin getNiacin() {
        return niacin;
    }

    public void setNiacin(Niacin niacin) {
        this.niacin = niacin;
    }

    public Manganese getManganese() {
        return manganese;
    }

    public void setManganese(Manganese manganese) {
        this.manganese = manganese;
    }

    public Energy getEnergy() {
        return energy;
    }

    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    public FattyAcids getFattyAcids() {
        return fattyAcids;
    }

    public void setFattyAcids(FattyAcids fattyAcids) {
        this.fattyAcids = fattyAcids;
    }

    @Entity
    public class Humidity implements Serializable {
        private static final long serialVersionUID = -899084491328752007L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private Double qty;
        private String unit;

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Protein implements Serializable {
        private static final long serialVersionUID = -7725473209223179641L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Lipid implements Serializable {
        private static final long serialVersionUID = 5007160088281713281L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Cholesterol implements Serializable {
        private static final long serialVersionUID = 1535925646132414293L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Carbohydrate implements Serializable {
        private static final long serialVersionUID = 2387133304211134480L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Fiber implements Serializable {
        private static final long serialVersionUID = -6816928190341015401L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Ashes implements Serializable {
        private static final long serialVersionUID = -8638281828182244L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Calcium implements Serializable {
        private static final long serialVersionUID = 6301803793787698094L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Magnesium implements Serializable {
        private static final long serialVersionUID = 6851843763923928344L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Phosphorus implements Serializable {
        private static final long serialVersionUID = -8749720320709418884L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Iron implements Serializable {
        private static final long serialVersionUID = -1250928321013813762L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Sodium implements Serializable {
        private static final long serialVersionUID = 4914296224873885646L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Potassium implements Serializable {
        private static final long serialVersionUID = 5718353177726724643L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Retinol implements Serializable {
        private static final long serialVersionUID = 2363485483897229702L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Thiamine implements Serializable {
        private static final long serialVersionUID = 2305133337187257522L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Riboflavin implements Serializable {
        private static final long serialVersionUID = 2767487715913117849L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Pyridoxine implements Serializable {
        private static final long serialVersionUID = -1994648724131613798L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Niacin implements Serializable {
        private static final long serialVersionUID = -7253429165922475583L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Manganese implements Serializable {
        private static final long serialVersionUID = 1898252606051975128L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class Energy implements Serializable {
        private static final long serialVersionUID = 162855613295005286L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double kj;
        private Double kcal;

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getKj() {
            return kj;
        }

        public void setKj(Double kj) {
            this.kj = kj;
        }

        public Double getKcal() {
            return kcal;
        }

        public void setKcal(Double kcal) {
            this.kcal = kcal;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    @Entity
    public class FattyAcids implements Serializable {
        private static final long serialVersionUID = -7253429165922475583L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;



        @OneToOne(mappedBy = "fattyAcids", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private Saturated saturated;

        @OneToOne(mappedBy = "fattyAcids", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private Monounsaturated monounsaturated;

        @OneToOne(mappedBy = "fattyAcids", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private Polyunsaturated polyunsaturated;

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "attributes_id")
        private Attributes attributes;
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }

        public Saturated getSaturated() {
            return saturated;
        }

        public void setSaturated(Saturated saturated) {
            this.saturated = saturated;
        }

        public Monounsaturated getMonounsaturated() {
            return monounsaturated;
        }

        public void setMonounsaturated(Monounsaturated monounsaturated) {
            this.monounsaturated = monounsaturated;
        }

        public Polyunsaturated getPolyunsaturated() {
            return polyunsaturated;
        }

        public void setPolyunsaturated(Polyunsaturated polyunsaturated) {
            this.polyunsaturated = polyunsaturated;
        }
    }

    @Entity
    public class Saturated implements Serializable {
        private static final long serialVersionUID = -3471111841438024134L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "fattyAcids_id")
        private FattyAcids fattyAcids;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public FattyAcids getFattyAcids() {
            return fattyAcids;
        }

        public void setFattyAcids(FattyAcids fattyAcids) {
            this.fattyAcids = fattyAcids;
        }
    }

    @Entity
    public class Monounsaturated implements Serializable {
        private static final long serialVersionUID = 7112317645960816411L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "fattyAcids_id")
        private FattyAcids fattyAcids;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public FattyAcids getFattyAcids() {
            return fattyAcids;
        }

        public void setFattyAcids(FattyAcids fattyAcids) {
            this.fattyAcids = fattyAcids;
        }

    }

    @Entity
    public class Polyunsaturated implements Serializable {
        private static final long serialVersionUID = 4241013025956703851L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Double qty;
        private String unit;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "fattyAcids_id")
        private FattyAcids fattyAcids;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getQty() {
            return qty;
        }

        public void setQty(Double qty) {
            this.qty = qty;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public FattyAcids getFattyAcids() {
            return fattyAcids;
        }

        public void setFattyAcids(FattyAcids fattyAcids) {
            this.fattyAcids = fattyAcids;
        }

    }

}

