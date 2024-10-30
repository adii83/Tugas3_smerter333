import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KonversiMataUang converter = new KonversiMataUang();

        System.out.println("=== Program Konversi Mata Uang ===");
        System.out.print("Masukkan jumlah Rupiah (IDR): ");
        double rupiah = input.nextDouble();

        int pilihan = 0;
        boolean valid = false;
        while (!valid) {
            try {
                KonversiMataUang.showMenu();
                pilihan = input.nextInt();
                if (pilihan >= 1 && pilihan <= 5) {
                    valid = true;
                } else {
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                input.next(); // Clear invalid input
            }
        }

        double hasilKonversi = converter.convert(rupiah, pilihan);
        String mataUang = getCurrencyCode(pilihan);
        converter.printResult(hasilKonversi, mataUang);

        input.close();
    }

    public static String getCurrencyCode(int pilihan) {
        return switch (pilihan) {
            case 1 -> "USD";
            case 2 -> "EUR";
            case 3 -> "JPY";
            case 4 -> "GBP";
            case 5 -> "AUD";
            default -> "";
        };
    }
}
