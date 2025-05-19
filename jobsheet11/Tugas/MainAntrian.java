package Tugas;
import java.util.Scanner;

public class MainAntrian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianMahasiswa antrian = new AntrianMahasiswa();
        int pilihan;

        do {
            System.out.println("\n===== Menu Antrian =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Cek Jumlah Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = input.nextLine();
                    
                    antrian.tambahAntrian(new Mahasiswa(nim, nama, keperluan));
                    break;
                
                case 2:
                    antrian.panggilAntrian();
                    break;
                
                case 3:
                    antrian.lihatDepan();
                    break;
                
                case 4:
                    antrian.lihatBelakang();
                    break;
                
                case 5:
                    antrian.jumlahAntrian();
                    break;
                
                case 6:
                    System.out.println("Program selesai!");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
        
    }
}
