/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: PartyPants </p>
 * <p>
 * Description: This class implements method from Pants class to determine the
 * needed tops type of user's.</p>
 *
 * @author Simranjit Kaur
 */
public class PartyPants implements Pants {

    /**
     * typeOfPants- this method print out the message of party pants if user's
     * needed party cloths.
     */
    @Override
    public void typeOfPants() {
        System.out.println("Party Pants.");
    }

}
