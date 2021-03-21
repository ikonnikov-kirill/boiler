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
public class Boiler {

    private Controller blankController;
    private Water blankWater;
    private int boilerTargetWaterTemp;
    private int change;
    private Valve blankValve;
    private Display blankDisplay;
    private Detector blankDetector;
    private Heater blankHeater;
    private int time;
    Scanner scanner = new Scanner(System.in);

    public Boiler(int boilerWatertemp1) {
        boilerTargetWaterTemp = boilerWatertemp1;
        System.out.println("Boiler created with water temp set to " + boilerTargetWaterTemp);
        Controller oneController = new Controller(this);
        blankController = oneController;
        Valve oneValve = new Valve();
        blankValve = oneValve;
        Display oneDisplay = new Display();
        blankDisplay = oneDisplay;
        Detector oneDetector = new Detector(oneController);
        blankDetector = oneDetector;
        Heater oneHeater = new Heater();
        blankHeater = oneHeater;
    }

    public void start() {
        System.out.println("Boiler Start button pressed");

        if (blankValve.getValveWater() == null) {
            System.out.println("cant start Boiler because no water in valve");
            return;
        }

        if (blankValve.getValveWater() != null) {

            // set time and temp up and down
            for (int i = time; i >= 0; i--) {
              //  System.out.println("time left "+i);
              //  int waterTempReduction=blankWater.getActualWaterTemp()-1;
              //  blankWater.setActualWaterTemp(waterTempReduction);
                //while (true) {
                   
                    
                    
                    System.out.println("Actual water temp " + blankDetector.getValveWaterTemp());
                    System.out.println("Current Boiler water temp set to " + boilerTargetWaterTemp);
                                      
                    blankDetector.sendWaterTemp();

                    System.out.println("time left "+i);
                    int waterTempReduction=blankWater.getActualWaterTemp()-1;
                    blankWater.setActualWaterTemp(waterTempReduction);
                    
               //     System.out.println("Actual water temp " + blankDetector.getValveWaterTemp());
               //     System.out.println("Current Boiler water temp set to " + boilerTargetWaterTemp);
                    
//                    System.out.println("To increase water temp press 1, to decrease water temp press 2, do nothing press 3, 0 to exit");
//                    change = scanner.nextInt();
//                    if (change == 1) {
//                        boilerTargetWaterTemp = boilerTargetWaterTemp + 1;
//                        System.out.println("increase water temp by 1 c to " + boilerTargetWaterTemp);
//                        
//                    }
//                    if (change == 2) {
//                        boilerTargetWaterTemp = boilerTargetWaterTemp - 1;
//                        System.out.println("decrease water temp by 1 c to " + boilerTargetWaterTemp);
//                        
//                    }
//                    if (change == 3) {
//                        continue;
//                    }
//                    if (change != 0 && change != 1 && change != 2) {
//                        System.out.println("incorrect entry, try again");
//                    }
//                    if (change == 0) {
//                        System.exit(change);
//                    }
                }
            //}
        }
    }

    public void increaseTemp() {
        System.out.println("increase water temp by 1 C");
        boilerTargetWaterTemp++;
        blankWater.setActualWaterTemp(blankWater.getActualWaterTemp()+1);
        
    }

    public void decreaseTemp() {
        System.out.println("decrease water temp by 1 C");
        boilerTargetWaterTemp--;
        blankWater.setActualWaterTemp(blankWater.getActualWaterTemp()-1);
           }

    public Water getboilerWater() {
        return this.blankWater;
    }

    public int getboilerWaterTemp() {
        return boilerTargetWaterTemp;
    }

    public void boilerWaterConnector(Water water) {
        blankWater = water;
        blankDetector.setValveWaterTemp(blankWater);
        blankHeater.heaterControllerConnector(blankController, blankWater);
        blankController.ControllerHeaterConnector(blankHeater, blankDisplay);
        blankDisplay.displayControllerConnect(blankController);
    }

    public void boilerWaterIn() {
        blankValve.waterInValve(blankWater);
    }

    public void boilerWaterOut() {
        blankValve.waterOutValve();
    }

    public void setTimePeriod(int timeTemp) {
        time=timeTemp;
        System.out.println("time set to "+time);

    }

}
