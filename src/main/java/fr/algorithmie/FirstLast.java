package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {
        
        int[] array = {1, 15, -3, 0, 8, 7, 1};
        boolean control = array.length >= 1 && array[0] == array[array.length - 1];
        System.out.println(control);
    }
}


