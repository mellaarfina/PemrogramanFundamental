import java.util.Scanner;
class ArrayTerbalik2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int qwerty = input.nextInt();
		int []jumlah = new int[qwerty];
    
		for (int x = 0; x < qwerty; x++) {
		jumlah[x] = input.nextInt();
		} 
		for (int x = qwerty - 1; x >= 0; x--) {
		System.out.print(jumlah[x] + " ");
		}
	}
}