public class DaftarFilm {
    Film head;
    Film tail;
    
    public DaftarFilm() {
        head = null;
        tail = null;
    }
    
    public void tambahDataAwal(String id, String judul, double rating) {
        Film filmBaru = new Film(id, judul, rating);
        if (head == null) {
            head = tail = filmBaru;
        } else {
            filmBaru.next = head;
            head.prev = filmBaru;
            head = filmBaru;
        }
        System.out.println("Film berhasil ditambahkan di awal");
    }
    
    public void tambahDataAkhir(String id, String judul, double rating) {
        Film filmBaru = new Film(id, judul, rating);
        if (head == null) {
            head = tail = filmBaru;
        } else {
            tail.next = filmBaru;
            filmBaru.prev = tail;
            tail = filmBaru;
        }
        System.out.println("Film berhasil ditambahkan di akhir");
    }
    
    public void tambahDataIndex(String id, String judul, double rating, int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid!");
            return;
        }
        
        if (index == 0) {
            tambahDataAwal(id, judul, rating);
            return;
        }
        
        Film filmBaru = new Film(id, judul, rating);
        Film current = head;
        int i = 0;
        
        while (i < index - 1 && current != null) {
            current = current.next;
            i++;
        }
        
        if (current == null) {
            System.out.println("Indeks terlalu besar!");
            return;
        }
        
        filmBaru.next = current.next;
        filmBaru.prev = current;
        if (current.next != null) {
            current.next.prev = filmBaru;
        }
        current.next = filmBaru;
        System.out.println("Film berhasil ditambahkan pada index " + index);
    }
    
    public void hapusDataPertama() {
        if (head == null) {
            System.out.println("List kosong!");
            return;
        }
        
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Film pertama berhasil dihapus");
    }
    
    public void hapusDataTerakhir() {
        if (head == null) {
            System.out.println("List kosong!");
            return;
        }
        
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Film terakhir berhasil dihapus");
    }
    
    public void hapusDataTertentu(String id) {
        if (head == null) {
            System.out.println("List kosong!");
            return;
        }
        
        Film current = head;
        while (current != null && !current.id.equals(id)) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Film tidak ditemukan!");
            return;
        }
        
        if (current == head) {
            hapusDataPertama();
        } else if (current == tail) {
            hapusDataTerakhir();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Film berhasil dihapus");
        }
    }
    
    public void print() {
        if (head == null) {
            System.out.println("List kosong!");
            return;
        }
        
        System.out.println("\nDaftar Film:");
        Film current = head;
        while (current != null) {
            System.out.println("ID: " + current.id);
            System.out.println("Judul: " + current.judul);
            System.out.println("Rating: " + current.rating);
            System.out.println("-------------------");
            current = current.next;
        }

    }
    public void cariFilm(String id) {
        if (head == null) {
            System.out.println("Daftar film kosong!");
            return;
        }

        Film current = head;
        boolean ketemu = false;
        
        while (current != null) {
            if (current.id.equals(id)) {
                System.out.println("\nFilm ditemukan!");
                System.out.println("ID: " + current.id);
                System.out.println("Judul: " + current.judul);
                System.out.println("Rating: " + current.rating);
                ketemu = true;
                break;
            }
            current = current.next;
        }
        
        if (!ketemu) {
            System.out.println("Film dengan ID " + id + " tidak ditemukan!");
        }
    }

    public void urutkanRating() {
        if (head == null || head.next == null) {
            return;
        }

        Film current = null;
        Film index = null;
        String tempId;
        String tempJudul;
        double tempRating;

        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.rating < index.rating) {
                    // Tukar data
                    tempId = current.id;
                    tempJudul = current.judul;
                    tempRating = current.rating;

                    current.id = index.id;
                    current.judul = index.judul;
                    current.rating = index.rating;

                    index.id = tempId;
                    index.judul = tempJudul;
                    index.rating = tempRating;
                }
            }
        }
        System.out.println("Film berhasil diurutkan berdasarkan rating (Descending)!");
    }
}