package Atelier2;
import java.util.Scanner;

// Ecrire un programme (fichier nommé Programme 7.java) 
// java qui demande la saisie d’un entier puis détermine si l’entier saisi est positif, négatif ou nul

public class Programme7 {
    public static void main(String[] args) {
        int z;
        Scanner input = new Scanner(System.in);
        System.out.println("Veuiller saisir un nombre entier: ");
        z = input.nextInt();

        if (z>0) {
            System.out.println(" Le nombre " + z + " est positif");
        } else if (z<0) {
            System.out.println(" Le nombre " + z + " est négatif");
        } else {
            System.out.println(" Le nombre " + z + " est null");
        }

    }
}
