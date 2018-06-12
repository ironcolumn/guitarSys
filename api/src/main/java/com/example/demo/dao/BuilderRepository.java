package com.example.demo.dao;

import com.example.demo.model.Builder;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
public interface BuilderRepository extends JpaRepository<Builder, Integer> {

}
