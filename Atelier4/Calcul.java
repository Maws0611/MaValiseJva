package Atelier4;
import java.util.Scanner;

// Écrire un programme (fichier nommé Calcul.java) java avec une méthode main (c’est un sous programme).
// Ajouter ces quatre sous programmes :
// un sous programme qui reçoit en paramètre 2 entiers (a et b) puis effectue puis affiche la somme
// un sous programme qui reçoit en paramètre 2 entiers  (a et b) puis effectue puis affiche la différence
//  un sous programme qui reçoit en paramètre 2 entiers  (a et b) puis effectue puis affiche le quotient si possible
//  un sous programme qui reçoit en paramètre 2 entiers  (a et b) puis effectue puis affiche le produit
// Pour chaque saisie, vous devez effectuer un contrôle de saisie

public class Calcul {



    public static void main(String[] args) {
        System.out.println("Faisons la somme" );
        System.out.println("La somme est de: " + Somme());

        System.out.println("Faisons le différence" );
        System.out.println("La diférence est de: " + Difference());

        System.out.println("Faisons la division" );
        System.out.println("Le quotient est de: " + Quotient());

        System.out.println("Faisons le produit" );
        System.out.println("L produit est de: " + Produit());
    }

    static int  Somme () {
        Scanner input = new Scanner(System.in);

        System.out.println("Veuiller saisir un premier nombre entier: ");
        int a = input.nextInt();
        
        System.out.println("Veuiller saisir un second nombre entier: ");
        int b = input.nextInt();

        return (a + b);
    }

    static int Difference () {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Veuiller saisir un premier nombre entier: ");
        a = input.nextInt();
        
        System.out.println("Veuiller saisir un second nombre entier: ");
        b = input.nextInt();

        return (a - b);
        
    }

    static int Quotient () {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Veuiller saisir un premier nombre entier: ");
        a = input.nextInt();
        
        System.out.println("Veuiller saisir un second nombre entier: ");
        b = input.nextInt();
        
            return (a / b);
    }

    static int Produit () {
        Scanner input = new Scanner(System.in);

        System.out.println("Veuiller saisir un premier nombre entier: ");
        int a = input.nextInt();
        
        System.out.println("Veuiller saisir un second nombre entier: ");
        int b = input.nextInt();

        return (a * b);
    }
    
}
