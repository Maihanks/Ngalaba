/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteworkstrainee;

import java.util.Scanner;

/**
 *
 * @author MUNURA MAIHANKALI
 * maihankspinas@gmail.com
 **/
public class CatAndMouseChase {
    
    public static String catA = "Cat A", catB = "Cat B", mouseC = "Mouse C"; // the Animals
    public static int catA_StartingPosition = 0, catB_StartingPosition = 0, mousePosition = 0; //Respective Starting positions for the three Animals
    public static int catA_DistanceFromMouse = 0, catB_DistanceFromMouse = 0; // Distances between the respective cats and the mouse

    public static String catAndMouse(int x, int y, int z) {// x, y and z represent cat A, cat B and mouse C positions on the line
        String animal;
        
        //Evaluates the distance(number of units) betwween Cat A and the Mouse C
        if (x > z) {// evaluating the positive value of the number of units between Cat A and Mouse C to enable comparison of unsigned integers
            catA_DistanceFromMouse = x - z;
        } else {
            catA_DistanceFromMouse = z - x;
        }
        //Evaluates the distance(number of units) betwween Cat B and the Mouse
        if (y > z) {// evaluating the positive value of the number of units between Cat B and Mouse C to enable comparison of unsigned integers
            catB_DistanceFromMouse = y - z;
        } else {
            catB_DistanceFromMouse = z - y;
        }

        //Determine which Cat catches the mouse or if the mouse escaped
        if (catA_DistanceFromMouse == catB_DistanceFromMouse) {// Both cats arrived at thesame time, hence the mouse escaped
            animal = mouseC;
        } else if (catA_DistanceFromMouse < catB_DistanceFromMouse) {//Cat A arrived earlier than Cat B, hence Cat A caught the mouse
            animal = catA;
        } else {//Cat B arrived earlier than Cat A, hence Cat B caught the mouse
            animal = catB;
        }

        return animal;
    }

    //Main Method
    public static void main(String[] args) {
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
