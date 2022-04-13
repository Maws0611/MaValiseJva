package sayHellow;
import java.lang.*;
import java.util.Scanner;

public class sousProgrmme {

	public static void main(String[] args) {
		double valeur;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre une valeur pour avoir sa racine");
		valeur = scanner.nextInt();
		
		System.out.println(racine(valeur));
	}
	
	public static double racine(double nbre) {
		double carre = Math.sqrt(nbre);
		
		return carre;
	}
}
