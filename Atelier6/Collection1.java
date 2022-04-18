package Atelier6;
import java.util.ArrayList;

// Ecrire un programme (fichier nommé Collection1.java) 
// java qui crée un ArrayList des livres Africains et Affichez la collection

public class Collection1 {
    protected static ArrayList<String> livres = new ArrayList<>();
    public static void main(String[] args) {

        AddLivre("Nation négre et culture");
        
        System.out.println("Les livres sont: " + livres);
    }
    protected static void AddLivre(String livre) {
        livres.add(livre);
    }

    protected static void GetLivre(int i){
        livres.get(i);
    }
}
