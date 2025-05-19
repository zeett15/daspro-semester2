
public class SingleLinkList21 {
    NodeMahasiswa21 head;
    NodeMahasiswa21 tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()){
            NodeMahasiswa21 tmp = head;
            System.out.println("isi Lingked List:\t");
            while(tmp != null){
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }        
    }
    public void addFirst(Mahasiswa21 input){
        NodeMahasiswa21 ndInput = new NodeMahasiswa21(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void  addLast(Mahasiswa21 input){
        NodeMahasiswa21 ndInput = new NodeMahasiswa21(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa21 input){
        NodeMahasiswa21 ndInput = new NodeMahasiswa21(input, null);
        NodeMahasiswa21 temp = head;

        do{
            if(temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }
    public void insertArt(int indeks, Mahasiswa21 input){
        if(indeks < 0){
            System.out.println("indeks salah");
        }else if(indeks == 0){
            addFirst(input);
        }else {
            NodeMahasiswa21 temp = head;
            for (int i =0; i < indeks - 1; i++){
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa21(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }
    public void getData(int indeks){
        NodeMahasiswa21 tmp = head;
        for (int i = 0; i<indeks; i++){
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }
    public int indeksOf(String key){
        NodeMahasiswa21 tmp = head;
        int indeks = 0;
        while(tmp != null && !tmp.data.nama.equalsIgnoreCase(key)){
            tmp = tmp.next;
            indeks++;
        }
        if(tmp == null){
            return -1;
        }else{
            return indeks;
        }
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong. Tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            NodeMahasiswa21 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong. tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            NodeMahasiswa21 tmp = head;
            while (tmp.next != tail){
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }
    public void remove (String key){
        if(isEmpty()){
            System.out.println("Linked List masih kosong. tidak dapat dihapus");
        }else{
            NodeMahasiswa21 tmp = head;
            while (tmp != null) {
                if((tmp.data.nama.equalsIgnoreCase(key)) && (tmp == head)){
                    this.removeFirst();
                    break;
                }else if (tmp.data.nama.equalsIgnoreCase(key)){
                    tmp.next = tmp.next.next;
                    if(tmp.next == null){
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }
    public void removeArt(int indeks){
        if (indeks == 0){
            removeFirst();
        }else{
            NodeMahasiswa21 tmp = head;
            for(int i=0; i<indeks; i++){
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if(tmp.next == null){
                tail = tmp;
            }
        }
    }

}


