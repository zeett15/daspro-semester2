class dosen21{
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    dosen21(){

    }
    
    dosen21(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama =nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilkanInformasi(){
        System.out.println("id dosen: " + idDosen);
        System.out.println("nama: " + nama);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    String setStatusAktif(boolean statusSekarang){
        statusAktif = statusSekarang;
        if (statusAktif){
            return "aktif";
        }else{
            return "Tidak aktif";
        }
    }

    int masaKerja(int tahunSekarang){
        int lamaKerja = tahunSekarang - tahunBergabung;
        return  lamaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
public class DosenMain21 {
    public static void main(String[] args) {
        dosen21 dos1 = new dosen21();
        dos1.idDosen = "12345678";
        dos1.nama = "Muhammad Farhan";
        dos1.bidangKeahlian ="nge-Las";
        dos1.statusAktif = true;
        dos1.tahunBergabung = 2000;

        dos1.ubahKeahlian("nge-Bor");
        dos1.tampilkanInformasi();
        System.out.println("Status: " + dos1.setStatusAktif(false));
        System.out.println("Lama kerja: " + dos1.masaKerja(2025)+ " Tahun");
        System.out.println();
        dosen21 dos2 = new dosen21("12345678", "Putra Arhan", true, 2000, "Malu");
        dos2.ubahKeahlian("Maku");
        dos2.tampilkanInformasi();
        System.out.println("Status: " + dos2.setStatusAktif(true));
        System.out.println("Lama kerja: " + dos2.masaKerja(2025) + " Tahun");

    }
    
}
