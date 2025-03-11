class Mahasiswa{
    String nama;
    int uts, uas;

    Mahasiswa(String nama, int uts, int uas){
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }
    void tampilkan(){
        
        System.out.println(nama);
        System.out.println(uts);
        System.out.println(uas);
        
    }
    public static int utsTertinggi(Mahasiswa[] arr, int l, int r){
        if(l==r){
            return arr[l].uts;
        }
        int mid = (l+r)/2;

        int lmax = utsTertinggi(arr, l, mid);
        int rmax = utsTertinggi(arr, mid+1, r);
        if (lmax > rmax){
            return lmax;
        }else{
            return rmax;
        }
    }
    public static int utsterendah(Mahasiswa[] arr, int l, int r){
        if(l==r){
            return arr[l].uts;
        }
        int mid = (l+r)/2;

        int lmin = utsterendah(arr, l, mid);
        int rmin = utsterendah(arr, mid+1, r);
        if (lmin < rmin){
            return lmin;
        }else{
            return rmin;
        }
    }
    public static double rataRataUAS (Mahasiswa[] arr){
        double total = 0;
        double jumlah = 0;
        for(int i =0; i<arr.length;i++){
            total = total+arr[i].uas;
            jumlah++;
        }
        return total/jumlah;
    }

}

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[8];

        mhs[0] = new Mahasiswa("Ahmad", 78, 82);
        mhs[1] = new Mahasiswa("Budi", 85, 88);
        mhs[2] = new Mahasiswa("Cindy", 90, 87);
        mhs[3] = new Mahasiswa("Dian", 76, 79);
        mhs[4] = new Mahasiswa("Eko", 92, 95);
        mhs[5] = new Mahasiswa("Fajar", 88, 85);
        mhs[6] = new Mahasiswa("Gina", 80, 83);
        mhs[7] = new Mahasiswa("Hadi", 82, 84);

        

        System.out.println("Niilai uts terendah adalah: " + Mahasiswa.utsterendah(mhs,0,mhs.length-1));
        System.out.println("Nilai UTS tertinggi adalah: " + Mahasiswa.utsTertinggi(mhs,0,mhs.length-1));
        System.out.println("Rata - rata UAS adalah: " + Mahasiswa.rataRataUAS(mhs));
        
    }
}
