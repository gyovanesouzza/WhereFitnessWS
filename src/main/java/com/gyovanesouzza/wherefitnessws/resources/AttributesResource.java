package com.gyovanesouzza.wherefitnessws.resources;

import com.gyovanesouzza.wherefitnessws.domain.Attributes;
import com.gyovanesouzza.wherefitnessws.domain.Category;
import com.gyovanesouzza.wherefitnessws.services.AttributesService;
import com.gyovanesouzza.wherefitnessws.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/attributes")
public class AttributesResource {

    @Autowired
    private AttributesService attributesService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Attributes>> findAll() {
        return ResponseEntity.ok().body(attributesService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Attributes> findById(@PathVariable Integer id) {
        Attributes obj = attributesService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Attributes attributes) {

        attributes = attributesService.insertAttributes(attributes);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(attributes.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Attributes attributes) {

        attributes = attributesService.insertAttributes(attributes);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(attributes.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
