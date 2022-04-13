package Atelier2;
import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        int a;
        double b;
        char c;

        Scanner input = new Scanner(System.in);
        System.out.println("Veuiller saisir un entier: ");
        a = input.nextInt();

        System.out.println("Veuiller saisir un réel: ");
        b = input.nextDouble();

        System.out.println("Veuiller saisir un text: ");
        c = input.next().CharAt(0);

        System.out.println("L'entier saisie est: " + a +  ", Le réel est " + b + "et la chaine de caractere est: " + c);
    }
}
