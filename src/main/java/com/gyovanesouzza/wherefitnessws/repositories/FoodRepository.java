package com.gyovanesouzza.wherefitnessws.repositories;

import com.gyovanesouzza.wherefitnessws.domain.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {
}
