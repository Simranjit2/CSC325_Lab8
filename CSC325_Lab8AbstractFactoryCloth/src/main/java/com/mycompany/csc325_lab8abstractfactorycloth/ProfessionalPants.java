/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: ProfessionalPants </p>
 * <p>
 * Description: This class implements method from Pants class to determine the
 * needed pants type of user's.</p>
 *
 * @author Simranjit Kaur
 */
public class ProfessionalPants implements Pants {

    /**
     * typeOfPants- this method print out the message of professional pants if
     * user's needed professional cloths.
     */
    @Override
    public void typeOfPants() {
        System.out.println("Professional Pants.");
    }

}
