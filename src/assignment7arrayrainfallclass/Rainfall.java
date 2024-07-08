/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment7arrayrainfallclass;

/**
 * This file contains the methods for the RainFall Class
 * 
 */

public class Rainfall 
{
    // class private fields only for rainfall class
    private double[] array; // variable for array
    private double total;  // variable for total and avg methods
    private double avgNum; // variable for avg method
    
    public Rainfall(double[] a) // default constructor with pass argu
    {
    array = a;
    }
    public double totalRainFall() // method to collect total data in array
    {
        for(int index = 0; index < array.length; index++)
        {
            total += array[index]; // adding up the data in total variable 
        }
        System.out.printf(" Total: %.1f\n ", total); // string format to control output
        return total; // returns a double to main
    }
    public double avgRainFall() // method to output the average number 
    {
        for(int index = 0; index < array.length; index++)
        {
            total += array[index]; // adding up the data in total varibale 
        }
        avgNum = total/array.length;
        System.out.printf("Average:%.1f\n ",avgNum); // String format to control one deciaml point output 
        return avgNum; // returns a double to main
    }
    public double mostRainFall() // method  to find the most rain data in the array
    {
        double highest = array[0]; // higest variable starts in array slot 0
        
        for (int index = 1; index < array.length; index++) 
        {
            if(array[index]> highest) // if the number is higher than it would update highest variable
            {
                highest = array[index];
            }
        }
        System.out.printf("Highest: %.1f\n ", highest);// string format to control output to tenths.
        return highest; //returns a double to main
    }
    public double leastRainFall()// method to will ouput lowest rain amount from the array
    {
        double lowest = array[0];
        
        for (int index = 1; index < array.length; index++)
        {
            if(array[index] < lowest) // if lowest variable finds a lower number it will update lowest variable 
            {
                lowest = array[index];
            }
        }
        System.out.printf("Lowest: %.1f\n ", lowest); // string format to control decimal to tenths
        return lowest; //return a double to main
    }
    
}
