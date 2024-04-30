package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arrayNb = new int[10]; 
        
        for (int i = 0; i < arrayNb.length; i++) {
            System.out.print("Ecrire un nombre : ");
            arrayNb[i] = scanner.nextInt(); 
        }
        
        
        int max = arrayNb[0]; 
        
        for (int i = 1; i < arrayNb.length; i++) {
            if (arrayNb[i] > max) {
                max = arrayNb[i]; 
            }
        }
        
        System.out.println("tableau nombres entrés  : " + java.util.Arrays.toString(arrayNb));
        // Affichage de la valeur maximale
        System.out.println(max);
  
    }
}
