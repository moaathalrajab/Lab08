
package com.mycompany.lab08;

/**
 *
 * @author jesus
 */


/**
 * I used the abstract factory design pattern, since I have a family of related products
 * with different variants. This will allow me to introduce new variants of products
 * without breaking existing client code.
 * 
 */
public class Driver {
    
 /**
 * In the driver code I used a factory object, instead of creating products directly with
 * a constructor call. Since the factory object corresponds to a single product variant,
 * all the products in that factory will be compatible.
 * 
 */
    public static void main(String[] args){
        
    var factory = new CasualGarmentFactory();
    var shoes = factory.getShoes();
    var pants = factory.getPants();
    var tops = factory.getTops();
    
    System.out.println(shoes.getDescription()+"\n"+
            pants.getDescription() + "\n"+
            tops.getDescription()
            );
    
    
    
    
    
    
    }
    
}
