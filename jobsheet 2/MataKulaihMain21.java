class MataKuliah21{
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah21(){

    }

    public MataKuliah21(String kodeMK, String nama, int sks, int jam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jam;
    }

    void tampilkanInformasi(){
        System.out.println("KodeMK: " + kodeMK);
        System.out.println("nama: " + nama);
        System.out.println("sks: " + sks);
        System.out.println("Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangJam(int jam){
        jumlahJam -= jam;
    }
}
public class MataKulaihMain21 {
    public static void main(String[] args) {
        MataKuliah21 mk1 = new MataKuliah21();
        mk1.kodeMK = "AB";
        mk1.nama = "B. Inggris";
        mk1.sks = 3;
        mk1.jumlahJam = 0;

        mk1.tambahJam(6);
        mk1.ubahSKS(2);
        mk1.kurangJam(2);
        mk1.tampilkanInformasi();
        
        System.out.println();
        
        MataKuliah21 mk2 = new MataKuliah21("AC", "MTK", 2, 0);
        mk2.tambahJam(4);
        mk2.ubahSKS(1);
        mk2.kurangJam(2);
        mk2.tampilkanInformasi();
    }
}
