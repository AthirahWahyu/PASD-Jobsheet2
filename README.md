# JOBSHEET 2

# PERCOBAAN 

## - Percobaan 1 : Deklarasi Class, Atribut dan Method

## - Percobaan 1 : Verifikasi Hasil Percobaan 

![Verifikasi1](./Verifikasi1.png)

_Pertanyaan:_

1.  Sebutkan dua karakteristik class atau object!
2.  Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
3.  Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4.  Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5.  Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
6.  Commit dan push kode program ke Github

_Jawaban:_

1.  - Mempunyai sesuatu (Data, Properti, Variabel, State, Attribut)
    - Melakukan sesuatu (Tingkah laku, Behaviour, Fungsi, Method)
2.  Terdapat 4 atribut yang dimiliki oleh class Mahasiswa3.java yaitu : 
    - nama
    - nim
    - kelas
    - ipk
3.  Terdapat 4 method yang dimiliki oleh class Mahasiswa3.java yaitu : 
    - tampilkanInformasi() : void
    - ubahKelas(kelasBaru: String) : void 
    - updateIPK(ipkBaruL: double) : void
    - nilaiKinerja(ipk: double) : String
4.  Code : 
    ```java 
        void updateIPK(double ipkBaru){
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    ```
5.  a. Method nilaiKinerja() bekerja dengan memeriksa nilai IPK mahasiswa, lalu menentukan kategori kinerja berdasarkan rentang IPK menggunakan struktur if-else if-else 
    - Program akan membaca nilai ipk
    - Membandingkan dengan batas tertentu 
    - Mengembalikan (return) teks sesuai kategori yang cocok

    b. Kriteria yang digunakan (Method ini menggunakan rentang IPK sebagai dasar penilaian) :
    - Rentang IPK : IPK >= 3.5 | Kategori Kinerja : Kinerja sangat baik  
    - Rentang IPK : IPK >= 3.0 | Kategori Kinerja : Kinerja baik 
    - Rentang IPK : IPK >= 2.0 | Kategori Kinerja : Kinerja cukup 
    - Rentang IPK : IPK < 2.0  | Kategori Kinerja : Kinerja kurang
    Urutan pengecekan sangat penting dikarenakan dijalankan dari atas ke bawah
    
    c. Apa yang dikembalikan (return)?
    - Method ini bertipe String, jadi yang dikembalikan adalah teks kategori kinerja, yaitu salah satu dari : "Kinerja sangat baik", "Kinerja baik", "Kinerja cukup", "Kinerja kurang"

## - Percobaan 2 : Instansiasi Object, serta Mengakses Atribut dan Method

## - Percobaan 2 : Verifikasi Hasil Percobaan 

![Verifikasi2](./Verifikasi2.png)

_Pertanyaan:_

1.  Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
2.  Bagaimana cara mengakses atribut dan method dari suatu objek?
3.  Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

_Jawaban:_

1.  Kode program untuk proses instansiasi (membuat object) :
    ```java
    Mahasiswa3 mhs1 = new Mahasiswa3();
    ```
    - Penjelasan : 
    a. Mahasiswa3 : nama class 
    b. new Mahasiswa3() : proses membuat object baru dari class tersebut 
    c. mhs1 : nama object yang dihasilkan 
2.  a. Untuk mengakses atribut dan method dari suatu object, menggunakan operator titik (.)
    ```java
        namaObjek.namaAtribut
        namaObjek.namaMethod()
    ```
    b. Contoh kode pada class MahasiswaMain3.java
    ```java
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.ipk = 3.55;
    ```
    Penjelasan :
    - mhs1 : nama object
    - nama dan ipk : atribut 
    - Tanda titik (.) digunakan untuk mengakses anggota dari object
    d. Mengakses method : 
    ```java 
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
    ```
    Penjelasan : 
    - mhs1 : nama object
    - tampilkanInformasi(), ubahKelas(), updateIPK() : method
    - Method dipanggil menggunakan tanda titik dan tanda kurung ()
3.  Output pertama dan kedua berbeda karena sebelum pemanggilan kedua dilakukan perubahan nilai atribut kelas kelas dan ipk melalui method ubahKelas() dan updateIPK(), sehingga data yang ditampilkan sudah diperbarui.

## - Percobaan 3 : Membuat Konstruktor

## - Percobaan 3 : Verifikasi Hasil Percobaan 

![Verifikasi3](./Verifikasi3.png)

_Pertanyaan:_

1.  Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
2.  Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
```java
    Mahasiswa3 mhs2 = new Mahasiswa3("Annisa Nabila", "2141720160", 3.25, "TI 2L");
```
3.  Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
4.  Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
5.	Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
6.	Commit dan push kode program ke Github

_Jawaban:_

1.  Baris kode yang mendeklarasikan konstruktor berparameter adalah : 
    ```java 
        public Mahasiswa3(String nm, String nim, double ipk, String kls)
    ```
2.  Code : 
    ```java
    Mahasiswa3 mhs2 = new Mahasiswa3("Annisa Nabila", "2141720160", 3.25, "TI 2L");
    ```
    Artinya : 
    - Membuat object baru dari class Mahasiswa3
    - Mmeberi nama object tersebut : mhs3
    - Mengisi nilai atribut langsung saat object dibuat melalui konstruktor (langsung menginisialisasi nilai atribut saat object dibuat)
3.  Hasil : 
    ![P3J3](./P3J3.png)
    Penjelasan : Jika konstruktor kosong (konstruktor default) dihapus, maka new Mahasiswa3(); tidak bisa digunakan lagi. Java akan error karena tidak menemukan konstruktor tanpa parameter (konstruktor default).
4.  Tidak, method tidak harus diakses secara berurutan. Method dapat dipanggil dalam urutan apa pun setelah object dibuat, karena setiap method akan dijalankan saat dipanggil sesuai kebutuhan program.
5.  Code : 
    ```java 
        Mahasiswa3 mhsRaa = new Mahasiswa3("Athirah Wahyu", "2131720168", 4.0, "SIB 1F");
        mhsRaa.tampilkanInformasi();
    ```
    Output : 
    
    ![P3J5](./P3J5.png)

# LATIHAN

1.  Code class MataKuliah3 : 
    ```java
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
    ```
    Output : 

    ![T1J1.png](./T1J1.png)