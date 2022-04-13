package sayHellow;
import java.util.Scanner;

public class structureC {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre un nombre pour savoir c'est quel mois");
		int mois = scanner.nextInt();
		
		switch (mois) {
		case 1:
			System.out.println("janvier");
			break;
		case 2:
			System.out.println("février");
			break;
		case 3:
			System.out.println("mars");
			break;
		case 4:
			System.out.println("avril");
			break;
		case 5:
			System.out.println("mai");
			break;
		case 6:
			System.out.println("juin");
			break;
		case 7:
			System.out.println("juillet");
			break;

		default:
			System.out.println("Entre");
			break;
		}
	}

}
