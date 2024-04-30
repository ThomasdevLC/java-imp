package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		  	int[] arrayOne = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	        int[] arrayTwo = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1}; 
	        
	        int accOne = 0; 
	        int accTwo = 0; 
	        
	        for (int i = 0; i < arrayOne.length; i++) {
	            accOne += arrayOne[i];
	        }
	        
	        for (int i = 0; i < arrayTwo.length; i++) {
	            accTwo += arrayTwo[i];
	        }
	        
	        int[] sum = new int[1]; 
	        sum[0] = accOne + accTwo;
	        
	        // Affichage de la somme dans le  tableau 
	        System.out.println(sum[0]);
		
	}

}
