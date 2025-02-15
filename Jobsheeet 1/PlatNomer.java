
import java.util.Scanner;

public class PlatNomer {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        char code[] = new char[10];
        code[0] = 'A';
        code[1] = 'B';
        code[2] = 'D';
        code[3] = 'E';
        code[4] = 'F';
        code[5] = 'G';
        code[6] = 'H';
        code[7] = 'L';
        code[8] = 'N';
        code[9] = 'T';

        char kota[][] ={
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R',},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };
        
        System.out.println("Masukan kode plat: ");
        char x = sc.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        for(int i = 0; i < 10; i++){
            if (x == code[i]){

                for(char y : kota[i]){
                    System.out.print(y);

                }
                ditemukan =  true;
                break;

            }

        }
        if(!ditemukan){
            System.out.println("Kode tidak valid");
        }
        sc.close();

    }
        
}
