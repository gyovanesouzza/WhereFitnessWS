package com.gyovanesouzza.wherefitnessws.repositories;

import com.gyovanesouzza.wherefitnessws.domain.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MealRepositories extends JpaRepository<Meal, Integer> {
    Optional<Meal> findByName(String name);
}
