package com.gyovanesouzza.wherefitnessws.services;

import com.gyovanesouzza.wherefitnessws.domain.Attributes;
import com.gyovanesouzza.wherefitnessws.repositories.AttributesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributesService {


    @Autowired
    private AttributesRepository attributesRepository;



    public Attributes insertAttributes(Attributes attributes) {
        attributes.setId(null);
       return attributesRepository.save(attributes);
    }


}
