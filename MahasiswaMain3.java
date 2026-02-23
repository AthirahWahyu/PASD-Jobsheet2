public class MahasiswaMain3 {
    public static void main(String[] args) {
        // Object 1 - Menggunakan konstruktor defult 
        Mahasiswa3 mhs1 = new Mahasiswa3();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        // Object 2 - Menggunakan konstruktor berparameter
        Mahasiswa3 mhs2 = new Mahasiswa3("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa3 mhsRaa = new Mahasiswa3("Athirah Wahyu", "2131720168", 4.0, "SIB 1F");
        mhsRaa.tampilkanInformasi();
    }
}
