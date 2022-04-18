package Atelier6;
import java.util.ArrayList;
import java.util.Scanner;
// Écrire un programme (fichier nommé Collection3.java) java 
//qui permet de récupérer le livre N°3 et de Supprimer le cinquième livre.

public class Collection3 extends Collection2{
    
    public static void main(String[] args) {

        ArrayList<String> livres = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            
            System.out.println("Veuillez ajouter le nom de vos livre");
            livres.add(input.nextLine());
        }
                
        System.out.println("Les livres sont: " + livres);
        
        System.out.println("Récupérer le livre N°3: " + livres.get(2));
        
        System.out.println("Le deuxieme livres est bien supprimé: " + livres.remove(1));
        
        System.out.println("Voici le reste de la collection: " + livres);
    
    }
}
