package com.example.demo.domain;

import com.example.demo.model.Guitar;
import com.example.demo.model.GuitarSpec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List < Guitar > guitars = new ArrayList <> ( 0 );

    public List < Guitar > search ( GuitarSpec searchSpec ) {

        List < Guitar > matchingGuitars = new LinkedList < Guitar > ( );
        for ( Guitar guitar : guitars ) {
            if ( guitar.getSpec ( ).matches ( searchSpec ) ) {
                matchingGuitars.add ( guitar );
            }

        }
        return matchingGuitars;
    }

    public List < Guitar > search ( GuitarSpec searchSpec , List < Guitar > guitars ) {

        this.guitars.addAll ( guitars );
        List < Guitar > matchingGuitars = new LinkedList < Guitar > ( );
        for ( Guitar guitar : guitars ) {
            if ( guitar.getSpec ( ).matches ( searchSpec ) ) {
                matchingGuitars.add ( guitar );
            }

        }
        return matchingGuitars;
    }

    public boolean addGuitars ( List < Guitar > guitarList ) {

        return this.guitars.addAll ( guitarList );
    }

    public boolean clearGuitars ( ) {

        this.guitars = new ArrayList <> ( 0 );
        return true;
    }
}
