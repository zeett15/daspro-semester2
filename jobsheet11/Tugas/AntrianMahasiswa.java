package Tugas;

public class AntrianMahasiswa {
    Node head;
    Node tail;
    int size;

    public AntrianMahasiswa() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void tambahAntrian(Mahasiswa mhs) {
        Node newNode = new Node(mhs);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " masuk antrian!");
    }

    void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memanggil: " + head.data.nama);
        head = head.next;
        size--;
    }

    void lihatDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian terdepan: " + head.data.nama);
    }

    void lihatBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian terakhir: " + tail.data.nama);
    }

    void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}
