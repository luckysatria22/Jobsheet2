Percobaan 1
1. Atribut (Properties/Fields) — merupakan data atau variabel yang dimiliki oleh sebuah class/object untuk menyimpan keadaan (state). Contoh: pada class Mahasiswa, atributnya adalah nim, nama, kelas, dan ipk.
Method (Behavior) — merupakan fungsi atau prosedur yang mendefinisikan perilaku (behavior) dari sebuah class/object. Contoh: pada class Mahasiswa, methodnya adalah tampilkanInformasi(), ubahKelas(), updateIpk(), dan nilaiKinerja().
2. Class Mahasiswa memiliki 4 (empat) atribut, yaitu:
  •  nim  (String)  — menyimpan Nomor Induk Mahasiswa
  •  nama  (String)  — menyimpan nama lengkap mahasiswa
  •  kelas  (String)  — menyimpan kelas mahasiswa
  •  ipk  (double)  — menyimpan nilai Indeks Prestasi Kumulatif mahasiswa
3. Class Mahasiswa memiliki 4 (empat) method, yaitu:
  •  tampilkanInformasi() : void  — menampilkan seluruh informasi mahasiswa ke layar
  •  ubahKelas(kelasBaru : String) : void  — mengubah nilai atribut kelas dengan nilai baru
  •  updateIpk(ipkBaru : double) : void  — mengupdate nilai atribut ipk dengan nilai baru
  •  nilaiKinerja(ipk : double) : String  — mengembalikan kategori kinerja berdasarkan nilai IPK
4. void updateIpk(double ipkBaru) {
    if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;
    } else {
        System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
    }
}
5. Method nilaiKinerja(double ipk) menerima parameter ipk bertipe double, kemudian melakukan pengecekan bertingkat menggunakan if-else untuk menentukan kategori kinerja, lalu mengembalikan (return) nilai String berupa kategori tersebut. Method nilaiKinerja() me-return-kan nilai bertipe String berupa salah satu dari: "Dengan Pujian", "Sangat Memuaskan", "Memuaskan", "Cukup", atau "Kurang" sesuai dengan nilai IPK yang dimasukkan sebagai parameter.

Percobaan 2
1. Mahasiswa mhs1 = new Mahasiswa();
2. Menggunakan operator titik (.) dengan format:
  Atribut → namaObject.namaAtribut = nilai;
  Method → namaObject.namaMethod();
3. Karena di antara dua pemanggilan tampilkanInformasi(), atribut object mhs1 sudah diubah oleh method ubahKelas() dan updateIpk():

Percobaan 3
1. Mahasiswa09.java = 16-21
  MahasiswaMain.java = 29-35
2. Instansiasi
3. Ketika konstruktor default dihapus dari class Mahasiswa09, program MahasiswaMain09 masih bisa dikompilasi dan dijalankan dengan baik. Alasannya adalah karena pada baris 39 di dalam method main(), instansiasi object mhs1 pada MahasiswaMain09.java tidak menggunakan konstruktor default:
   - `Mahasiswa mhs1 = new Mahasiswa();` (baris 39) akan error jika konstruktor default tidak ada, namun pada MahasiswaMain09.java baris 39 masih menggunakan `new Mahasiswa()` yang MEMERLUKAN konstruktor default.
   - Namun, jika konstruktor default dihapus, hanya mhs2 yang berhasil dibuat dengan `new Mahasiswa("Annisa Nabila","2141720160",3.25,"TI 2L")` (baris 54).
   - Program tetap berjalan karena Java tidak akan error jika tidak ada konstruktor default selama ada konstruktor dengan parameter yang sesuai.
4. Method dalam class Mahasiswa tidak harus diakses secara berurutan. Urutan pemanggilan method bebas dan dapat disesuaikan dengan kebutuhan program. Method dapat dipanggil berkali-kali atau tidak dipanggil sama sekali. Alasannya:
   - Setiap method adalah independen dan tidak bergantung pada method lain
   - Method hanya akan dieksekusi ketika dipanggil, bukan secara otomatis
   - Pengembang program yang menentukan urutan dan frekuensi pemanggilan method sesuai dengan logika yang diinginkan
   - Data dalam atribut object bersifat persistent (tetap ada), sehingga method dapat mengaksesnya kapan saja