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
public class Detector {

    private Water blankWater;
    private Controller blankController;

    public Detector(Controller controller) {
        System.out.println("Detector created");
        blankController = controller;
    }

    public int getValveWaterTemp() {
        return blankWater.getActualWaterTemp();
    }

    public void setValveWaterTemp(Water water) {
        blankWater = water;
    }

    public void sendWaterTemp() {
        blankController.waterTempEquiliser(blankWater.getActualWaterTemp());
    }

}
