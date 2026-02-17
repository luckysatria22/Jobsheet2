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
