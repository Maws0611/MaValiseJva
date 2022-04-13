package collection;

import java.util.*;

public class collection2 extends collection1 {
	
	public static void main(String[] args) {
		System.out.println("Saisissez tois livres nouveaux: ");
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String NouveauLivre = input.nextLine();
			collection1.addNew(NouveauLivre);
		}
		System.out.flush();  
		System.out.println("La nouvelle collection : ");
		System.out.println("===============================");
		collection1.liste();
		
	}
}
