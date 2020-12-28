import java.util.Scanner;
public class GarisPersegi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int jumlah = input.nextInt();
          
		for (int i = 1; i <= jumlah; i++) {
		for (int j = 0; j <= jumlah; j++) {
			if (i == 1||i == jumlah||j == 0||j == jumlah) {
			System.out.print("#");
			}
			else {
			System.out.print(" ");
			}
        }    
        System.out.println(" ");
		}

    }
}