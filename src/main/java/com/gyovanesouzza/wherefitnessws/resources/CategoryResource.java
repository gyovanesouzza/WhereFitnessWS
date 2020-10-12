package com.gyovanesouzza.wherefitnessws.resources;

import com.gyovanesouzza.wherefitnessws.domain.Category;
import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.services.CategoryService;
import com.gyovanesouzza.wherefitnessws.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok().body(categoryService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Category> findById(@PathVariable Integer id) {
        Category obj = categoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
@RequestMapping(method = RequestMethod.POST)
     public  ResponseEntity<Void> insert(@RequestBody Category category){
        category = categoryService.insert(category);
         URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(category.getId()).toUri();
        return ResponseEntity.created(uri).build();


     }
}
