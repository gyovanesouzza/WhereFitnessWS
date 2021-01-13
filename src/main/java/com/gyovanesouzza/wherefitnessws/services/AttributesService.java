package com.gyovanesouzza.wherefitnessws.services;

import com.gyovanesouzza.wherefitnessws.domain.Attribute;
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
    public List<Attribute> findAll() {return attributesRepository.findAll();
    }
    public Attribute findById(Integer id) {
        Optional<Attribute> obj = attributesRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found! Id: " + id + ", Type: " + getClass().getName()));


    }

    public Attribute insertAttributes(Attribute attribute) {
        attribute.setId(null);
       return attributesRepository.save(attribute);
    }



}
