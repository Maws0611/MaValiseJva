package AtelierRevision;
import java.util.Scanner;


// Écrire un programme (fichier nommé Nombre Paire.java) java 
//qui permet de vérifier si nombre est pair ou impair.
public class NombrePaire {
    public static void main(String[] args) {
        Verify();
    }

    protected static void Verify(){
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        a = input.nextInt();
        b = a % 2;
        if (b==0) {
            System.out.println("Le nombre " + a + " est paire");
        }else {
            System.out.println("Le nombre " + a + " est impaire");
        }
    }
}
