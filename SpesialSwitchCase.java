import java.util.Scanner;
class SpesialSwitchCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("");
		int angka = input.nextInt();
    
		switch (angka) {
		case 1 :
			System.out.println("Satu");
			System.out.println("Dua");
			System.out.println("Tiga");
			break;      
		case 2 :
			System.out.println("Dua");
			System.out.println("Tiga");
			break;       
		case 3 :
			System.out.print("Tiga");
			break;
    }
  }
}