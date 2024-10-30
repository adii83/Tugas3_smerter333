# Konversi Mata Uang

Program **KonversiMataUang** digunakan untuk mengonversi mata uang dari Rupiah (IDR) ke beberapa mata uang asing, seperti USD, EUR, JPY, GBP, dan AUD.

Program ini mendukung konversi dari IDR ke mata uang asing dengan nilai kurs yang dapat diatur secara manual di dalam kode. Hal ini memungkinkan fleksibilitas untuk mengupdate kurs sesuai kebutuhan.

## Fitur
- Mengonversi nilai dari IDR ke beberapa mata uang asing: USD, EUR, JPY, GBP, dan AUD.
- Mendukung pengaturan kurs secara manual dalam kode agar hasil konversi lebih akurat.

## Cara Menggunakan

1. **Kompilasi Program**: Buka terminal atau command prompt, lalu jalankan perintah berikut untuk mengompilasi program:
   ```bash
   javac KonversiMataUang.java
Jalankan Program: Setelah berhasil dikompilasi, jalankan program dengan perintah berikut:

```bash[]()
java KonversiMataUang 
```

Masukkan Nilai dalam IDR: 

Setelah program dijalankan, masukkan nilai dalam IDR yang ingin Anda konversi, dan program akan menampilkan hasil konversi dalam beberapa mata uang asing sesuai dengan kurs yang diatur.

## Pengaturan Kurs
Nilai kurs disimpan dalam variabel-variabel di dalam kode. Untuk memperbarui kurs, ubah nilai variabel berikut di dalam file KonversiMataUang.java:

java
```bash
private static final double idrToUsd = 0.00007;  // Kurs dari IDR ke USD
private static final double idrToEur = 0.00006;  // Kurs dari IDR ke EUR
private static final double idrToJpy = 0.0078;   // Kurs dari IDR ke JPY
private static final double idrToGbp = 0.00005;  // Kurs dari IDR ke GBP
private static final double idrToAud = 0.0001;   // Kurs dari IDR ke AUD
```
Gantilah nilai sesuai dengan kurs yang paling terbaru untuk mendapatkan hasil konversi yang lebih akurat.

## Contoh
Jika Anda memasukkan nilai 100000 IDR, program akan mengonversi nilai ini ke beberapa mata uang asing, misalnya:
```bash
USD: 7.0
EUR: 6.0
JPY: 780
GBP: 5.0
AUD: 10.0
```
Catatan: Hasil konversi bergantung pada kurs yang diatur dalam kode.