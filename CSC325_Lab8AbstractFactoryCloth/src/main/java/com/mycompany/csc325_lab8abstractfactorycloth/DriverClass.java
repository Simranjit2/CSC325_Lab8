/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_lab8abstractfactorycloth;

/**
 * <p>
 * Title: DriverClass </p>
 * <p>
 * Description: This is the main class which check user's requirements and print
 * out the message based on whether the user's needed professional, casual or
 * party cloths.</p>
 *
 * @author Simranjit Kaur
 */
public class DriverClass {

    private static Application configureApplication() {

        Application app;
        ClothFactory factory;

        //user's requirements
        String printName = "I need professional cloths.";

        //check if the user need professional cloths
        if (printName.contains("professional")) {
            factory = new TopsFactory();
            app = new Application(factory);
        }//check if the user need casual cloths 
        else if (printName.contains("casual")) {
            factory = new PantsFactory();
            app = new Application(factory);
        }//user need party cloths 
        else {
            factory = new ShoesFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        //instantiate the app
        Application app = configureApplication();
        //call revealContent method to reveal the content
        app.revealContent();
    }
}
