import java.util.Scanner;
class MenghitungJumlahPerbaris {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int matriks [][] = new int [5][5];
        
        for (int baris = 0; baris < 5; baris++) {
			for (int kolom = 0; kolom < 5; kolom++) {
				matriks[baris][kolom] = a.nextInt();           
			}
        }
        
        int b = 0;
        for (int baris = 0; baris < 5; baris++) {
			for (int kolom = 0; kolom < 5; kolom++) {

            b += matriks[baris][kolom];
			}
			System.out.println(b);
			b = 0;
        }
    }
}