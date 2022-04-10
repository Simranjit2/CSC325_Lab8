/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: CasualTops </p>
 * <p>
 * Description: This class implements method from Tops class to determine the
 * needed tops type of user's.</p>
 *
 * @author Simranjit Kaur
 */
public class CasualTops implements Tops {

    /**
     * typeOfTops- this method print out the message of casual tops if user's
     * needed casual cloths.
     */
    @Override
    public void typeOfTops() {
        System.out.println("Casual Tops.");
    }

}
