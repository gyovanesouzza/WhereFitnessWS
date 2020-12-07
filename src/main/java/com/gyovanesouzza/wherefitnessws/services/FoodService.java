package com.gyovanesouzza.wherefitnessws.services;

import com.gyovanesouzza.wherefitnessws.domain.Attributes;
import com.gyovanesouzza.wherefitnessws.domain.Category;
import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.domain.dto.FoodDTO;
import com.gyovanesouzza.wherefitnessws.exceptions.ObjectNotFoundException;
import com.gyovanesouzza.wherefitnessws.repositories.AttributesRepository;
import com.gyovanesouzza.wherefitnessws.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AttributesRepository attributesRepository;

    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    public Food findById(Integer id) {
        Optional<Food> obj = foodRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found! Id: " + id + ", Type: " + getClass().getName()));
    }

    public Food findByDescription(String description) {
        Optional<Food> obj = foodRepository.findByDescription(description);

        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found! Description: " + description + ", Type: " + getClass().getName()));

    }

    public Food insert(Food food) {
        food.setId(null);
        attributesRepository.save(food.getAttributes());
        return foodRepository.save(food);

    }

    public Food FromDTO(FoodDTO foodDTO) {
        Category category = categoryService.findByname(foodDTO.getCategory());

        Attributes attributes = new Attributes(null, foodDTO.getHumidity_qty(), foodDTO.getHumidity_unit(),
                foodDTO.getProtein_qty(),
                foodDTO.getProtein_unit(), foodDTO.getLipid_qty(), foodDTO.getLipid_unit(),
                foodDTO.getCholesterol_qty(), foodDTO.getCholesterol_unit(), foodDTO.getCarbohydrate_qty(),
                foodDTO.getCarbohydrate_unit(), foodDTO.getFiber_qty(), foodDTO.getFiber_unit(), foodDTO.getAshes_qty(),
                foodDTO.getAshes_unit(), foodDTO.getCalcium_qty(), foodDTO.getCalcium_unit(), foodDTO.getMagnesium_qty(),
                foodDTO.getMagnesium_unit(), foodDTO.getPhosphorus_qty(), foodDTO.getPhosphorus_unit(),
                foodDTO.getIron_qty(),
                foodDTO.getIron_unit(), foodDTO.getSodium_qty(), foodDTO.getSodium_unit(), foodDTO.getPotassium_qty(),
                foodDTO.getPotassium_unit(), foodDTO.getThiamine_qty(), foodDTO.getThiamine_unit(),
                foodDTO.getRiboflavin_qty(),
                foodDTO.getRiboflavin_unit(), foodDTO.getPyridoxine_qty(), foodDTO.getPyridoxine_unit(),
                foodDTO.getNiacin_qty(),
                foodDTO.getNiacin_unit(), foodDTO.getManganese_qty(), foodDTO.getManganese_unit(), foodDTO.getRetinol_qty(),
                foodDTO.getRetinol_unit(), foodDTO.getEnergy_kcal(), foodDTO.getEnergy_kj(),
                foodDTO.getFattyAcids_saturated_qty(),
                foodDTO.getFattyAcids_saturated_unit(), foodDTO.getFattyAcids_monounsaturated_qty(),
                foodDTO.getFattyAcids_monounsaturated_unit(), foodDTO.getFattyAcids_polyunsaturated_qty(),
                foodDTO.getFattyAcids_polyunsaturatedunit());


        Food food = new Food(null, foodDTO.getBrand(), foodDTO.getDescription(), foodDTO.getBase_qty(),
                foodDTO.getBase_unit(), category, attributes);

        return food;
    }
}
