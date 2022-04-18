package Atelier6;
import java.util.ArrayList;
import java.util.Scanner;

// Écrire un programme (fichier nommé Collection2.java) java 
//qui permet à l’utilisateur d’ajouter  03 nouveaux livres dans la collection de la tâche N°1.

public class Collection2 {
    public static void main(String[] args) {
        ArrayList<String> livres = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            
            System.out.println("Veuillez ajouter le nom de vos livre");
            livres.add(input.nextLine());
        }
                
        System.out.println("Les livres sont: " + livres);

    }

}
