class Mahasiswa21{
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa21(){

    }
    public Mahasiswa21(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilInformasi(){
        System.out.println("NIM: " + nim + "    |   Nama: " + nama + "  |   kelas: " + "    |   IPK: " + ipk);
    }

}