package com.example.demo.service;

import com.example.demo.dao.TypeRepository;
import com.example.demo.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {

    @Autowired
    TypeRepository typeRepository;

    public List < Type > getAll ( ) {

        return typeRepository.findAll ( );
    }
}
