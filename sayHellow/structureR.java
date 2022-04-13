package sayHellow;
import java.util.Scanner;
public class structureR {

	public static void main(String[] args) {
		//un programme qui calcule la somme des 4 premier valeurs saisies avec la boucle do..while
		
		int sum = 0, n, i=0;
		Scanner scanner = new Scanner(System.in);
		
		while (i<4) {	
			System.out.println("Entrez un nombre : "+(i+1));
			n = scanner.nextInt();
			sum += n;
			i++;
		}
		
		System.out.println("La somme des 4 nombres est : "+sum);
	}
}
