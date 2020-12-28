import java.util.Scanner;
class ArrayTerbalik {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nilai[] = new int[5];
    
		for (int a = 0; a < nilai.length; a++) {
		nilai[a] = input.nextInt();
		}
		for (int a = 4; a >= 0; a--) {
		System.out.println(nilai[a]);
		}
    
    }
}