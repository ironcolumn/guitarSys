package com.example.demo.dao;

import com.example.demo.model.Type;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
public interface TypeRepository extends JpaRepository<Type, Integer> {

}
