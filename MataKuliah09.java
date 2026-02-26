public class MataKuliah09 {
    // ===== ATRIBUT =====
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // ===== KONSTRUKTOR DEFAULT =====
    public MataKuliah09() {
        kodeMK = "";
        nama = "";
        sks = 0;
        jumlahJam = 0;
    }

    // ===== KONSTRUKTOR BERPARAMETER =====
    public MataKuliah09(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK    = kodeMK;
        this.nama      = nama;
        this.sks       = sks;
        this.jumlahJam = jumlahJam;
    }

    // ===== METHOD =====

    // Menampilkan semua informasi mata kuliah
    void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }

    // Mengubah nilai SKS
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sks);
    }

    // Menambah jumlah jam
    void tambahJam(int jam) {
        jumlahJam = jumlahJam + jam;
        System.out.println("Jumlah jam ditambah. Jumlah jam sekarang: " + jumlahJam);
    }

    // Mengurangi jumlah jam (dengan pengecekan)
    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        } else {
            jumlahJam = jumlahJam - jam;
            System.out.println("Jumlah jam dikurangi. Jumlah jam sekarang: " + jumlahJam);
        }
    }
}