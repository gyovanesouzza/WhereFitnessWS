package com.gyovanesouzza.wherefitnessws.services;


import com.gyovanesouzza.wherefitnessws.domain.Category;
import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.exceptions.DataIntegrityException;
import com.gyovanesouzza.wherefitnessws.exceptions.ObjectNotFoundException;
import com.gyovanesouzza.wherefitnessws.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
    public  Category findByname (String  name){
        Optional<Category> obj = categoryRepository.findByName(name);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found! Name: " + name + ", Type: " + getClass().getName()));

    }


    public Category insert(Category category) {
        category.setId(null);
        return categoryRepository.save(category);
    }

    public Category update(Category category) {
        findById(category.getId());
        return  categoryRepository.save(category);
    }

    public void delete(Integer id) {

        findById(id);

        try {
            categoryRepository.deleteById(id);
        } catch (DataIntegrityViolationException exception) {
            throw new DataIntegrityException("Não é possivel categoria que possui alimentos");
        }



    }
}
