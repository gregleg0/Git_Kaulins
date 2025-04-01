import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
		int skaitlis, rezies;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("Cik reizes mest kauliņu: ");
		rezies = scan.nextInt();
		scan.close();
		for(int i = 0; i< rezies; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
	
	}

}
