
import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukan Nilai Tugas: ");
        tugas = sc.nextInt();
        System.out.print("Masukan Nilai Kuis: ");
        kuis = sc.nextInt();
        System.out.print("Masukan Nilai UTS: ");
        uts = sc.nextInt();
        System.out.print("Masukan Nilai UAS: ");
        uas = sc.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas < 0 || tugas >100 || kuis < 0 || kuis >100 || uts < 0 || uts >100 || uas < 0 || uas >100) {
            System.out.println("Nilai tidak Valid!");
            System.out.println("==============================");
            System.out.println("==============================");
            
        }else{
            double nilaiAkhir = (tugas * 0.2)+(kuis * 0.2) + (uts * 0.3) + (uas * 0.3); 
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                System.out.println("Nilai Huruf : A");
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("SELAMAT ANDA LULUS");
                System.exit(0);
            }
            else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                System.out.println("Nilai Huruf : B+");
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("SELAMAT ANDA LULUS");

            }
            else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai Huruf : B");
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("SELAMAT ANDA LULUS");
            }
            else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai Huruf : C+");
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("SELAMAT ANDA LULUS");
            }
            else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                System.out.println("Nilai Huruf : C");
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("SELAMAT ANDA LULUS");
            }
            else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai Huruf : D");
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("SELAMAT ANDA TIDAK LULUS");
            }
            else if (nilaiAkhir <= 39) {
                System.out.println("Nilai Huruf: E");
                System.out.println("==============================");
                System.out.println("==============================");
                System.out.println("SELAMAT ANDA TIDAK LULUS");
            }
        }
        
        System.exit(0);
    }
}