package Atelier5;
import java.util.Scanner;

// Écrire un programme java qui permet de saisir les informations 
// d’un tableau puis calcul et affiche la moyenne l
public class Tache2 {
    static double moyenne ;
    public static void main(String[] args) {
        int a, j, l;

        Scanner input = new Scanner(System.in);
        System.out.println("Veuiller saisir le nombre d'élément que vous voulez enrégistrer");
        a = input.nextInt();

        int tab1[]= new int[a];
        l = tab1.length;

        do {
            for (j = 0; j < a; j++)
                {
                    System.out.println("Veuiller saisir un entier");
                    tab1[j] = input.nextInt();
                }
        } while (j<a);

        int sum = 0;
        for (int i = 0; i < a; i++)
            {
                sum += tab1[i];
                moyenne = sum /l;
            }
        System.out.println("La moyenne est: " + moyenne);

    }
}
