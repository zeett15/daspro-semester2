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

public class MahasiswaBerprestasi {
    public static Mahasiswa [] listMhs = new Mahasiswa[5];
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
    void bubblesort(){
        for(int i = 0; i<listMhs.length-1; i++){
            for(int j = 1; j< listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;  
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("123", "Zidan", "2A", 3.2);
        Mahasiswa m2 = new Mahasiswa("122", "Ayu", "2A", 3.5);
        Mahasiswa m3 = new Mahasiswa("124", "Sofi", "2A", 3.1);
        Mahasiswa m4 = new Mahasiswa("125", "Sita", "2A", 3.9);
        Mahasiswa m5 = new Mahasiswa("126", "Miki", "2A", 3.7);

        list.tambah(m2);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        // for(int i =0; i<listMhs.length;i++){
        //     System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
        //     System.out.print("NIM: ");
        //     String nim = sc.nextLine();
        //     System.out.print("Nama: ");
        //     String nama = sc.nextLine();
        //     System.out.print("Kelas: ");
        //     String kelas = sc.nextLine();
        //     System.out.print("IPK: ");
        //     double ipk = sc.nextDouble();
        //     sc.nextLine();  
        //     Mahasiswa m = new Mahasiswa(nim, nama, kelas, ipk);
        //     list.tambah(m);
        // }
    

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubblesort();
        // list.tampil();

        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK menggunakan selection sort (ASC) : ");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK menggunakan Insertion sort (DES) : ");
        list.insertionSort();
        list.tampil();

    }
}
