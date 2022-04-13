package tableaux;

import java.util.*;

public class sommeTotal {

	public static void main(String[] args) {
		LinkedList<Integer> myTab = new LinkedList<Integer>();
		double input = 0;
		int saisi, sum = 0;
		double moyenne;
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Quel est la longeur du tableau :");
		int longeurTableau = input1.nextInt();
		
		for (int i = 0; i < longeurTableau; i++) {
			System.out.println(i+1 +" ième valeur");
			saisi = input1.nextInt();
			myTab.add(saisi);
			sum+=saisi;
		}
		moyenne = sum/longeurTableau;
		System.out.println("La moyenne des élément(s) du tableau sont : "+moyenne);
	}
}
