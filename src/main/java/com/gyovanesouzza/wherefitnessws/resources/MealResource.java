package com.gyovanesouzza.wherefitnessws.resources;

import com.gyovanesouzza.wherefitnessws.domain.Meal;
import com.gyovanesouzza.wherefitnessws.domain.dto.MealDTO;
import com.gyovanesouzza.wherefitnessws.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/meals")
public class MealResource {
    @Autowired
    private MealService mealService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Meal>> findAll() {
        return ResponseEntity.ok().body(mealService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Meal> findById(@PathVariable Integer id) {
        Meal obj = mealService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<Meal> findByName(@PathVariable String name) {
        Meal obj = mealService.findByName(name);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody MealDTO mealDTO) {
        Meal meal = mealService.FromDTO(mealDTO);
        meal = mealService.insert(meal);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(meal.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody MealDTO mealDTO) {
        Meal meal = mealService.FromDTO(mealDTO);
        meal = mealService.update(meal);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(meal.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable int id) {
        mealService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
