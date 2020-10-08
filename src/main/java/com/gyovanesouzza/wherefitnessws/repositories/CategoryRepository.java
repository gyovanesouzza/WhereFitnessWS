package com.gyovanesouzza.wherefitnessws.repositories;

import com.gyovanesouzza.wherefitnessws.domain.Category;
import com.gyovanesouzza.wherefitnessws.domain.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
