package Atelier3;
import java.util.Scanner;

//Écrire un programme (fichier nommé ControleBoucleDoWhile.java) 
//java qui demande la saisie d’un nombre positif.
//Utiliser la boucle do..while pour faire le contrôle.

public class ControleBoucleDoWhile {
    
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Veuiller saisir un nombre positif");

            i = input.nextInt();

        if (i >=0)
        
            System.out.println("Youpi le nombre " + i + " est bien positif");
            
        } while (i<0);
    }
}


