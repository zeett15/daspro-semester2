import java.util.Scanner;

public class SLLMain21 {
    public static SingleLinkList21 sll = new SingleLinkList21();
    public static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("=========================");
        System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
        System.out.println("=========================");
        System.out.println("1. Add First");
        System.out.println("2. Add Last");
        System.out.println("3. Insert After");
        System.out.println("4. Insert Art");
        System.out.println("5. Tampil Data");
        System.out.println("6. Keluar");
        System.out.println("=========================");
        System.out.print("Pilih: ");
    }

    static Mahasiswa21 tambahData() {
        System.out.println("\nMasukkan data mahasiswa");
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);
        System.out.println("Data berhasil ditambahkan!");
        return mhs;
    }

    public static void main(String[] args) {
        // int pilih;
        // do {
        //     menu();
        //     pilih = sc.nextInt();
        //     sc.nextLine();
            
        //     switch(pilih) {
        //         case 1:
        //             sll.addFirst(tambahData());
        //             break;
        //         case 2:
        //             sll.addLast(tambahData());
        //             break;
        //         case 3:
        //             System.out.print("Masukan nama key: ");
        //             String nama = sc.nextLine();
        //             sll.insertAfter(nama, tambahData());
        //             break;
        //         case 4:
        //             System.out.print("Masukan nama indeks: ");
        //             int indeks = sc.nextInt();
        //             sc.nextLine();
        //             sll.insertArt(indeks, tambahData());
        //             break;
        //         case 5:
        //             sll.print();
        //             break;
        //         case 6:
        //             System.out.println("Keluar.");
        //         default:
        //             System.out.println("Pilihan tidak valid!");
        //     }
        // } while (pilih != 6);

        Mahasiswa21 mhs1 = new Mahasiswa21("1234", "Alfaro", "1A", 4.0);
        Mahasiswa21 mhs2 = new Mahasiswa21("1235", "Bimon", "2B", 3.8);
        Mahasiswa21 mhs3 = new Mahasiswa21("1236", "Cintia", "3C", 3.5);
        Mahasiswa21 mhs4 = new Mahasiswa21("1237", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertArt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData( 1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indeksOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeArt( 0);
        sll.print();
    }
}
