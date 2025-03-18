class Sorting{
    int [] data;
    int jumlahData;

    Sorting(int Data[], int jmlData){
        jumlahData = jmlData;
        data = new int [jmlData];
        for(int i=0; i<jumlahData; i++){
            data[i] = Data[i];
        }
    }
    void bubbleShort(){
        int tmp = 0;
        for(int i=0; i<jumlahData-1; i++){
            for(int j = 1; j<jumlahData-i; j++){
                if(data[j-1] > data[j]){
                    tmp = data[j];
                    data[j] = data[j-1];
                    data[j-1] =tmp;
                }
                
            }
        }
    }
    void selectionSort(){
        for(int i =0; i<jumlahData-1; i++){
            int min = i;
            for(int j=i+1; j<jumlahData;j++){
                if(data[j]<data[min]){
                    min=j;
                }
            }
            int tmp =data[i];
            data [i]= data[min];
            data[min]= tmp;
        }
    }
    void insertionSort(){
        for (int i = 1; i < data.length; i++) {
            int tmp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > tmp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = tmp;
        }        
    }
    void tampil(){
        for (int i = 0; i<jumlahData; i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
}
public class SortingMain21 {

    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting darurat1 = new Sorting(a, a.length);
        System.out.println("Data awal 1");
        darurat1.tampil();
        darurat1.bubbleShort();
        System.out.println("Data sudah diurutkan dengan bubble sort (ASC)");
        darurat1.tampil();

        int b[] = {30, 20, 2, 8, 14};
        Sorting darurat2 = new Sorting(b, b.length);
        System.out.println("Data awal 2");
        darurat2.tampil();
        darurat2.selectionSort();;
        System.out.println("Data sudah di urutkan dengan menggunakan Selection Sort (ASC)");
        darurat2.tampil();

        int c[] = {40,10,4,9,3};

        Sorting darurat3 = new Sorting(c, c.length);
        System.out.println("Data awal 3");
        darurat3.tampil();
        darurat3.insertionSort();;
        System.out.println("Data sudah di urutkan dengan menggunakan Insertion Sort (ASC)");
        darurat3.tampil();
    }
}