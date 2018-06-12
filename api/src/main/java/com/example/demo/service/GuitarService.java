package com.example.demo.service;

import com.example.demo.dao.GuitarRepository;
import com.example.demo.domain.Inventory;
import com.example.demo.model.Guitar;
import com.example.demo.model.GuitarSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GuitarService {

    @Autowired
    GuitarRepository guitarRepository;

    public List<Guitar> searchGuitar (GuitarSpec guitarSpec ) {
        Inventory inventory = new Inventory ();
        return inventory.search(guitarSpec, guitarRepository.findAll());
    }

    public List<Guitar> getAll() {
        return guitarRepository.findAll();
    }

    public Guitar save (Guitar guitar ) {
        return guitarRepository.save(guitar);
    }

    public boolean deleteById(Integer id) {
        guitarRepository.deleteById(id);
        return true;
    }
}
