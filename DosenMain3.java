public class DosenMain3 {
    public static void main(String[] args) {
        
        // Object 1 - kontruktor default 
        Dosen3 dosen1 = new Dosen3();
        System.out.println("--- KONSTRUKTOR DEFAULT ---");
        dosen1.idDosen = "DS001";
        dosen1.nama = "Ailsa Ritha ST., M.MKom";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2001;
        dosen1.bidangKeahlian = "Pengenalan Sistem Informasi";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Manajemen Sistem Informasi");
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2026) + " tahun");
        System.out.println("------------------------------");
        dosen1.tampilkanInformasi();

        // Object 2 - Konstruktor Berparameter 
        System.out.println("--- KONSTRUKTOR BERPARAMETER ---");
        Dosen3 dosen2 = new Dosen3("DS002", "Hendra Pradibta, SE., M.Sc.", true, 2018, "Analisis Proses Bisnis");

        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Pengantar Akuntansi dan Manajemen Bisnis");
        System.out.println("Masa Kerja : " + dosen2.hitungMasaKerja(2026) + " tahun");
        System.out.println("------------------------------");
        dosen2.tampilkanInformasi();
    } 
}
