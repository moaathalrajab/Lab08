/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab08;

/**
 *
 * @author jesus
 */
public class PartyGarmentFactory implements GarmentFactory {

    @Override
    public Shoes getShoes() {
        return new PartyShoes();
    }

    @Override
    public Pants getPants() {
        return new PartyPants();
    }

    @Override
    public Tops getTops() {
        return new PartyTops();
    }
    
}
