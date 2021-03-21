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
public class Valve {

    private Water blankWater;
    private Controller blankController;

    public Valve() {
        System.out.println("Valve created");

    }

    public Water getValveWater() {
        return this.blankWater;
    }

    public void waterInValve(Water water) {
        blankWater = water;
        System.out.println("Water in valve");
    }

    public void waterOutValve() {
        blankWater = null;
        System.out.println("Water taken out of Boiler valve");
    }
}
