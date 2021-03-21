/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boiler;

import java.util.Scanner;

/**
 *
 * @author workway
 */
public class Controller {

    private int actualValveWaterTemp;
    private int targetValveWaterTemp;
    private int tempChange;
    private Boiler blankBoiler;
    private Heater blankHeater;
    private Display blankDisplay;
    

    public Controller(Boiler boiler) {
        System.out.println("Controller created");
        blankBoiler = boiler;

    }

    public void waterTempEquiliser(int actualWaterTemp) {
        actualValveWaterTemp = actualWaterTemp;
        targetValveWaterTemp = blankBoiler.getboilerWaterTemp();
    
       blankDisplay.displayTemps(actualWaterTemp, targetValveWaterTemp);
    //  tempChange=targetValveWaterTemp-actualValveWaterTemp;
        if (actualWaterTemp<=targetValveWaterTemp-4) {
        blankHeater.waterTempEq(blankBoiler.getboilerWaterTemp());
        }
        //blankDisplay.displayTemps(blankHeater.getWaterTemp(), blankBoiler.getboilerWaterTemp());
    }

    public int getActualWaterTemp() {
        return actualValveWaterTemp;
    }

    public int getTargetlWaterTemp() {
        return targetValveWaterTemp;
    }

    public void ControllerHeaterConnector(Heater heater, Display display) {
        blankHeater = heater;
        blankDisplay = display;
    }

}
