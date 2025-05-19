package Mahasiswa;
class StackKonversi21 {
    int[] tumpukBiner;
    int size;
    int top;

    
    public StackKonversi21(){
        this.size = 32; //asumsi 32 bit
        tumpukBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size -1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("stack penuh");

        }else{
            top++;
            tumpukBiner[top] = data;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack kosong");
            return -1;
        }else{
            int data = tumpukBiner[top];
            top--;
            return data;
        }
    }
}
