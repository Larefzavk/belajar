import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        int h, tk, th;
        String answer;
        answer = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Program menginap di hotel");
        System.out.println("____________");
        System.out.println("|                     | Superior               | Deluxe                 | Premium                |");
        System.out.println("|------------------------------------------------------------------------------------------------|");
        System.out.println("|1-2 hari             | 100.000/night          | 150.000/night          | 200.000/night          |");
        System.out.println("|3-4 hari             | 90.000/night           | 135.000/night          | 180.000/night          |");
        System.out.println("|>=5 hari             | 80.000/night           | 120.000/night          | 160.000/night          |");
        System.out.println("|__|__|__|___|");

        System.out.println("\nTipe Kamar: ");
        System.out.println("1. Superior");
        System.out.println("2. Deluxe");
        System.out.println("3. Premium\n");

        do {
            System.out.print("\nPilih Tipe Kamar: ");
            tk = input.nextInt();
            if (tk == 1) {
                System.out.print("Lama menginap: ");
                h = input.nextInt();
                if (h <= 2) {
                    th = h * 100000;
                    System.out.println("Total Harga: " + th);
                } else if (h <= 4) {
                    th = h * 90000;
                    System.out.println("Total Harga: " + th);
                } else if (h >= 5) {
                    th = h * 80000;
                    System.out.println("Total Harga: " + th);
                }
            } else if (tk == 2) {
                System.out.print("Lama menginap: ");
                h = input.nextInt();
                if (h <= 2) {
                    th = h * 150000;
                    System.out.println("Total Harga: " + th);
                } else if (h <= 4) {
                    th = h * 135000;
                    System.out.println("Total Harga: " + th);
                } else if (h >= 5) {
                    th = h * 120000;
                    System.out.println("Total Harga: " + th);
                }
            } else if (tk == 3) {
                System.out.print("Lama menginap: ");
                h = input.nextInt();
                if (h <= 2) {
                    th = h * 200000;
                    System.out.println("Total Harga: " + th);
                } else if (h <= 4) {
                    th = h * 180000;
                    System.out.println("Total Harga: " + th);
                } else if (h >= 5) {
                    th = h * 160000;
                    System.out.println("Total Harga: " + th);
                }
            }
            System.out.print("\nIngin memesan lagi (Y/N): ");
            answer = input.next();

        } while (answer.equalsIgnoreCase("Y"));
        System.out.println("\nTerima kasih sudah memesan...");
    }
}