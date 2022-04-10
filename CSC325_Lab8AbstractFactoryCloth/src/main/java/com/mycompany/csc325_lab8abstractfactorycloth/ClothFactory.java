/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: ClothFactory Interface</p>
 *
 * @author Simranjit Kaur
 */
public interface ClothFactory {

    //method to print user's tops choices
    Tops topsChoices();

    //method to print user's pants choices
    Pants pantsChoices();

    //method to print user's shoes choices
    Shoes shoesChoices();

}
