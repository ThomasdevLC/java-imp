package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
		
	public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        int nb;

	        do {
	            System.out.print("Ecrire un nombre entre 1 et 10 : ");
	            nb = scanner.nextInt();
	        } while (nb < 1 || nb > 10);
	        
	        
			int[] array = {1,2,3,4,5,6,7,8,9,10} ; 
	        
	        for (int i = 0; i < array.length; i++) {
	             { 
	                System.out.println(nb + array[i]); 
	            }
	        }
	    

	}

}
