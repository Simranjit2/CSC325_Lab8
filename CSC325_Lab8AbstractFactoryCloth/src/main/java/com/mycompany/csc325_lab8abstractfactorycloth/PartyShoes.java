/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: PartyShoes </p>
 * <p>
 * Description: This class implements method from Shoes class to determine the
 * needed shoes type of user's.</p>
 *
 * @author Simranjit Kaur
 */
public class PartyShoes implements Shoes {

    /**
     * typeOfShoes- this method print out the message of party shoes if user's
     * needed party cloths.
     */
    @Override
    public void typeOfShoes() {
        System.out.println("Party Shoes.");
    }

}
