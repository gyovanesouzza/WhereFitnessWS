package com.gyovanesouzza.wherefitnessws.services;

import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.exceptions.ObjectNotFoundException;
import com.gyovanesouzza.wherefitnessws.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    public Food findById(Integer id) {
        Optional<Food> obj = foodRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + getClass().getName()));

    }
}
