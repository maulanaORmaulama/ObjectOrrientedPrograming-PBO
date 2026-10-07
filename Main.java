import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

        System.out.println("=================================");
        System.out.println("  PROGRAM KALKULATOR GEOMETRI   ");
        System.out.println("=================================");

        while (berjalan) {
            System.out.println("\nPilih Bentuk Geometri:");
            System.out.println("1. BujurSangkar");
            System.out.println("2. Lingkaran");
            System.out.println("3. Silinder");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1-4): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 4) {
                berjalan = false;
                System.out.println("\nISNA GANTENG PAMIT UNDUR DIRI");
                break;
            }

            System.out.print("Masukkan warna: ");
            String warna = scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi: ");
                    double sisi = scanner.nextDouble();
                    BujurSangkar bs = new BujurSangkar(sisi, warna);
                    System.out.println("\n--- HASIL ---");
                    bs.printInfo();
                    break;

                case 2:
                    System.out.print("Masukkan panjang radius: ");
                    double radius = scanner.nextDouble();
                    Lingkaran lk = new Lingkaran(radius, warna);
                    System.out.println("\n--- HASIL ---");
                    lk.printInfo();
                    break;

                case 3:
                    System.out.print("Masukkan panjang radius: ");
                    double radiusSilinder = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();
                    Silinder sl = new Silinder(tinggi, radiusSilinder, warna);
                    System.out.println("\n--- HASIL ---");
                    sl.printInfo();
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}