package com.gyovanesouzza.wherefitnessws.resources;

import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.domain.dto.FoodDTO;
import com.gyovanesouzza.wherefitnessws.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/foods")
public class FoodResource {
    @Autowired
    private FoodService foodService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Food>> findAll() {
        return ResponseEntity.ok().body(foodService.findAll());
    }

    @RequestMapping(value = "/{foodId}", method = RequestMethod.GET)
    public ResponseEntity<Food> findById(@PathVariable Integer foodId) {
        Food obj = foodService.findById(foodId);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/description/{description}", method = RequestMethod.GET)
    public ResponseEntity<Food> findByDescription(@PathVariable String description) {
        Food obj = foodService.findByDescription(description);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody FoodDTO foodDTO) {
       Food food = foodService.FromDTO(foodDTO);
       food = foodService.insert(food);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(food.getId()).toUri();
        return ResponseEntity.created(uri).build();


    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody FoodDTO foodDTO) {
        Food food = foodService.FromDTO(foodDTO);
        food = foodService.update(food);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(food.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable int id) {
        foodService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
