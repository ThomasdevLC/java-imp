package fr.algorithmie;
import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//ensemble des éléments du tableau 
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//ensemble des éléments dans l’ordre inverse
		for (int i = array.length - 1; i >= 0; i--) {
		    System.out.println( array[i]);
		};
		
		//copie du tableau array dans arrayCopy
		int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(arrayCopy));

	}

}
