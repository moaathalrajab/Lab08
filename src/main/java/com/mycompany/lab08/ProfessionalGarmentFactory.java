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
public class ProfessionalGarmentFactory implements GarmentFactory {

    @Override
    public Shoes getShoes() {
        return new ProfessionalShoes();
    }

    @Override
    public Pants getPants() {
        return new ProfessionalPants();
    }

    @Override
    public Tops getTops() {
        return new ProfessionalTops();
    }
    
}
