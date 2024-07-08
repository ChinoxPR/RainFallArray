/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment7arrayrainfallclass;
import javax.swing.JOptionPane; // import the users input
/**
 *
 * @author John Hernandez 7/7/24
 */
public class Assignment7ArrayRainFallClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String str; // varibale for user input 
        double[] months = {1,2,3,4,5,6,7,8,9,10,11,12}; // array with 12 months
        Rainfall rainFallClass = new Rainfall(months); // object for rainfall class
        
        for(int index = 0; index < months.length; index++) // collect user input for array 
        {
            str = JOptionPane.showInputDialog("Input amout of rainfall for slot " + index );
            months[index]= Double.parseDouble(str);
        }
        // calls the methods from the RainFall class 
        rainFallClass.totalRainFall();
        rainFallClass.avgRainFall();
        rainFallClass.mostRainFall();
        rainFallClass.leastRainFall();
         
    }
    
}
