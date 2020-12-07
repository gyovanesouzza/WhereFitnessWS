package com.gyovanesouzza.wherefitnessws;

import com.gyovanesouzza.wherefitnessws.domain.Attributes;
import com.gyovanesouzza.wherefitnessws.domain.Category;
import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.repositories.AttributesRepository;
import com.gyovanesouzza.wherefitnessws.repositories.CategoryRepository;
import com.gyovanesouzza.wherefitnessws.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class WhereFitnessWsApplication implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private AttributesRepository attributesRepository;

    public static void main(String[] args) {
        SpringApplication.run(WhereFitnessWsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        addObjects();
    }

    private void addObjects() {
        Category c1 = new Category(null, "Cereais e derivados");
        Category c2 = new Category(null, "Verduras, hortaliças e derivados");
        Category c3 = new Category(null, "Frutas e derivados");
        Category c4 = new Category(null, "Gorduras e óleos");
        Category c5 = new Category(null, "Pescados e frutos do mar");
        Category c6 = new Category(null, "Carnes  e derivados");

        Attributes att1 = new Attributes(null, 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3,
                "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas",
                2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, 5.4, 2.3,
                "gramas", null, null, null, null);
        Attributes att2 = new Attributes(null, 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3,
                "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas",
                2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, 5.4, 2.3,
                "gramas", null, null, null, null);
        Attributes att3 = new Attributes(null, 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3,
                "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas",
                2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, 5.4, 2.3,
                "gramas", null, null, null, null);


        Food f1 = new Food(null,null, "Arroz, integral", 100, "g", c1, att1);
        Food f2 = new Food(null,null, "Arroz, Parabolizado", 100, "g", c2, att2);
        Food f3 = new Food(null,null, "Arroz, fino", 100, "g", c3, att3);

        c1.getFoods().addAll(Arrays.asList(f1, f2, f3));

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
        attributesRepository.saveAll(Arrays.asList(att1, att2, att3));
        foodRepository.saveAll(Arrays.asList(f1, f2, f3));
    }
}
