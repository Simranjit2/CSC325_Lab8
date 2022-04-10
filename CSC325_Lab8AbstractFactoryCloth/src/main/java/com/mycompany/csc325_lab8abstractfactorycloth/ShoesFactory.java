/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: ShoesFactory </p>
 * <p>
 * Description: This class implements methods from ClothFactory interface.</p>
 *
 * @author Simranjit Kaur
 */
public class ShoesFactory implements ClothFactory {

    /**
     * topsChoices- if the user's needed party tops this method will return
     * instantiate new PartyTops object and print the message.
     */
    @Override
    public Tops topsChoices() {
        return new PartyTops();
    }

    /**
     * pantsChoices- if the user's needed party pants this method will return
     * instantiate new PartyPants objects and print the message.
     */
    @Override
    public Pants pantsChoices() {
        return new PartyPants();
    }

    /**
     * shoesChoices- if the user's needed party shoes this method will return
     * instantiate new PartyShoes object and print the message.
     */
    @Override
    public Shoes shoesChoices() {
        return new PartyShoes();
    }

}
