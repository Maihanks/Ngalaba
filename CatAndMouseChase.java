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
public class CatAndMouseChase {
    

    public static String catAndMouse(int x, int y, int z) {/* x, y and z represent cat A, cat B and mouse C positions on the line*/
        /* Programmer: Munura Maihankali (Maihanks)
         * Email: maihankspinas@gmail.com, Tel: +2348068816818
         */        
        String animal; /* the Animals - cat A, cat B, mouse C */
        int catA_DistanceFromMouse = Math.abs(x - z) ,catB_DistanceFromMouse = Math.abs(y - z); /* Evaluates the Absolute(positive) Distances between the respective cats and the mouse */      
        if (catA_DistanceFromMouse == catB_DistanceFromMouse)      animal = "Mouse C";/* both cats are equal distance from mouse, hence mouse escapes*/
        else if (catA_DistanceFromMouse < catB_DistanceFromMouse)  animal = "Cat A";/* cat A is closer to mouse than cat B, hence cat A catches the mouse */
        else animal = "Cat B"; /* cat B is closer to mouse  than cat A, hence cat B catches the mouse*/
        return animal;
     }
      


    /*Main Method*/
    public static void main(String[] args) {    
    int catA_StartingPosition = 0, catB_StartingPosition = 0, mousePosition = 0; //Respective Starting positions for the three Animals
    int catA_DistanceFromMouse = 0, catB_DistanceFromMouse = 0; // Distances between the respective cats and the mouse

        System.out.println("--------INPUT-------"); //displays header
        Scanner inputScanner = new Scanner(System.in);
        int q = 1;
        try {/*check for invalid value supplied for query*/
            q = inputScanner.nextInt();// input  number of queries            
        } catch (Exception e) {
            System.out.println("Invalid Input value supplied for Query");
        }
        String animal[] = new String[q];
        for (int a = 0; a < q; a++) {//
            try {/*check for invalid value supplied for x, y, z*/
                catA_StartingPosition = inputScanner.nextInt();
                catB_StartingPosition = inputScanner.nextInt();
                mousePosition = inputScanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input value supplied for x, y or z");
            }
            animal[a] = catAndMouse(catA_StartingPosition, catB_StartingPosition, mousePosition);
        }

        System.out.println("\n--------OUPUT-------");
        for (int b = 0; b < q; b++) {/*dispay output*/
            System.out.println(animal[b]);
        }

    }

}
