/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boiler;

/**
 *
 * @author workway
 */
public class Display {
    
    private Controller blankController;
        
    public Display() {
        System.out.println("Display created");
    }
    
    public void displayControllerConnect (Controller controller) {
    blankController=controller;
    }
    
    public void displayTemps (int actTemp, int targetTemp) {
        System.out.println("Display - Target water temp "+targetTemp+""
                + ", actual water temp "+actTemp);
    }
    
    
}
