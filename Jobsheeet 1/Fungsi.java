
import java.util.Scanner;

public class Fungsi {
    public static int [][]stokBunga = {{10,5,15,7}, {6,11,9,12}, {2,10,10,5}, {5,7,12,9}};
    public static Scanner sc = new Scanner(System.in);

    public static int Pendapatan(int n) {
        if (n < 0 || n >= stokBunga.length) {
            System.out.println("Nomor gudang tidak valid."); 
        }
        int totalPendapatan = 0;

        int totalAlgonema = stokBunga[n][0] * 75000;
        int totalKelasi = stokBunga[n][1] * 50000;
        int totalAlocasia = stokBunga[n][2] * 60000;
        int totalMawar = stokBunga[n][3] * 10000;

        totalPendapatan = totalAlgonema + totalAlocasia + totalKelasi + totalMawar;
        System.out.println("total penapatan gudang "+ n +": " + totalPendapatan);
        System.out.println();

            return totalPendapatan;
        
    }
    public static void stokBunga() {
        System.out.println("Jumlah Bunga Setiap Cabang:");
        for (int j = 0; j < stokBunga[0].length; j++) { 
            int total = 0;
            String jenisBunga = "";
            switch (j) {
                case 0: jenisBunga = "Aglonema"; break;
                case 1: jenisBunga = "Kelasi"; break;
                case 2: jenisBunga = "Alocasia"; break;
                case 3: jenisBunga = "Mawar"; break;
            }

            for (int i = 0; i < stokBunga.length; i++) { 
                total += stokBunga[i][j];
            }
            System.out.println(jenisBunga + ": " + total);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("              \t\t");
        System.out.println("Aglonema\tKelado\tAlocasia\tMawar");
        for(int i = 0; i<stokBunga.length; i++){
            System.out.print("RoyalGarden "+(i+1)+"\t\t");
            for(int j = 0; j < stokBunga[i].length; j++){
                System.out.print(stokBunga[i][j]+"\t\t");
            }
            System.out.println();
        }

        System.out.println("MENU");
        int x = 0;
        do{
            System.out.println("1. Pendapatan\n2. stok bunga\n3.exit");
            System.out.print("Pilih menu: ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.print("nomer gudang: ");
                    int n = sc.nextInt();
                    Pendapatan(n - 1);
                    break;
                case 2:
                    
                    stokBunga();
                    break;
                case 3:
                    System.out.println("Terima Kasih");
                default:
                    break;
            }
        }while(x != 3);
    }
}