package com.example.demo.service;

import com.example.demo.dao.BuilderRepository;
import com.example.demo.model.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuilderService {

    @Autowired
    BuilderRepository builderRepository;

    public List<Builder > getAll ( ) {
        return builderRepository.findAll();
    }
}
