class Mahasiswa{
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa(){

    }

    public Mahasiswa(String nm, String nama, double ipk, String kls){
        nim =nm;
        this.nama = nama;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: "+ ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        ipk = ipkBaru;
    }

    String niaiKinerja(){
        if(ipk<= 3.5){
            return "Kinerja sangat baik";
        }else if(ipk <= 3.0){
            return"Kinerja baik";
        }else if(ipk <= 2.0){
            return"Kinerja cukup";
        }else{
            return "Kinerja kurang";
        }  
    }
}

public class MahasiswaMain21 {
    
    public static void main(String[] args) {
        Mahasiswa mhsl = new Mahasiswa();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "244107020071";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.niaiKinerja();
        mhsl.tampilkanInformasi();

        Mahasiswa mhs2 = new Mahasiswa("244107020009", "Annisa Nabila  ", 3.60, "TI 2L");
        mhs2.updateIpk(3.3);
        mhs2.tampilkanInformasi();

        Mahasiswa mhsQruzeetaPrasna = new Mahasiswa("244107020084", "Qruzeeta Prasna Umeri Al Jawy", 3.69, "TI 1A");
        mhsQruzeetaPrasna.tampilkanInformasi();

    }
}
