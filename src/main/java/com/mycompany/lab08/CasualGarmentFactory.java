
package com.mycompany.lab08;

/**
 *
 * @author jesus
 */

/**
 * This CasualGarmentFactory type corresponds to a certain product variety.
 * all the related products are from the same family, Garment,
 * and are from the same variant, 'Casual'.
 * 
 */
public class CasualGarmentFactory implements GarmentFactory {

    @Override
    public Shoes getShoes() {
        return new CasualShoes();
    }

    @Override
    public Pants getPants() {
        return new CasualPants();
        }

    @Override
    public Tops getTops() {
        return new CasualTops();
    }
    
    
}
