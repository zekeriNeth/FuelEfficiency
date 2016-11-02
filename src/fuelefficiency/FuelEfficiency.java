/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author zanea7326
 */
public class FuelEfficiency {
    public static Scanner input=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Create an aray of vehicle names
        String vehicles[] = new String[4];
        vehicles[0] = "Truck";
        vehicles[1] = "Car";
        vehicles[2] = "Hybrid Car";
        vehicles[3] = "Motorcycle";
        
        System.out.println("How many litres do you want to use?");
        //prompt user for litres
        double litres=input.nextDouble();
        
        //Create an array of vehicles
        Vehicle theArray[] = new Vehicle[4];
         
        //fill the array
        theArray[0] = new Truck();
        theArray[1] = new Car();
        theArray[2] = new HybridCar();
        theArray[3] = new Motorcycle();
        
        //Output the distance
        for(int i=0;i<4;i++){
            System.out.println("The "+vehicles[i]+" can drive "+theArray[i].distance(litres)+"km");
        }
    }
    
}
