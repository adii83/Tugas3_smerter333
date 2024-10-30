/**
 * Kelas KonversiMataUang digunakan untuk melakukan konversi dari mata uang IDR (Indonesian Rupiah)
 * ke beberapa mata uang lainnya, seperti USD, EUR, JPY, GBP, dan AUD.
 */
public class KonversiMataUang {

    /** Nilai kurs konversi dari IDR ke USD. */
    double idrToUsd;

    /** Nilai kurs konversi dari IDR ke EUR. */
    double idrToEur;

    /** Nilai kurs konversi dari IDR ke JPY. */
    double idrToJpy;

    /** Nilai kurs konversi dari IDR ke GBP. */
    double idrToGbp;

    /** Nilai kurs konversi dari IDR ke AUD. */
    double idrToAud;

    /**
     * Konstruktor untuk kelas KonversiMataUang yang menginisialisasi nilai kurs konversi
     * dari IDR ke mata uang lainnya.
     */
    public KonversiMataUang() {
        this.idrToUsd = 0.000065;  // 1 IDR = 0.000065 USD
        this.idrToEur = 0.000061;  // 1 IDR = 0.000061 EUR
        this.idrToJpy = 0.0097;    // 1 IDR = 0.0097 JPY
        this.idrToGbp = 0.000053;  // 1 IDR = 0.000053 GBP
        this.idrToAud = 0.00010;   // 1 IDR = 0.00010 AUD
    }

    /**
     * Menampilkan menu pilihan mata uang.
     */
    public static void showMenu() {
        System.out.println("Pilih mata uang tujuan:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. JPY");
        System.out.println("4. GBP");
        System.out.println("5. AUD");
        System.out.print("Masukkan pilihan Anda: ");
    }

    /**
     * Mengonversi jumlah dalam IDR ke mata uang lain berdasarkan pilihan.
     *
     * @param rupiah  Jumlah dalam mata uang IDR yang akan dikonversi.
     * @param pilihan Pilihan mata uang tujuan konversi:
     *                1 untuk USD, 2 untuk EUR, 3 untuk JPY, 4 untuk GBP, 5 untuk AUD.
     * @return Hasil konversi dalam bentuk double, nilai hasil konversi ke mata uang yang dipilih.
     */
    public double convert(double rupiah, int pilihan) {
        double hasilKonversi = 0;
        switch (pilihan) {
            case 1 -> hasilKonversi = rupiah * idrToUsd;
            case 2 -> hasilKonversi = rupiah * idrToEur;
            case 3 -> hasilKonversi = rupiah * idrToJpy;
            case 4 -> hasilKonversi = rupiah * idrToGbp;
            case 5 -> hasilKonversi = rupiah * idrToAud;
            default -> System.out.println("Pilihan mata uang tidak valid.");
        }
        return hasilKonversi;
    }

    /**
     * Menampilkan hasil konversi ke mata uang yang dipilih.
     *
     * @param hasilKonversi Hasil konversi dalam mata uang yang dipilih.
     * @param mataUang      Nama atau kode mata uang tujuan.
     */
    public void printResult(double hasilKonversi, String mataUang) {
        if (!mataUang.isEmpty()) {
            System.out.printf("Hasil konversi: %.2f %s%n", hasilKonversi, mataUang);
        } else {
            System.out.println("Konversi gagal karena pilihan tidak valid.");
        }
    }
}
