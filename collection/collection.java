package collection;

import java.util.LinkedList;

public class collection {

	public static void main(String[] args) {
		LinkedList<Integer> ma_liste = new LinkedList<Integer>();
		
		ma_liste.add(3);
		ma_liste.add(0);
		ma_liste.add(10);
		ma_liste.add(-1);
		
		ma_liste.removeFirst();
		System.out.println(ma_liste);
	}

}
