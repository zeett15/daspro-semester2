import java.util.Scanner;

class MataKuliah{
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah(){

    }

    public MataKuliah(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tambahData(){
        String dummy;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kode: ");
            kode = sc.nextLine();

            System.out.print("Nama: ");
            nama = sc.nextLine();

            System.out.print("SKS: ");
            dummy = sc.nextLine();  
            sks = Integer.parseInt(dummy);  

            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();  
            jumlahJam = Integer.parseInt(dummy);

    }

    void cetakData(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah jam  : " + jumlahJam);
    }
}
public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();
        MataKuliah[] arrayOfMatakuliah = new MataKuliah[n]; 

        for (int i = 0; i < n; i++) {
            arrayOfMatakuliah[i] = new MataKuliah();
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].tambahData();
            System.out.println("----------------------------------");
        }

        for (int i = 0; i < n; i++) {
            arrayOfMatakuliah[i].cetakData();
            System.out.println("-----------------------------------");
        }

    }
}    
