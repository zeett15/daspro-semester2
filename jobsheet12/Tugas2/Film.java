public class Film {
    String id;
    String judul;
    double rating;
    
    Film next;
    Film prev;
    
    Film(String id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}