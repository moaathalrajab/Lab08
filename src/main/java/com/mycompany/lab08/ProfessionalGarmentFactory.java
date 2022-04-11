
package com.mycompany.lab08;

/**
 *
 * @author jesus
 */


/**
 * This ProfessionalGarmentFactory type corresponds to a certain product variety.
 * all the related products are from the same family, Garment,
 * and are from the same variant, 'Proffesional'.
 * 
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
