package com.gyovanesouzza.wherefitnessws;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.gyovanesouzza.wherefitnessws.domain.Attribute;
import com.gyovanesouzza.wherefitnessws.domain.Category;
import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.domain.Meal;
import com.gyovanesouzza.wherefitnessws.htpp.Client;
import com.gyovanesouzza.wherefitnessws.repositories.AttributesRepository;
import com.gyovanesouzza.wherefitnessws.repositories.CategoryRepository;
import com.gyovanesouzza.wherefitnessws.repositories.FoodRepository;
import com.gyovanesouzza.wherefitnessws.repositories.MealRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

@SpringBootApplication
public class WhereFitnessWsApplication implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private AttributesRepository attributesRepository;

    @Autowired
    private MealRepositories mealRepositories;

    public static void main(String[] args) {
        SpringApplication.run(WhereFitnessWsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }

    private void addObjectCategory() throws IOException {
        Gson gson = new Gson();
        Client httpClient = new Client();
        List<Category> categories = new ArrayList<>();
        Type listCategory = new TypeToken<List<Category>>() {
        }.getType();

        categories = gson.fromJson(httpClient.sendGET("https://taco-food-api.herokuapp" +
                        ".com/api/v1/category",
                "GET"), listCategory);

        categoryRepository.saveAll(categories);
    }

    private void addObjectFoods() throws IOException {
        Gson gson = new Gson();
        Client httpClient = new Client();
        List<Food> foods = new ArrayList<>();
        List<Attribute> att = new ArrayList<>();

        Type listFoods = new TypeToken<List<Food>>() {
        }.getType();
        Type objeTy = new TypeToken<List<Object>>() {
        }.getType();

        List<Object> obj = gson.fromJson(httpClient.sendGET("https://taco-food-api.herokuapp" +
                        ".com/api/v1/food",
                "GET"), objeTy);

        LinkedTreeMap<String, HashMap<String, Object>> tt = (LinkedTreeMap<String, HashMap<String, Object>>) obj.get(2);
        System.out.println(tt);
        foods = gson.fromJson(httpClient.sendGET("https://taco-food-api.herokuapp" +
                        ".com/api/v1/food",
                "GET"), listFoods);

        System.out.println();


    }


    private void addObjects() {
        Category c1 = new Category(null, "Cereais e derivados");
        Category c2 = new Category(null, "Verduras, hortaliças e derivados");
        Category c3 = new Category(null, "Frutas e derivados");
        Category c4 = new Category(null, "Gorduras e óleos");
        Category c5 = new Category(null, "Pescados e frutos do mar");
        Category c6 = new Category(null, "Carnes  e derivados");

        Attribute att1 = new Attribute(null, 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3,
                "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas",
                2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, 5.4, 2.3,
                "gramas", null, null, null, null);
        Attribute att2 = new Attribute(null, 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3,
                "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas",
                2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, 5.4, 2.3,
                "gramas", null, null, null, null);
        Attribute att3 = new Attribute(null, 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3,
                "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas",
                2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, 5.4, 2.3,
                "gramas", null, null, null, null);


        Food f1 = new Food(null, null, "Arroz, integral", 100, "g", c1, att1);
        f1.setBarcode("5687544567454444433");
        Food f2 = new Food(null, null, "Arroz, Parabolizado", 100, "g", c2, att2);
        f2.setBarcode("5687544567454444433");
        Food f3 = new Food(null, null, "Arroz, fino", 100, "g", c3, att3);
        f3.setBarcode("5687544567454444433");

        c1.getFoods().addAll(Arrays.asList(f1, f2, f3));

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
        attributesRepository.saveAll(Arrays.asList(att1, att2, att3));
        foodRepository.saveAll(Arrays.asList(f1, f2, f3));

        Attribute att4 = new Attribute(null, 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3,
                "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas",
                2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, "gramas", 2.3, 5.4, 2.3,
                "gramas", null, null, null, null);

        Meal m1 = new Meal(null, "Batata cozida", true, "", null);
        m1.setAttribute(att4);
        m1.getFoods().addAll(Arrays.asList(f1, f3));

        attributesRepository.save(att4);
        mealRepositories.save(m1);

    }
}
