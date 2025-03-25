import java.util.Scanner;

class Dosen{
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    String kelamin(boolean jenisKelamin){
        if(jenisKelamin){
            return "Laki-laki";
        }else{
            return "peempuan";
        }
        
    }

    void tampilkan(){

        System.out.println("Kode: " +kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + kelamin(jenisKelamin));
        System.out.println("Usia: " + usia);
    }
}

class Datadosen {
    Dosen [] dosen = new Dosen[10];
    int idx;

    void tambah (Dosen a){
        if (idx < dosen.length){
            dosen[idx] = a;
            idx++;
        }else{
            System.out.println("System data sudah penuh");
        }
    }
    void tampil(){
        for (Dosen a : dosen){
            a.tampilkan();
            System.out.println("-------------------------------------");
        }
    }
    void sortingASC(){
        for(int i = 0; i<dosen.length -1; i++){
            for(int j = 0; j< dosen.length-i-1; j++){
                if (dosen[j].usia > dosen[j+1].usia){
                    Dosen tmp = dosen[j];
                    dosen[j] = dosen[j+1];
                    dosen[j+1] = tmp;
                }
            }
        }
    }
    void sortingDSC(){
        for (int i = 0; i < dosen.length -1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < dosen.length; j++) {
                if (dosen[j].usia > dosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen tmp = dosen[idxMax];
            dosen[idxMax] = dosen[i];
            dosen[i] = tmp;
        }
    }
    int sequentialSerach(String name){
        int posisi = -1;
        for(int i = 0; i < dosen.length;i++){
            if(dosen[i].nama.equalsIgnoreCase(name)){
                posisi = i;
                
                break;
            }
        }
        return posisi;
    }
    int binarySearch(int umur, int left, int right){
        int mid;
        if(right>=left){
            mid = (right+left)/2;
            if(dosen[mid].usia == umur){
                return mid;
            }else if(dosen[mid].usia > umur){
                return binarySearch(umur, left, mid-1);
            }else{
                return binarySearch(umur, mid+1, right);
            }
        }
        return -1;
    }
    void tampilPosisi(String nama,int umur, int indeksNama, int indeksUmur){
        if ( indeksNama != -1){
            System.out.println("data dosen dengan nama " + nama + " ditemukan pada indeks " +indeksNama);
        }else{
            System.out.println("data " +nama+ " tidak ditemukan");
        }
        if ( indeksUmur != -1){
            System.out.println("data dosen dengan umur " + umur + " ditemukan pada indeks " +indeksUmur);
        }else{
            System.out.println("data " +umur+ " tidak ditemukan");
        }
    }
    void tampilDataSearch(int indeksNama, int indeksUmur){
        if(indeksNama!=-1){
            System.out.println("kode\t : " +dosen[indeksNama].kode);
            System.out.println("nama\t : " +dosen[indeksNama].nama);
            System.out.println("usia\t : " +dosen[indeksNama].usia);
            System.out.println("jenis kelamin: " + dosen[indeksNama].kelamin(dosen[indeksNama].jenisKelamin));
        }
        if(indeksUmur!=-1){
            System.out.println("kode\t : " +dosen[indeksUmur].kode);
            System.out.println("nama\t : " +dosen[indeksUmur].nama);
            System.out.println("usia\t : " +dosen[indeksUmur].usia);
            System.out.println("jenis kelamin: " + dosen[indeksUmur].kelamin(dosen[indeksUmur].jenisKelamin));
        }
        
    }
    
    
}

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Datadosen list = new Datadosen(); 

        Dosen d1 = new Dosen("01", "zaki", true, 28);
        Dosen d2 = new Dosen("02", "burhan", true, 25);
        Dosen d3 = new Dosen("03", "malik", true, 30);
        Dosen d4 = new Dosen("04", "eko", true, 37);
        Dosen d5 = new Dosen("05", "nunung", false, 30);
        Dosen d6 = new Dosen("06", "nur", false, 31);
        Dosen d7 = new Dosen("07", "yayuk", false, 33);
        Dosen d8 = new Dosen("08", "subur", true, 40);
        Dosen d9 = new Dosen("09", "yusran", true, 44);
        Dosen d10 = new Dosen("10", "gina", false, 36);

        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);
        list.tambah(d5);
        list.tambah(d6);
        list.tambah(d7);
        list.tambah(d8);
        list.tambah(d9);
        list.tambah(d10);

        
        list.tampil();
        list.sortingASC();
        System.out.println("-----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------");

        System.out.println("masukkan nama dosen yang dicari: ");
        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.println("masukkan umur dosen yang dicari: ");
        System.out.print("Umur: ");
        int umur = sc.nextInt();

        int indeks = list.sequentialSerach(nama);
        
        int indeks2 = list.binarySearch(umur, 0, list.dosen.length-1);
        
        list.tampilPosisi(nama, umur, indeks, indeks2);
        list.tampilDataSearch(indeks, indeks2);
    }
}
