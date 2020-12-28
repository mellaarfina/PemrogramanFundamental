import java.util.Scanner;
class LabelTanggal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int xx = input.nextInt();
		System.out.print(xx);
      
		int nomorBulan = input.nextInt();
			String[] yy = {
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
          System.out.print(" " + yy [nomorBulan - 1] + " ");
        } else if (nomorBulan == 0) {
          System.out.println("Nomor tidak valid");
        } else {
          System.out.println("Nomor tidak valid");
        }
    
		int zzzz = input.nextInt();
		System.out.print (zzzz);
    
	}
}