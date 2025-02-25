import java.util.Scanner;


class Mahasiswa {
    public String nama;
    public String nim;
    public String kelas;
    public float ipk;

    void cetakInfo(){
        System.out.println();
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Kelas       : " + kelas);
        System.out.println("Ipk         : " + ipk);
        System.out.println("------------------------------------");
    }
}

public class MahasiswwaDemo21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] arrayOfMahasiswa =  new Mahasiswa[3];
        String dummy = "";
        // for (int i = 0; i < 3; i++){
        //     arrayOfMahasiswa[i] = new Mahasiswa();

        //     System.out.println("Masukan data mahasiswa ke-" + (1+i));
        //     System.out.print("NIM         : ");
        //     arrayOfMahasiswa[i].nim = sc.nextLine();
        //     System.out.print("Nama        : ");
        //     arrayOfMahasiswa[i].nama = sc.nextLine();
        //     System.out.print("Kelas       : ");
        //     arrayOfMahasiswa[i].kelas = sc.nextLine();
        //     System.out.print("Ipk         : ");
        //     dummy = sc.nextLine();
        //     arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
        //     System.out.println("-------------------------------------");
            
        // }
        // for(int i = 0; i < 3; i++){
        //     arrayOfMahasiswa[i].cetakInfo();
        // }

        Mahasiswa[] myArrayOfMahasiswa = new Mahasiswa[3];
        myArrayOfMahasiswa[0] = new Mahasiswa();
        myArrayOfMahasiswa[0].nim = "12345678";
        myArrayOfMahasiswa[0].nama = "Agnes Titanaia Kiranti";
        myArrayOfMahasiswa[0].nim = "SIB-1E";
        myArrayOfMahasiswa[0].ipk = (float) 3.75;

        System.out.println("NIM         : " + myArrayOfMahasiswa[0].nim);
        System.out.println("Nama        : " + myArrayOfMahasiswa[0].nama);
        System.out.println("Kelas       : " + myArrayOfMahasiswa[0].kelas);
        System.out.println("Ipk         : " + myArrayOfMahasiswa[0].ipk);
        System.out.println("------------------------------------");

        

        

        // Mahasiswa[] arrayOfMahasiswa =  new Mahasiswa[3];
        // arrayOfMahasiswa[0] = new Mahasiswa();
        // arrayOfMahasiswa[0].nim = "123456789";
        // arrayOfMahasiswa[0].nama = "Agnes Titanaia Kiranti";
        // arrayOfMahasiswa[0].kelas = "SIB-1E";
        // arrayOfMahasiswa[0].ipk = (float) 3.75;

        // arrayOfMahasiswa[1] = new Mahasiswa();
        // arrayOfMahasiswa[1].nim = "123456789";
        // arrayOfMahasiswa[1].nama = "Ahmad Maulana Hamzah";
        // arrayOfMahasiswa[1].kelas = "TI-2A";
        // arrayOfMahasiswa[1].ipk = (float) 3.36;

        // arrayOfMahasiswa[2] = new Mahasiswa();
        // arrayOfMahasiswa[2].nim = "123456789";
        // arrayOfMahasiswa[2].nama = "Dirhaman Puranto";
        // arrayOfMahasiswa[2].kelas = "TI-2E";
        // arrayOfMahasiswa[2].ipk = (float) 3.80;

        // System.out.println("NIM         : " + arrayOfMahasiswa[0].nim);
        // System.out.println("Nama        : " + arrayOfMahasiswa[0].nama);
        // System.out.println("Kelas       : " + arrayOfMahasiswa[0].kelas);
        // System.out.println("Ipk         : " + arrayOfMahasiswa[0].ipk);
        // System.out.println("------------------------------------");
        // System.out.println("NIM         : " + arrayOfMahasiswa[1].nim);
        // System.out.println("Nama        : " + arrayOfMahasiswa[1].nama);
        // System.out.println("Kelas       : " + arrayOfMahasiswa[1].kelas);
        // System.out.println("Ipk         : " + arrayOfMahasiswa[1].ipk);
        // System.out.println("-------------------------------------");
        // System.out.println("NIM         : " + arrayOfMahasiswa[2].nim);
        // System.out.println("Nama        : " + arrayOfMahasiswa[2].nama);
        // System.out.println("Kelas       : " + arrayOfMahasiswa[2].kelas);
        // System.out.println("Ipk         : " + arrayOfMahasiswa[2].ipk);
        // System.out.println("-------------------------------------");
    }
}
