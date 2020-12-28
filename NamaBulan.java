import java.util.Scanner;
class NamaBulan {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int nomorBulan = input.nextInt();
		String[] namaBulan = {
			"Januari",
			"Februari",
			"Maret",
			"April",
			"Mei",
			"Juni",
			"Juli",
			"Agustus",
			"September",
			"Oktober",
			"November",
			"Desember",
		};
    
		if (nomorBulan <= 12 && nomorBulan >= 1) {
		System.out.println (namaBulan[nomorBulan - 1]);
		} else if (nomorBulan == 0) {
		System.out.println("Nomor tidak valid");
		} else {
		System.out.println("Nomor tidak valid");
		}
	}
}