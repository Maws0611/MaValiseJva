package Atelier2;
import java.util.Scanner;

//Ecrire un programme (fichier nommé Programme6.java) 
//java qui détermine la moyenne de 5 entiers positif saisis au clavier	
public class Programme6 {
    public static void main(String[] args) {
        int a, b, c, d, e;
        double moy;

        Scanner input = new Scanner(System.in);
        System.out.println("Veuiller saisir un 1ere nombre: ");
        a = input.nextInt();

        System.out.println("Veuiller saisir un 2éme nombre: ");
        b = input.nextInt();

        System.out.println("Veuiller saisir un 3éme nombre: ");
        c = input.nextInt();

        System.out.println("Veuiller saisir un 4éme nombre: ");
        d = input.nextInt();

        System.out.println("Veuiller saisir un 5éme nombre: ");
        e = input.nextInt();

        moy = (a+b+c+d+e) / 5;

        System.out.println("La moyenne est: " +moy);

    }
}
