package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

	public static void main(String[] args) {
	    
	    int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	    
	    int[] arrayCopy = new int[array.length];
	    
	    for (int i = array.length - 1; i >= 0; i--) {
	    	arrayCopy[array.length - 1 - i] = array[i]; 
	    }
	    
	    // Affichage des tableaux array et arrayCopy
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayCopy));
	}

}