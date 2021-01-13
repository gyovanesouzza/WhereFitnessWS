package com.gyovanesouzza.wherefitnessws.services;

import com.gyovanesouzza.wherefitnessws.domain.Attribute;
import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.domain.Meal;
import com.gyovanesouzza.wherefitnessws.domain.dto.MealDTO;
import com.gyovanesouzza.wherefitnessws.exceptions.DataIntegrityException;
import com.gyovanesouzza.wherefitnessws.exceptions.ObjectNotFoundException;
import com.gyovanesouzza.wherefitnessws.repositories.AttributesRepository;
import com.gyovanesouzza.wherefitnessws.repositories.MealRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MealService {

    @Autowired
    private MealRepositories mealRepositories;
    @Autowired
    private AttributesRepository attributesRepository;
    @Autowired
    private FoodService foodService;

    public List<Meal> findAll() {
        return mealRepositories.findAll();
    }

    public Meal findById(Integer id) {
        Optional<Meal> obj = mealRepositories.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found! Id: " + id + ", Type: " + getClass().getName()));
    }

    public Meal findByName(String name) {
        Optional<Meal> obj = mealRepositories.findByName(name);

        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found! Description: " + name + ", Type: " + getClass().getName()));

    }

    public Meal insert(Meal meal) {
        meal.setId(null);
        meal.getAttribute().setId(null);
        attributesRepository.save(meal.getAttribute());
        return mealRepositories.save(meal);

    }

    public Meal update(Meal meal){

        meal.getAttribute().setId(findById(meal.getId()).getAttribute().getId());
        attributesRepository.save(meal.getAttribute());
        return mealRepositories.save(meal);
    }



    public Meal FromDTO(MealDTO mealDTO) {
        Meal meal = new Meal(mealDTO.getId(), mealDTO.getName(), mealDTO.getVisibility(), mealDTO.getInstructions(),
                mealDTO.getPhoto());

        Attribute attribute = new Attribute(null, mealDTO.getHumidity_qty(), mealDTO.getHumidity_unit(),
                mealDTO.getProtein_qty(),
                mealDTO.getProtein_unit(), mealDTO.getLipid_qty(), mealDTO.getLipid_unit(),
                mealDTO.getCholesterol_qty(), mealDTO.getCholesterol_unit(), mealDTO.getCarbohydrate_qty(),
                mealDTO.getCarbohydrate_unit(), mealDTO.getFiber_qty(), mealDTO.getFiber_unit(), mealDTO.getAshes_qty(),
                mealDTO.getAshes_unit(), mealDTO.getCalcium_qty(), mealDTO.getCalcium_unit(), mealDTO.getMagnesium_qty(),
                mealDTO.getMagnesium_unit(), mealDTO.getPhosphorus_qty(), mealDTO.getPhosphorus_unit(),
                mealDTO.getIron_qty(),
                mealDTO.getIron_unit(), mealDTO.getSodium_qty(), mealDTO.getSodium_unit(), mealDTO.getPotassium_qty(),
                mealDTO.getPotassium_unit(), mealDTO.getThiamine_qty(), mealDTO.getThiamine_unit(),
                mealDTO.getRiboflavin_qty(),
                mealDTO.getRiboflavin_unit(), mealDTO.getPyridoxine_qty(), mealDTO.getPyridoxine_unit(),
                mealDTO.getNiacin_qty(),
                mealDTO.getNiacin_unit(), mealDTO.getManganese_qty(), mealDTO.getManganese_unit(), mealDTO.getRetinol_qty(),
                mealDTO.getRetinol_unit(), mealDTO.getEnergy_kcal(), mealDTO.getEnergy_kj(),
                mealDTO.getFattyAcids_saturated_qty(),
                mealDTO.getFattyAcids_saturated_unit(), mealDTO.getFattyAcids_monounsaturated_qty(),
                mealDTO.getFattyAcids_monounsaturated_unit(), mealDTO.getFattyAcids_polyunsaturated_qty(),
                mealDTO.getFattyAcids_polyunsaturatedunit());

        meal.setAttribute(attribute);

        for (int id : mealDTO.getFoods()) {
            meal.getFoods().add(foodService.findById(id));
        }

        return meal;
    }


    public void delete(int id) {
        findById(id);
        try {
            mealRepositories.deleteById(id);
        } catch (DataIntegrityViolationException exception) {
            throw new DataIntegrityException("Não é possivel exluir essa receita");
        }

    }
}
