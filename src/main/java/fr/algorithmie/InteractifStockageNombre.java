package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5]; 
        
        int currentIndex = 0; 
        
        while (true) { 
            
            System.out.println("Choisir une option dans le menu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            
            int option = scanner.nextInt();
            System.out.println("Vous avez choisi l'option " + option);
            
            if (option == 1) {
                if (currentIndex < array.length) {
                    System.out.print("Entrez un nombre : ");
                    int nb = scanner.nextInt(); 
                    array[currentIndex] = nb; 
                    currentIndex++; 
                } else {
                    array = Arrays.copyOf(array, array.length * 2);
                }
            } else if (option == 2) {
                System.out.println("Contenu du tableau : " + Arrays.toString(array));
            } 
            
        }
    }
}


