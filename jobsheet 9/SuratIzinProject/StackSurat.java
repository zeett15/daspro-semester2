package SuratIzinProject;

import java.util.Stack;

public class StackSurat {
    Stack<Surat21> stackSurat = new Stack<>();


    public void terimaSurat(Surat21 surat) {
        stackSurat.push(surat);
        System.out.println("Surat berhasil ditambahkan.");
    }

    public void prosesSurat() {
        if (!stackSurat.isEmpty()) {
            Surat21 surat = stackSurat.pop();
            System.out.println("Memproses surat berikut:");
            surat.displaySurat();
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
        }
    }


    public void lihatSuratTerakhir() {
        if (!stackSurat.isEmpty()) {
            System.out.println("Surat terakhir:");
            stackSurat.peek().displaySurat();
        } else {
            System.out.println("Tidak ada surat di stack.");
        }
    }


    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (Surat21 surat : stackSurat) {
            if (surat.namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan:");
                surat.displaySurat();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + namaMahasiswa + " tidak ditemukan.");
        }
    }
}
