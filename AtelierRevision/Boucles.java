package AtelierRevision;
import java.util.Scanner;

// Écrire un programme (fichier nommé Boucles.java) java 
//qui permet à l’utilisateur de saisir une suite de nombre ensuite le programme doit faire la somme des nombres saisis.

public class Boucles {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Combien de de fois vous voulez ajouter ");
        int a = input.nextInt();
        int boucle[] = new int[a];

    do {
        for (i = 0; i < a; i++) {
            System.out.println("Veuiller saisir un nombre");
            boucle[i] = input.nextInt();
        }
    } while (i < a);
    
    int total = 0;
    for (int j = 0; j < boucle.length; j++) {
        total += boucle[j];
        
    }
    System.out.println("La somme des nombre est de " +total);
    }
}
