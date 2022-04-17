package Atelier4;
import java.util.*;
public class ChoixNombreDePersonne {
    static Object arr[] = new Object[7];

    static void  Saisie(){

        Scanner input = new Scanner(System.in);

            System.out.println("Veuiller saisir votre prénom: ");
            arr[0] = input.nextLine();

            System.out.println("Veuiller saisir votre nom: ");
            arr[1] = input.nextLine();

            System.out.println("Veuiller saisir votre adresse: ");
            arr[2] = input.nextLine();

            System.out.println("Veuiller saisir votre date de naissance: ");
            arr[3] = input.nextLine();
            
            System.out.println("Veuiller saisir votre lieu de naissance: ");
            arr[4] = input.nextLine();

            System.out.println("Veuiller saisir votre numéro de  telephone: ");
            arr[5] = input.nextLine();

            System.out.println("Veuiller saisir votre  matricule: ");
            arr[6] = input.nextInt();
    }

    static void Afficher (){
        
            System.out.println("Votre prénom c'est: " + arr[0] + " Votre nom: " + arr[1] + ", habite à " + arr[2] + ", né(e) le  " + arr[3] + " à " + arr[4] + 
            ", Numero de telephone: " + arr[5] + ", Matricule: " + arr[6]);
    }


    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Veuiller saisir le nombre de personne que vous voulez enrégistrer");
        a = input.nextInt();
            for (int i = 0; i < a; i++) {
                Saisie();
                Afficher ();
            }
        }
}