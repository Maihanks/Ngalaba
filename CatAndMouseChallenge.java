/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author MUNURA MAIHANKALI
 * maihankspinas@gmail.com
 **/
public class CatAndMouseChallenge {
    

    public static String catAndMouse(int x, int y, int z) {// x, y and z represent cat A, cat B and mouse C positions on the line
         /* Programmer: Maihanks ( Munura Maihankali)
         * maihankspinas@gmail.com
         * Find comments after the return statement
         */          
        String animal; // the Animals
        int catA_DistanceFromMouse = catA_DistanceFromMouse =  Math.max(x, z) -  Math.min(x, z),catB_DistanceFromMouse = Math.max(y, z) -  Math.min(y, z); // Evaluates the Distances between the respective cats and the mouse       
        if (catA_DistanceFromMouse == catB_DistanceFromMouse)      animal = "Mouse C";
        else if (catA_DistanceFromMouse < catB_DistanceFromMouse)  animal = "Cat A";
        else animal = "Cat B";
        return animal;
        /** 
        */
     }

    //Main Method
    public static void main(String[] args) {
    String catA = "Cat A", catB = "Cat B", mouseC = "Mouse C"; // the Animals
    int catA_StartingPosition = 0, catB_StartingPosition = 0, mousePosition = 0; //Respective Starting positions for the three Animals
    int catA_DistanceFromMouse = 0, catB_DistanceFromMouse = 0; // Distances between the respective cats and the mouse

        System.out.println("--------INPUT-------"); //displays header
        Scanner inputScanner = new Scanner(System.in);
        int q = 1;
        try {//check for invalid value supplied for query
            q = inputScanner.nextInt();// input  number of queries            
        } catch (Exception e) {
            System.out.println("Invalid Input value supplied for Query");
        }
        String animal[] = new String[q];
        for (int a = 0; a < q; a++) {//
            try {//check for invalid value supplied for x, y, z
                catA_StartingPosition = inputScanner.nextInt();
                catB_StartingPosition = inputScanner.nextInt();
                mousePosition = inputScanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input value supplied for x, y, z");
            }
            animal[a] = catAndMouse(catA_StartingPosition, catB_StartingPosition, mousePosition);
        }

        System.out.println("\n--------OUPUT-------");
        for (int b = 0; b < q; b++) {//
            System.out.println(animal[b]);
        }

    }

}
