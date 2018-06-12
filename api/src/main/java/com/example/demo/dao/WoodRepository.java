package com.example.demo.dao;

import com.example.demo.model.Wood;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
public interface WoodRepository extends JpaRepository<Wood, Integer> {

}
