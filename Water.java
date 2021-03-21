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
public class Water {

    int waterTemp;

    public Water(int waterTemp1) {
        System.out.println("Water created");
        waterTemp = waterTemp1;
    }

    public int getActualWaterTemp() {
        return waterTemp;
    }

    public void setActualWaterTemp(int water) {
        waterTemp = water;
        
        System.out.println("actual water temp " + waterTemp);
    }

}
