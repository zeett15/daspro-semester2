import java.util.Scanner;

class Pangkat{
    int nilai, pangkat;

    Pangkat(int n, int p){
        nilai = n;
        pangkat = p;
    }

    int pangkatBF (){
        int hasil = 1;
        for(int i = 0; i<pangkat; i++){
            hasil = hasil * nilai;
        }
        return hasil;
    }
    int pangkatDC(int a, int n){
        if (n == 1){
            return a;
        }else{
            if (n%2 == 1){
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }

}

public class PangkatMain {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukan jumlah elemen: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i = 0; i<elemen; i++){
            System.out.print("Masukan jumlah basis elemen ke " + (i+1) +": ");
            int basis = sc.nextInt();
            System.out.print("Masukan jumlah pangkat elemen ke " + (i+1) +": ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE");
        for(Pangkat p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER");
        for(Pangkat p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai,p.pangkat ));
        }
    }
}
