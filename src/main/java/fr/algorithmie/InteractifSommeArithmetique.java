package fr.algorithmie;

import java.util.Scanner;

class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre : ");
        int nmbr = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 1; i <= nmbr; i++) {
            sum += i;
        }

        System.out.println("La somme des entiers de 1 à " + nmbr + " est : " + sum);
    }
}

