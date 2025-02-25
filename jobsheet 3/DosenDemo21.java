import java.util.Scanner;

class Dosen21{
    String kode;
    String nama;
    boolean jensKelamin;
    int usia;

    public Dosen21(String kode, String nama, boolean jensKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jensKelamin = jensKelamin;
        this.usia = usia;
    }
    
    void tampilkanData(){
        String kelamin;
        if (jensKelamin){
            kelamin = "Laki-laki";
        }else{
            kelamin = "Perempuan";
        }
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis kelamin : " + kelamin);
        System.out.println("usia: " + usia);

    }
}
class DataDosen21{
    public static void dataSemuaDosen(Dosen21[] arrayofdosen){
        for(Dosen21 x : arrayofdosen){
            x.tampilkanData();
            System.out.println("------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen21[] arrayofdosen){
        int jumlahLakiLaki = 0, jumlahPerempuan = 0;

        for(Dosen21 x : arrayofdosen){
            if(x.jensKelamin){
                jumlahLakiLaki++;
            }else{
                jumlahPerempuan++;
            }
        }
        System.out.println("Laki-laki: " + jumlahLakiLaki);
        System.out.println("Perempuan: " + jumlahPerempuan);
    }

    public static void ratarataUsaiPerJenisKelamin(Dosen21[] arrayofdosen){
        int totalPria = 0, totalWanita = 0, jumlahPria = 0, jumlahWanita = 0;

        for (Dosen21 x : arrayofdosen) {
            if (x.jensKelamin) { 
                totalPria += x.usia;
                jumlahPria++;
            } else {
                totalWanita += x.usia;
                jumlahWanita++;
            }
        }
        System.out.println("Rata-rata usia laki-laki: " + ((double)totalPria/jumlahPria));
        System.out.println("Rata-rata usia perempuan: " + ((double)totalWanita/jumlahWanita));
    }

    public static void dosenPalingTua(Dosen21[] arrayOfDosen) {
        Dosen21 dosenTua = arrayOfDosen[0];
        for (Dosen21 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        dosenTua.tampilkanData();
    }
    public static void dosenPalingMuda(Dosen21[] arrayOfDosen) {
        Dosen21 dosenMuda = arrayOfDosen[0];
        for (Dosen21 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        dosenMuda.tampilkanData();
    }
}
public class DosenDemo21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah data dosen yang ingin di input: ");
        int n = sc.nextInt();
        sc.nextLine();

        Dosen21[] dosen = new Dosen21[n];
        String kode, nama, kelamin;
        boolean jensKelamin;
        int usia;

        for(int i = 0; i < n; i++){
            System.out.println("Data dosen ke-" + (i +1));
            System.out.print("Kode: ");
            kode = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("Jenis kelamin(L/P): ");
            kelamin = sc.nextLine();
            jensKelamin = kelamin.equalsIgnoreCase("L");

            System.out.print("Usia: ");
            usia = sc.nextInt();
            sc.nextLine();

            System.out.println("-----------------------------------");
            
            dosen[i] = new Dosen21(kode, nama, jensKelamin, usia);
        }

        System.out.println("\nData Semua Dosen:");
        DataDosen21.dataSemuaDosen(dosen);

        System.out.println("\nJumlah Dosen Per Jenis Kelamin:");
        DataDosen21.jumlahDosenPerJenisKelamin(dosen);

        System.out.println("\nRata-rata Usia Dosen Per Jenis Kelamin:");
        DataDosen21.ratarataUsaiPerJenisKelamin(dosen);

        System.out.println("\nInformasi Dosen Paling Tua:");
        DataDosen21.dosenPalingTua(dosen);

        System.out.println("\nInformasi Dosen Paling Muda:");
        DataDosen21.dosenPalingMuda(dosen);
        
    }
}