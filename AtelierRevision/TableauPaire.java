package AtelierRevision;
import java.util.Scanner;
import java.util.ArrayList;

// Écrire un programme (fichier nommé Tableau Paire.java) java 
//qui permet à l'utilisateur de saisir des nombres entiers de manière illimitée.
//Si le nombre saisi par l’utilisateur est un nombre pair, ce dernier doit être sauvegardé dans un tableau. 

public class TableauPaire extends NombrePaire{
    static int c;
    public static void main(String[] args) {
        int a, b;
        ArrayList<Integer> tabPaire = new ArrayList<Integer>();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Combien de fois voulez-vous ajouter");
        a = input.nextInt();

      for (int i = 0; i < a; i++) {
        System.out.println("Veuillez saisir un nombre");
        c = input.nextInt();
      }
            
      b = a % 2;
      if (b==0) {
          tabPaire.add(c);
      }
      System.out.println(tabPaire);
    }
}
