import java.util.Scanner;
public class GambarPersegi {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print(" ");
        int nilai = input.nextInt();

        for (int i = 0; i < nilai; i++) {
            for (int j = 0; j < nilai; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}