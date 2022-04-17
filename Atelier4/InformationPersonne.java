package Atelier4;
import java.util.Scanner;

// Une personne se caractérise dans notre contexte par un matricule, son nom,
// prénom, adresse, date de naissance, lieu de naissance et son numéro de téléphone. 
//Ecrire un sous-programme qui permet la saisie des informations d’une personne donnée
// Ecrire un sous-programme qui permet d’afficher les informations d’une personne saisie
// Choisissez un nom pour le programme.

public class InformationPersonne {
    static Object arr[] = new Object[7];

    public static void main(String[] args) {
        Saisie();
        Afficher ();
    }
    public static void  Saisie (){

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

    public static void Afficher (){
        
            System.out.println("Votre prénom c'est: " + arr[0] + " Votre nom: " + arr[1] + ", habite à " + arr[2] + ", né(e) le  " + arr[3] + " à " + arr[4] + 
            ", Numero de telephone: " + arr[5] + ", Matricule: " + arr[6]);
    }
}