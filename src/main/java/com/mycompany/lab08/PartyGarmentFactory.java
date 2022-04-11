
package com.mycompany.lab08;

/**
 *
 * @author jesus
 */


/**
 * This PartyGarmentFactory type corresponds to a certain product variety.
 * all the related products are from the same family, Garment,
 * and are from the same variant, 'Party'.
 * 
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
