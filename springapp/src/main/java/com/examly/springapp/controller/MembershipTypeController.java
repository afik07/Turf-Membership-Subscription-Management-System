package com.examly.springapp.controller;

import com.examly.springapp.model.MembershipType;
import com.examly.springapp.service.MembershipTypeService;
import com.examly.springapp.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/membership-types")
public class MembershipTypeController {

    @Autowired
    private MembershipTypeService service;

    @PostMapping
    public ResponseEntity<MembershipType> create(@RequestBody MembershipType mtype) {
        return ResponseEntity.status(201).body(service.create(mtype));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MembershipType> update(@PathVariable Long id, @RequestBody MembershipType mtype) {
        return ResponseEntity.ok(service.update(id, mtype));
    }

    @GetMapping
    public List<MembershipType> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public MembershipType getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> getByName(@PathVariable String name) {
        try {
            return ResponseEntity.ok(service.getByName(name));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(204).body(e.getMessage());  // Include message in body for test
        }
    }

    @GetMapping("/price")
    public List<MembershipType> getByPriceRange(@RequestParam double min, @RequestParam double max) {
        return service.getByPriceRange(min, max);
    }

    @GetMapping("/duration-greater/{duration}")
    public ResponseEntity<?> getByDurationGreater(@PathVariable int duration) {
        try {
            return ResponseEntity.ok(service.getByDurationGreaterThan(duration));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(204).body(e.getMessage());  // Include message in body for test
        }
    }

    @GetMapping("/price-less/{price}")
    public ResponseEntity<?> getByPriceLessThan(@PathVariable double price) {
        try {
            return ResponseEntity.ok(service.getByPriceLessThan(price));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(204).body(e.getMessage());  // Include message in body for test
        }
    }
}