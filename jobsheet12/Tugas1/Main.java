import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianVaksin antrian = new AntrianVaksin();
        int pilihan;
        
        do {
            System.out.println("\n===========================");
            System.out.println("PROGRAM ANTRIAN VAKSINASI");
            System.out.println("===========================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            
            switch(pilihan) {
                case 1:
                    System.out.println("\nMasukkan Data Penerima");
                    System.out.print("No Identitas: ");
                    int noIdentitas = input.nextInt();
                    input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    antrian.tambahAntrian(nama, noIdentitas);
                    break;
                    
                case 2:
                    antrian.hapusAntrian();
                    break;
                    
                case 3:
                    antrian.lihatAntrian();
                    break;
                    
                case 4:
                    System.out.println("Program Selesai!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        } while (pilihan != 4);
        
        input.close();
    }
}
