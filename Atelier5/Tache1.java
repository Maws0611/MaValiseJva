package Atelier5;
import java.util.*;

//Écrire un programme Java qui permet de saisir les informations 
//d’un tableau d’entier puis affiche les informations saisies.

public class Tache1 {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner input = new Scanner(System.in);
        System.out.println("Veuiller saisir le nombre d'élément que vous voulez erégistrer");
        i = input.nextInt();
        int tab[]= new int[i];
        
        do {   
            for (j = 0; j < i; j++) {
                System.out.println("Veuiller saisir un entier");
                tab[j] = input.nextInt();
            } 
        }while (j < i);
    
        for (int k = 0; k < tab.length; k++) {
            System.out.println(tab[k]);
        }

    }
}
