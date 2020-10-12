package com.gyovanesouzza.wherefitnessws.services;


import com.gyovanesouzza.wherefitnessws.domain.Category;
import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.exceptions.ObjectNotFoundException;
import com.gyovanesouzza.wherefitnessws.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();

    }

    public Category findById(Integer id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found! Id: " + id + ", Type: " + getClass().getName()));
    }


    public Category insert(Category category) {
        category.setId(null);
        return categoryRepository.save(category);
    }
}
