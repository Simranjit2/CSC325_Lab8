/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: Application Class</p>
 * <p>
 * Description: This class has two methods a initialize constructor initialize
 * the tops, pants and shoes by calling the clothFactory interface methods and
 * revealContent method reveal which type of cloths user's needed by calling the
 * methods from the tops, pants and shoes.</p>
 *
 * @author Simranjit Kaur
 */
public class Application {

    //instance variables
    private Tops tops;
    private Pants pants;
    private Shoes shoes;

    /**
     * constructor- it instantiate the variables by calling methods from the
     * clothFactory interface
     *
     * @param factory
     */
    public Application(ClothFactory factory) {
        tops = factory.topsChoices();
        pants = factory.pantsChoices();
        shoes = factory.shoesChoices();
    }

    /**
     * revealContent- it call the methods from tops, pants and shoes to reveal
     * the type of user's required cloth and print out the message on the
     * console.
     */
    public void revealContent() {
        tops.typeOfTops();
        pants.typeOfPants();
        shoes.typeOfShoes();
    }

}
