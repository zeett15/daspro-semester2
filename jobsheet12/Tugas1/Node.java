public class Node {
    String nama;
    int noIdentitas;
    Node prev, next;

    Node(String nama, int noIdentitas) {
        this.nama = nama;
        this.noIdentitas = noIdentitas;
        this.prev = null;
        this.next = null;
    }
}
