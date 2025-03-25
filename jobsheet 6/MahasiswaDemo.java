import java.util.Scanner;

class Mahasiswa{
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa(){

    }

    Mahasiswa(String nm, String name, String kls, double ip){
        nim =nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    void tampilkaninformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("kelas: " + kelas);
        System.out.println("ipk: " + ipk);
    }
}

class MahasiswaBerprestasi {
    public static Mahasiswa [] listMhs;
    int idx;

    void tambah (Mahasiswa m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("System data sudah penuh");
        }
    }
    void tampil(){
        for (Mahasiswa m:listMhs){
            m.tampilkaninformasi();
            System.out.println("-------------------------------------");
        }
    }
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk > listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if(listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    int binarySearch(double cari, int left, int right){
        int mid;
        if (right>=left){
            mid=(left+right)/2;
            if(cari == listMhs[mid].ipk){
                return mid;
            }else if(listMhs[mid].ipk < cari){
                return binarySearch(cari, left, mid-1);
            }else{
                return binarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    void tampilPosisi(double x, int pos){
        if ( pos != -1){
            System.out.println("data mahasiswa dengan ipak " + x + " ditemukan pada indeks " +pos);
        }else{
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos){
        if(pos!=-1){
            System.out.println("nim\t : " +listMhs[pos].nim);
            System.out.println("nama\t : " +listMhs[pos].nama);
            System.out.println("kelas\t : " +listMhs[pos].kelas);
            System.out.println("ipk\t : " +listMhs[pos].ipk);
        }else{
            System.out.println("Data mahasiswa dengan ipk " +x+ " tidak ditemukan");
        }
    }

}
public class MahasiswaDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        System.out.print("Masukan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        list.listMhs = new Mahasiswa[jumMhs];

        for(int i =0; i<jumMhs;i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();  
            Mahasiswa m = new Mahasiswa(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        list.selectionSort();
        list.tampil();
        
        System.out.println("-----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("menggunakan Binary Searching");
        int posisi2 = list.binarySearch(cari, 0, jumMhs);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

    }
}
        // Mahasiswa m1 = new Mahasiswa("123", "Zidan", "2A", 3.2);
        // Mahasiswa m2 = new Mahasiswa("122", "Ayu", "2A", 3.5);
        // Mahasiswa m3 = new Mahasiswa("124", "Sofi", "2A", 3.1);
        // Mahasiswa m4 = new Mahasiswa("125", "Sita", "2A", 3.9);
        // Mahasiswa m5 = new Mahasiswa("126", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);
