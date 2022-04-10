/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: TopsFactory </p>
 * <p>
 * Description: This class implements methods from ClothFactory interface.</p>
 *
 * @author Simranjit Kaur
 */
public class TopsFactory implements ClothFactory {

    /**
     * topsChoices- if the user's needed professional tops this method will
     * return instantiate new ProfessionalTops object and print the message.
     */
    @Override
    public Tops topsChoices() {
        return new ProfessionalTops();
    }

    /**
     * pantsChoices- if the user's needed professional shoes this method will
     * return instantiate new ProfessionalPants object and print the message.
     */
    @Override
    public Pants pantsChoices() {
        return new ProfessionalPants();
    }

    /**
     * shoesChoices- if the user's needed professional tops this method will
     * return instantiate new ProfessionalShoes objects and print the message.
     */
    @Override
    public Shoes shoesChoices() {
        return new ProfessionalShoes();
    }

}
