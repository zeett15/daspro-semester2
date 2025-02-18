
import java.util.Scanner;

public class HitungKubus {
    public static double  luasPermukaan(double x) {
        double hasil;
        hasil = (x*x) * 6;
        return hasil;
    }
    public static double  volumeKubus(double x) {
        double hasil = x*x*x;

        return hasil;
    }
    public static double  kelilingKubus(double x) {
            double hasil = 12 * x;
            return hasil;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int menu;
    
            do{
                System.out.println();
                System.out.println("MENU HITUNG KUBUS");
                System.out.println("1. LUAS PERMUKAAN KUBUS\n2. VOLUME KUBUS\n3. KELILING KUBUS\n4.KELUAR");
        
                System.out.print("Pilih menu: ");
                menu = sc.nextInt();
                double sisi;
                switch (menu) {
                    case 1:
                        System.out.print("Masukan sisi kubus: ");
                        sisi = sc.nextDouble();
                        System.out.println("Luas permukaan kubus: " + luasPermukaan(sisi));
                        break;
                    case 2:
                        System.out.print("Masukan sisi kubus: ");   
                        sisi = sc.nextDouble();
                        System.out.println("Volume kubus: " + volumeKubus(sisi));
                        break;
                    case 3:
                        System.out.print("Masukan sisi kubus: ");   
                        sisi = sc.nextDouble();
                        System.out.println("Keliling kubus: " + kelilingKubus(sisi));
                        break;
                    case 4:
                        System.out.println("Terimakasih.");
                        break;
                    default:
                        System.out.println("Input tidak valid. Silahkan pilih lagi");
                }
            
            }while(menu != 4);

    }
}
