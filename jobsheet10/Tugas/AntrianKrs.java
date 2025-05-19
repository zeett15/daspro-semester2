package Tugas;

public class AntrianKrs {

    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahDilayani;

    public AntrianKrs(int max){
        this.max = max;
        this.data = new Mahasiswa[max];
        this.size = 0;
        this.front = -1;
        this.rear = -1;
        this.sudahDilayani = 0;
    }
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (size == max){
            return true;
        }else{
            return false;
        }
    }
    public void clear(){
        if(!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil di kosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void tambahAntrian(Mahasiswa mhs){
        if(isFull()){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear+1) %max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian. ");
    }
    public Mahasiswa panggilAntrian(){
        if(isEmpty()){
            System.out.println("Antrian kososng.");
            return null;
        }
        for(int i =0; i <2; i++){
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            sudahDilayani++;
            return mhs;

        }
        return null;
    }
    public void lihatTerdepan(){
        if(isEmpty()){
            System.out.println("Antrian kosong.");
        }else{
            System.out.print("2 Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for(int i = 0; i < 2; i++){
                data[front + i].tampilkanData();
            }
        }
    }
    public void tampilkanSemua(){
        if(isEmpty()){
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for(int i = 0; i < size; i++){
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terakhir dalam antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    public int getJumlahAntrian(){
        return size;
    }
    public int getSudahDilayani(){
        return sudahDilayani;
    }
}
