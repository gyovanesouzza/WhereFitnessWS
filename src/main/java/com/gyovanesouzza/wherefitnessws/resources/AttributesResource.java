package com.gyovanesouzza.wherefitnessws.resources;

import com.gyovanesouzza.wherefitnessws.domain.Attribute;
import com.gyovanesouzza.wherefitnessws.services.AttributesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/attributes")
public class AttributesResource {

    @Autowired
    private AttributesService attributesService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Attribute>> findAll() {
        return ResponseEntity.ok().body(attributesService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Attribute> findById(@PathVariable Integer id) {
        Attribute obj = attributesService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Attribute attribute) {

        attribute = attributesService.insertAttributes(attribute);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(attribute.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Attribute attribute) {

        attribute = attributesService.insertAttributes(attribute);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(attribute.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
