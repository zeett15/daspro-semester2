import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaftarFilm df = new DaftarFilm();
        
        int pilihan;
        do {
            System.out.println("\n=========================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=========================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Film: ");
                    String id = sc.next();
                    System.out.print("Masukkan Judul: ");
                    sc.nextLine();
                    String judul = sc.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating = sc.nextDouble();
                    df.tambahDataAwal(id, judul, rating);
                    break;
                case 2:
                    System.out.print("Masukkan ID Film: ");
                    id = sc.next();
                    System.out.print("Masukkan Judul: ");
                    sc.nextLine();
                    judul = sc.nextLine();
                    System.out.print("Masukkan Rating: ");
                    rating = sc.nextDouble();
                    df.tambahDataAkhir(id, judul, rating);
                    break;
                case 3:
                    System.out.print("Masukkan Index: ");
                    int idx = sc.nextInt();
                    System.out.print("Masukkan ID Film: ");
                    id = sc.next();
                    System.out.print("Masukkan Judul: ");
                    sc.nextLine();
                    judul = sc.nextLine();
                    System.out.print("Masukkan Rating: ");
                    rating = sc.nextDouble();
                    df.tambahDataIndex(id, judul, rating, idx);
                    break;
                case 4:
                    df.hapusDataPertama();
                    break;
                case 5:
                    df.hapusDataTerakhir();
                    break;
                case 6:
                    System.out.print("Masukkan ID Film yang akan dihapus: ");
                    id = sc.next();
                    df.hapusDataTertentu(id);
                    break;
                case 7:
                    df.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang dicari: ");
                    id = sc.next();
                    df.cariFilm(id);
                    break;
                case 9:
                    df.urutkanRating();
                    System.out.println("Film telah diurutkan berdasarkan rating!");
                    df.print();
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 10);
        
        sc.close();
    }
}