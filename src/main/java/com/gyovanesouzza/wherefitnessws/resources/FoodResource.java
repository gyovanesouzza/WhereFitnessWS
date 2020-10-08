package com.gyovanesouzza.wherefitnessws.resources;

import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Food> findById(@PathVariable Integer id) {
        Food obj = foodService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
