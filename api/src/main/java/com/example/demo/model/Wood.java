package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wood implements java.io.Serializable {
    private String value;

    public Wood() {
    }

    public Wood(String value) {
        this.value = value;
    }

    @Override
    public String toString ( ) {
        return value;
    }

    @Id
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
