import java.util.Locale;
import java.util.Scanner;

class AngkaRibuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Locale bahasa = new Locale("id"); // Bahasa Indonesia

        int harga = input.nextInt();
        System.out.print("Rp");
        System.out.printf(bahasa, "%,d,-\n", harga);
    }
}