package Atelier2;
import java.util.Scanner;

//Ecrire un programme (fichier nommé Programme 5.java) java qui fait le quotient de 2 
//nombres entiers saisis au clavier. Fait le contrôle du diviseur qui ne doit pas être nul 

public class Programme5 {
    public static void main(String[] args){
        int X;
        int Y;
        Scanner input = new Scanner(System.in);
        System.out.println("Veuiller saisir un premier nombre entier");
        X = input.nextInt();

        System.out.println("Veuiller saisir un deuxieme nombre entier");
        Y = input.nextInt();

        System.out.println("Le résultat est : " + (X / Y));
    }
}
