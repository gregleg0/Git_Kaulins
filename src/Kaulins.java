import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
		int rezies;
		Scanner scan = new Scanner(System.in);
		do {
		System.out.print("Cik reizes mest kauliņu: ");
		rezies = scan.nextInt();
		}while(rezies < 1);
		scan.close();
		mestKaulinu(rezies);
	}

	static void mestKaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();
		for(int i = 0; i<reizes;i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
		
		System.out.println("pazinojums :)");

	}


}
