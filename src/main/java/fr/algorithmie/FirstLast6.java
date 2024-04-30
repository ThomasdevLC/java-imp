package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
        int[] array = {1, 15, -3, 0, 8, 7, 6};
		boolean control = false;
		
		if (array.length > 0 && array[array.length -1] == 6) {
			control = true;
		}
		System.out.println(control);


	}

}
