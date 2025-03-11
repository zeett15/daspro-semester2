import java.util.Scanner;

class Faktorial{

    int faktorialBF(int n){
        int fakto = 1;
        int i =1;
        while (n>=i) {
            fakto = fakto*i;
            i++;
        }
        return fakto;
    }

    int faktorialDC( int n){
        if(n == 1){
            return 1;
        }else{
            return n * faktorialDC(n - 1);
        }

    }
}
public class FaktorialMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int nilai = sc.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("nilai faktorial " + nilai + "menggunakan brute force: " + fk.faktorialBF(nilai));
        System.out.println("nilai faktorial " + nilai + "menggunakan divide and conquer: " + fk.faktorialDC(nilai));
    }
}