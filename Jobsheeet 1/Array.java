
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        System.out.print("masukan total MK: ");
        int mk = sc.nextInt();

        String []mataKuliah = new String[mk];
        int [] sks = new int[mk] ;
        int [] nilaiAngka = new int[mk] ;
        String []nilaiHuruf = new String[mk];
        double [] nilaiSetara = new double[mk];

        for(int i = 0; i < mk; i++){
            System.out.println(i+".");
            System.out.print("Masukan Mata Kuliah: ");
            mataKuliah [i] = str.nextLine();
            System.out.print("Masukan jumlah SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Masukan Nilai: ");
            nilaiAngka[i] = sc.nextInt();
            System.out.println();
        }
        for(int i = 0; i < mk; i++){
            if(nilaiAngka[i] > 80 && nilaiAngka[i] <= 100){
                nilaiHuruf[i] = "A";
                nilaiSetara [i] = 4;
            }else if(nilaiAngka[i] > 73 && nilaiAngka[i] <= 80){
                nilaiHuruf[i] = "B+";
                nilaiSetara [i] = 3.5;
            }if(nilaiAngka[i] > 65 && nilaiAngka[i] <= 73){
                nilaiHuruf[i] = "B";
                nilaiSetara [i] = 3;
            }if(nilaiAngka[i] > 60 && nilaiAngka[i] <= 65){
                nilaiHuruf[i] = "C+";
                nilaiSetara [i] = 2.5;
            }if(nilaiAngka[i] > 50 && nilaiAngka[i] <= 60){
                nilaiHuruf[i] = "C";
                nilaiSetara [i] = 2;
            }if(nilaiAngka[i] > 39 && nilaiAngka[i] <= 50){
                nilaiHuruf[i] = "D";
                nilaiSetara [i] = 1;
            }if(nilaiAngka[i] <= 39){
                nilaiHuruf[i] = "E";
                nilaiSetara [i] = 0;
            }
            
        }
        System.out.println("===================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===================================");
        System.out.println("MK\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for(int i =0; i < mk; i++){
            System.out.print(mataKuliah[i]+"\t\t");
            System.out.print(nilaiAngka[i]+ "\t\t");
            System.out.print(nilaiHuruf[i]+"\t\t");
            System.out.print(nilaiSetara[i]+"\t");
            System.out.println();
        }
        System.out.println("===================================");
        double bobotsks = 0, tsks = 0;
        for(int i = 0; i < mk;i++){
            bobotsks += nilaiSetara[i]* sks[i];
            tsks += sks[i];
        }

        double ip = bobotsks / tsks;
        System.out.println("IP: " + ip);

    }
    

    
}
