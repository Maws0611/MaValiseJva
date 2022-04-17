package Atelier3;
import java.util.Scanner;
//Ecrire un programme (fichier nommé TestValeur.java) 
//java qui fait la somme de 2 nombres entiers puis affiche la plus grande valeur

public class TestValeur {
    
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Veuiller saisir un premier nombre entier: ");
        a = input.nextInt();
        System.out.println("Veuiller saisir un 2eme nombre entier: ");
        b = input.nextInt();
        c = a + b ;
        if (a > b) {
        System.out.println("Le premier entier " + a + " est superieur à " + b);
            
        } else {
        System.out.println("Le second entier " + b + " est superieur à " + a);
            
        }
    }
}
