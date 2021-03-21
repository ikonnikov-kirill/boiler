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
public class Heater {

//    private int actualValveWaterTemp;
//    private int targetValveWaterTemp;
 //   private Controller blankController;
    private Water blankWater;
    private int waterTemp;

    public Heater() {
        System.out.println("Heater creater");
    }

    public void heaterControllerConnector(Controller controller, Water water) {
      //  blankController = controller;
        blankWater = water;
    }
    
    public int getWaterTemp () {
        return waterTemp;
    }

    public void waterTempEq(int tempChange) {
       tempChange=tempChange+4;
        blankWater.setActualWaterTemp(tempChange);
       waterTemp=tempChange;
        
        
        
//        actualValveWaterTemp= blankController.getActualWaterTemp();
//        targetValveWaterTemp=blankController.getTargetlWaterTemp();
//        while (true) {
//            if (actualValveWaterTemp <= targetValveWaterTemp - 3) {
//                System.out.println("Current valve water temp " + actualValveWaterTemp + " , target water temp " + targetValveWaterTemp);
//                System.out.println("Actual water temp increase by 1C");
//                actualValveWaterTemp++;
//            }
//
//            if (actualValveWaterTemp >= targetValveWaterTemp - 3) {
//                System.out.println("Actual valve water temp " + actualValveWaterTemp + " boiler set water temp " + targetValveWaterTemp + ". Water temp within range");
//            //System.exit(0);
//            return;
//            }
//        }
    }

}
