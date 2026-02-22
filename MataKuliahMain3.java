public class MataKuliahMain3 {
    public static void main(String[] args) {
        // Object 1 - Menggunakan konstruktor default 
        MataKuliah3 mk1 = new MataKuliah3();
        System.out.println("--- KONSTRUKTOR DEFAULT ---");
        mk1.kodeMK = "SIB252003";
        mk1.nama = "Pengenalan Sistem Informasi";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(4);
        mk1.tampilInformasi();

        // Object 2 - Menggunakan konstruktor berparameter
        System.out.println("--- KONSTRUKTOR BERPARAMETER ---");
        MataKuliah3 mk2 = new MataKuliah3("SIB252004", "Algoritma Struktur dan Data", 2, 4);

        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(2);
        mk2.kurangiJam(10); 
        mk2.tampilInformasi();
    }
}
