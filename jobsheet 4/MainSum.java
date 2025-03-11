import java.util.Scanner;

class Sum{
    double keuntungan[];

    Sum(int el){
        keuntungan = new double[el];
    }

    double totalBF(){
        double total = 0;
        for(int i = 0; i<keuntungan.length; i++){
            total += keuntungan[i];
        }
        return total;   
    }

    double totalDC(double[] arr, int l, int r){
        if(l == r){
            return arr[l];
        }
        int mid = (l+r)/2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid+1, r);
        return lsum+rsum;
    }
}

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan elemen: ");
        int elemen = sc.nextInt();
        Sum sm = new Sum(elemen);
        
        for(int i = 0; i<elemen; i++){
            System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("total keuntungan menggunakan bruteforce: " + sm.totalBF());
        System.out.println("total keuntungan menggunakan divide and conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
