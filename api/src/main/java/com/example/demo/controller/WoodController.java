package com.example.demo.controller;

import com.example.demo.model.Wood;
import com.example.demo.service.WoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@CrossOrigin
@RestController()
@RequestMapping(value = "woods", produces = {APPLICATION_JSON_UTF8_VALUE})
public class WoodController {

    @Autowired
    WoodService woodService;

    @GetMapping(value = "")
    public ResponseEntity<List<Wood >> getAll ( ) {
        return ResponseEntity.ok(woodService.getAll());
    }
}
