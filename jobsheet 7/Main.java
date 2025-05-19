import java.util.Scanner;

class Mahasiswa{
    String nim;
    String nama;
    String prodi;

    Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilMahasiswa(){
        System.out.print("NIM: " + nim +" |");
        System.out.print("Nama: " + nama+" |");
        System.out.println("Prodi: " + prodi+" |");
    }
}
class MataKuliah{
    String kodeMK;
    String namaMK;
    int sks;

    MataKuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }
    void tampilMK(){
        System.out.print("Kode MK: " + kodeMK + "| ");
        System.out.print("Nama: " + namaMK + " | ");
        System.out.println("SKS: " + sks );

    }
}
class Penilaian{
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah,double tugas, double uts, double uas){
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        nilaiTugas = tugas;
        nilaiUTS = uts;
        nilaiUAS = uas;
        
    }
    void hitungNilaiAkhir(){
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
}

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Mahasiswa []listMhs = new Mahasiswa[3];
    public static MataKuliah [] listMK = new MataKuliah[3];
    public static Penilaian [] listNilai = new Penilaian[5];

    static void tamplikanDaftarMahasiswa(){
        for(Mahasiswa m:listMhs){
            m.tampilMahasiswa();
            
        }
    }
    static void tampilkanDaftarMataKuliah(){
        for(MataKuliah m : listMK){
            m.tampilMK();
        }
    }
    static void tampilkanDataPenilaian(){
        for(Penilaian m:listNilai){
            m.hitungNilaiAkhir();
            System.out.println(m.mahasiswa.nama +" | " +  m.mataKuliah.namaMK+" | " +m.nilaiAkhir);
        }

    }
    static void urutkanMahasiswaBerdasarkanNilaiAkhir(){
        
        for(int i = 0; i < listNilai.length; i++ ){
            listNilai[i].hitungNilaiAkhir();
        }
        for (int i = 0; i < listNilai.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < listNilai.length; j++) {
                if (listNilai[j].nilaiAkhir > listNilai[idx].nilaiAkhir) {
                    idx = j;
                }
            }
            Penilaian tmp = listNilai[idx];
            listNilai[idx] = listNilai[i];
            listNilai[i] = tmp;
        }
        for(Penilaian m:listNilai){
            System.out.println(m.mahasiswa.nama +" | " +  m.mataKuliah.namaMK+" | " +m.nilaiAkhir);
        }
        
    }
    static void cariMahasiswaBerdasarkanNIM(){
        System.out.print("Masukan NIM Mahsasiwa: ");
        String n = sc.nextLine();
        for(int i = 0; i < listMhs.length; i++){
            if(listMhs[i].nim.equalsIgnoreCase(n)){
                System.out.println("Mahasiswa Ditemukan: " + "Nama: " + listMhs[i].nama+ " | " + "NIM: " + listMhs[i].nim + " | " + "Prodi: " + listMhs[i].prodi );
                break;
            }else{
                System.out.println("Mahasiswa dengan nim" + n + "tidak di temukan");
            }
        }
    }
    


    public static void main(String[] args) {
        listMhs[0] = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        listMhs[1] = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        listMhs[2] = new Mahasiswa("22003", "Citra Dewi", "Sistem Informas Bisnis");
        
        
        listMK[0] = new MataKuliah ("MK001", "Struktur Data" , 3);
        listMK[1] = new MataKuliah ("MK002", "Basis Data", 3);
        listMK[2] = new MataKuliah ("MK003", "Desain Web", 3);

        listNilai[0] = new Penilaian(listMhs[0], listMK[0], 80, 85, 90);
        listNilai[1] = new Penilaian(listMhs[0], listMK[1], 60, 75, 70);
        listNilai[2] = new Penilaian(listMhs[1], listMK[0], 75, 70, 80);
        listNilai[3] = new Penilaian(listMhs[2], listMK[1], 85, 90, 95);
        listNilai[4] = new Penilaian(listMhs[2], listMK[2], 80, 90, 65);


        int x =-1;
        do{
            
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampikan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");

            System.out.print("Pilih Menu: ");
            x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    tamplikanDaftarMahasiswa();
                    break;
                case 2: 
                    tampilkanDaftarMataKuliah();
                    break;
                case 3:
                    tampilkanDataPenilaian();
                    break;
                case 4:
                    urutkanMahasiswaBerdasarkanNilaiAkhir();
                    break;
                case 5:
                    
                    cariMahasiswaBerdasarkanNIM();
                    break;
                case 0:
                    System.out.println("TerimaKasih");
                    break;
                default:
                    System.out.println("Nilai Tidak Valid.");
                    break;
            }
        }while (x != 0); 
    }
}