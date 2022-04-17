package Atelier3;

//Ecrire un programme (fichier nommé BoucleDoWhile.java) java qui affiche 1 2 3 4 5 dans l’ordre

public class BoucleDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<6);
    }
}
