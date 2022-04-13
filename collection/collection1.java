package collection;

import java.util.*;

public class collection1 {
	
	protected static ArrayList<String> livres = new ArrayList<String>();
	
	protected static void liste() {

		
		livres.add("Les nouveau contes d'Amadou COUMBA");
		livres.add("Femme noire");
		livres.add("Soleil des indépendaces");
		livres.add("Le vieux négre et la médaille");
		
		getList(livres);
	}
	
	protected static void getList(ArrayList<String> data) {
		for(String item : data ) {
			System.out.println(item);
		}		
	}
	
	protected static void addNew(String livre) {
		livres.add(livre);
//		getList(livres);
	}
}

