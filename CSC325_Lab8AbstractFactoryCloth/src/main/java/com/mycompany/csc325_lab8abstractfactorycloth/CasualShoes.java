/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: CasualShoes </p>
 * <p>
 * Description: This class implements method from Shoes class to determine the
 * needed tops type of user's.</p>
 *
 * @author Simranjit Kaur
 */
public class CasualShoes implements Shoes {

    /**
     * typeOfShoe- this method print out the message of casual shoes if user's
     * needed casual cloths.
     */
    @Override
    public void typeOfShoes() {
        System.out.println("Casual Shoes.");
    }

}
