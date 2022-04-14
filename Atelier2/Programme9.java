package Atelier2;
import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        int a;
        float b;
        String c;

        Scanner input = new Scanner(System.in);
        System.out.println("Veuiller saisir un entier: ");
        a = input.nextInt();

        System.out.println("Veuiller saisir un réel: ");
        b = input.nextFloat();
        input.nextLine();
        System.out.println("Veuiller saisir un text: ");
        c = input.nextLine();

        System.out.println("L'entier saisie est: " + a +  ", Le réel est " + b + "et la chaine de caractere est: " + c);
    }
}
