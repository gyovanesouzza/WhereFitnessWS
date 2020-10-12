package com.gyovanesouzza.wherefitnessws.services;

import com.gyovanesouzza.wherefitnessws.domain.Attributes;
import com.gyovanesouzza.wherefitnessws.domain.Food;
import com.gyovanesouzza.wherefitnessws.exceptions.ObjectNotFoundException;
import com.gyovanesouzza.wherefitnessws.repositories.AttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttributesService {


    @Autowired
    private AttributesRepository attributesRepository;
    public List<Attributes> findAll() {return attributesRepository.findAll();
    }
    public Attributes findById(Integer id) {
        Optional<Attributes> obj = attributesRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found! Id: " + id + ", Type: " + getClass().getName()));


    }

    public Attributes insertAttributes(Attributes attributes) {
        attributes.setId(null);
       return attributesRepository.save(attributes);
    }



}
