package Atelier6;
// Écrire un programme (fichier nommé Collection3.java) java 
//qui permet de récupérer le livre N°3 et de Supprimer le cinquième livre.

public class Collection3 extends Collection2{
    
    public static void main(String[] args) {

        Ajouter();

        System.out.println("Les livres N°3  est: " + livres.get(2));
        
        System.out.println("Le deuxieme livres est bien supprimé: " + livres.remove(1));
        
        System.out.println("Voici le reste de la collection: " + livres);
    
    }
}
