package com.gyovanesouzza.wherefitnessws.repositories;

import com.gyovanesouzza.wherefitnessws.domain.Attributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributesRepository extends JpaRepository<Attributes, Integer> {
}
