public class MataKuliah3 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah3(){   // konstruktor default

    }

    public MataKuliah3(String kodeMK, String nama, int sks, int jumlahJam){ // konstruktor berparameter
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }


    void tampilInformasi(){
        System.out.println("kodeMK      : " + kodeMK);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("------------------------------");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam){
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambah. Total jam sekarang : " + jumlahJam);
         System.out.println("------------------------------");
    }

    void kurangiJam(int jam){
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Total jam sekarang : " + jumlahJam);
            System.out.println("------------------------------");
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
            System.out.println("------------------------------");
        }
    }
    
}
