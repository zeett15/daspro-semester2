import java.util.Scanner;

class MataKuliah{
    String mataKulaih;
    int sks;
    int semester;
    String[] hari;

    public MataKuliah(String mataKuliah, int sks, int semesetr,String[] hari){
        this.mataKulaih = mataKuliah;
        this.sks = sks;
        this.semester = semesetr;
        this.hari = hari;
    }

    void jadwalKuliah(String []mataKuliah){
        System.out.println("Jadwal kuliah semester " + semester );
        System.out.print(mataKulaih + "\t\t:");
            for(String h : hari){
                System.out.print(h + " ");
            }
            System.out.println();
        

    }



}
public class DataMataKuliah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        MataKuliah[] mk = new MataKuliah[n];
        for(int i = 0; i < mk.length; i++){
            System.out.print("Masukkan nama mata kuliah: ");
            String mataKuliah = sc.nextLine();

            System.out.println("Masukkan hari (Pisah dengan koma): ");
            String inputHari = sc.nextLine();
            String[] hari = inputHari.split(",\\s*");

            mk[i] = new MataKuliah(mataKuliah, n, i, hari);

        }
        for(MataKuliah mataKuliah : mk){
            mataKuliah.jadwalKuliah(args);
        }


    }
}