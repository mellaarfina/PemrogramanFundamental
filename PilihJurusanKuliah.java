import java.util.Scanner;
class PilihJurusanKuliah {
	public static void main(String[] args) {
		String welcome = "Selamat datang di jurusan ";
    
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int jurusan = input.nextInt();
    
		switch (jurusan) {
		case 1 :
			System.out.print( welcome + "Teknik Informatika");
			break;
		case 2 :
			System.out.print( welcome + "Sistem Informasi");
			break;
		case 3 :
			System.out.print( welcome + "Teknik Elektro");
			break;
		case 4 :
			System.out.print( welcome + "Teknik Industri");
			break;
		case 5 :
			System.out.print( welcome + "Matematika Terapan");
			break;
		}
	}
}