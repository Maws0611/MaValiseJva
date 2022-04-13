package Atelier2;
import java.util.Scanner;

//faire le quotient de 2 nombres entiers saisis au clavier
public class Programme4 {
    public static void main(String[] args){
        int X, Y;
        Scanner input = new Scanner(System.in);
        System.out.println("Veuiller saisir un premier nombre entier");
        X = input.nextInt();

        System.out.println("Veuiller saisir un deuxieme nombre entier");
        Y = input.nextInt();

        System.out.println("La somme est : " + (X / Y));
    }
}
