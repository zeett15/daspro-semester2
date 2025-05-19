package Mahasiswa;
class StackTugasMahasiswa21 {
    Mahasiswa21[] stack;
    int size;
    int top;

    StackTugasMahasiswa21(int size){
        this.size=size;
        stack = new Mahasiswa21[size];
        top = -1;
    }
    public boolean isFUll(){
        if ( top == size){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public void push(Mahasiswa21 mhs){
        if (!isFUll()){
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
        }
    }
    public Mahasiswa21 pop(){
        if(!isEmpty()){
            Mahasiswa21 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack kosong! Tidak ada tugas dinilai.");
            return null;
        }
    }
    public Mahasiswa21 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("Stack kososng! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public void print(){
        for(int i=top; i>= 0; i--){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    public Mahasiswa21 peekTerbawah(){
        if(!isEmpty()){
            return stack[0];
        }else{
            System.out.println("Stack kososng! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public int jumlahTugas(){
        int jumlah = top + 1;
        return jumlah;
    }
    public String konversiDesimalKeBiner(int nilai){
        StackKonversi21 stack = new StackKonversi21();
        String biner = ""; 
        while(nilai != 0){
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai/2;
        }
        while(!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}
