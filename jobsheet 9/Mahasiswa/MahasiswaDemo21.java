package Mahasiswa;
import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih = -1;
        StackTugasMahasiswa21 stack = new StackTugasMahasiswa21(5);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Tugas Terbawah");
            System.out.println("5. Melihat Daftar Tugas");
            System.out.println("6. Jumlah tugas terkumpul");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
        
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa21 mhs = new Mahasiswa21(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
        
                case 2:
                    Mahasiswa21 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("nilai biner tugas: " + biner);
                    }
                    break;
        
                case 3:
                    Mahasiswa21 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                Mahasiswa21 lihat1 = stack.peekTerbawah();
                if (lihat1 != null) {
                    System.out.println("Tugas pertama1 dikumpulkan oleh " + lihat1.nama);
                }
                break;
                case 5:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 6:
                    int jumlah = stack.jumlahTugas();
                    System.out.println("jumlah tugas dikumpulkan " + jumlah);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
        

    }
}
