public class AntrianVaksin {
    Node head, tail;
    int jumlahAntrian;
    
    public AntrianVaksin() {
        head = tail = null;
        jumlahAntrian = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void tambahAntrian(String nama, int noIdentitas) {
        Node dataBaru = new Node(nama, noIdentitas);
        if (isEmpty()) {
            head = tail = dataBaru;
        } else {
            tail.next = dataBaru;
            dataBaru.prev = tail;
            tail = dataBaru;
        }
        jumlahAntrian++;
        System.out.println("Pendaftaran berhasil!");
    }
    
    public void hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        System.out.println("Orang yang sudah divaksin:");
        System.out.println("No Identitas: " + head.noIdentitas);
        System.out.println("Nama: " + head.nama);
        
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        jumlahAntrian--;
    }
    
    public void lihatAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        System.out.println("\nDaftar Antrian Vaksinasi:");
        System.out.println("Sisa antrian: " + jumlahAntrian + " orang");
        Node temp = head;
        int nomor = 1;
        while (temp != null) {
            System.out.println("\nNo Antrian: " + nomor);
            System.out.println("No Identitas: " + temp.noIdentitas);
            System.out.println("Nama: " + temp.nama);
            temp = temp.next;
            nomor++;
        }
    }
}
