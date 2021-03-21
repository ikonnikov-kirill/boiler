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
public class Main {

    public static void main(String[] args) {
        
        Boiler oneBoiler = new Boiler(55);
        Water oneWater = new Water(12);
        oneBoiler.boilerWaterConnector(oneWater);
        oneBoiler.boilerWaterIn();
        //  oneBoiler.boilerWaterOut();
        oneBoiler.setTimePeriod(20);
        oneBoiler.start();
    }
}
