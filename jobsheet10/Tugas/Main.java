package Tugas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianKrs antrian = new AntrianKrs(10);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cetak Jumlah Antrian");
            System.out.println("8. Cetak Jumlah Sudah Dilayani");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                System.out.println("Masukan: ");
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = scanner.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scanner.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa dilayani = antrian.panggilAntrian();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.lihatAkhir();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang sudah dilayani: " + antrian.getSudahDilayani());
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }while(pilihan != 0);
    }
}
