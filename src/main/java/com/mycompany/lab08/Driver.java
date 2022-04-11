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
public class Driver {
    
    public static void main(String[] args){
    
    System.out.println("hello world");
    
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
