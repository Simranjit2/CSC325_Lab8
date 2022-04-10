/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: PantsFactory </p>
 * <p>
 * Description: This class implements methods from ClothFactory interface.</p>
 *
 * @author Simranjit Kaur
 */
public class PantsFactory implements ClothFactory {

    /**
     * topsChoices- if the user's needed casual tops this method will return
     * instantiate new CasualTops objects and print the message.
     */
    @Override
    public Tops topsChoices() {
        return new CasualTops();
    }

    /**
     * pantsChoices- if the user's needed casual pants this method will return
     * instantiate new CasualPants object and print the message.
     */
    @Override
    public Pants pantsChoices() {
        return new CasualPants();
    }

    /**
     * shoesChoices- if the user's needed casual shoes this method will return
     * instantiate new CasualShoes and print the message.
     */
    @Override
    public Shoes shoesChoices() {
        return new CasualShoes();
    }

}
