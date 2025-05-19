package SuratIzinProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackSurat stackSurat = new StackSurat();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin Berdasarkan Nama Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String idSurat = scanner.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaMahasiswa = scanner.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Masukkan Jenis Izin (S untuk Sakit, I untuk Izin): ");
                    char jenisIzin = scanner.nextLine().charAt(0);
                    System.out.print("Masukkan Durasi (hari): ");
                    int durasi = scanner.nextInt();
                    scanner.nextLine();

                    Surat21 surat = new Surat21(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stackSurat.terimaSurat(surat);
                    break;

                case 2:
                    stackSurat.prosesSurat();
                    break;

                case 3:
                    stackSurat.lihatSuratTerakhir();
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaCari = scanner.nextLine();
                    stackSurat.cariSurat(namaCari);
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

    }
}
