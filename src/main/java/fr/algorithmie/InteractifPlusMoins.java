package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		 Random random = new Random();
	        int randomNb = random.nextInt(100) + 1; 
	        System.out.println("Nombre aléatoire entre 1 et 100 : " + randomNb);
	        Scanner scanner = new Scanner(System.in);
	       
	        int guessNb;
	        int[] arrayTry = new int[0]; 
	        int arraySize = 0;
      
	        do {
	            System.out.print("Ecrire un nombre entre 1 et 100 : ");
		        guessNb = scanner.nextInt();
	            int[] newArray = new int[arraySize + 1];
	            for (int i = 0; i < arraySize; i++) {
	                newArray[i] = arrayTry[i];
	            }
	            newArray[arraySize] = guessNb;
	            arrayTry = newArray;
	            arraySize++;
		        
		        } while (guessNb != randomNb);
	        
	        System.out.println("Bravo, vous avez trouvé en " + arrayTry.length + " coups" );
        
	    
	}

}
