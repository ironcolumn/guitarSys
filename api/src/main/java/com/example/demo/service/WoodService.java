package com.example.demo.service;

import com.example.demo.dao.WoodRepository;
import com.example.demo.model.Wood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WoodService {

    @Autowired
    WoodRepository woodRepository;

    public List < Wood > getAll ( ) {

        return woodRepository.findAll ( );
    }
}
