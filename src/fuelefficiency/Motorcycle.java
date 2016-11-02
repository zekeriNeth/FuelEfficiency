/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author zanea7326
 */
public class Motorcycle extends Vehicle {
       @Override
       public double distance(double x){
           //Calculates distance
           double distance=16.87*x;
           
           //returns distance
           return distance;
           
       }

}
