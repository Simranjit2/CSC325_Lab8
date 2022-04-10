/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: CasualPants </p>
 * <p>
 * Description: This class implements method from Pants class to determine the
 * needed tops type of user's.</p>
 *
 * @author Simranjit Kaur
 */
public class CasualPants implements Pants {

    /**
     * typeOfPants- this method print out the message of casual pants if user's
     * needed casual cloths.
     */
    @Override
    public void typeOfPants() {
        System.out.println("Casual Pants.");
    }

}
