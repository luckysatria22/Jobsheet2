public class Dosen09 {
    // ===== ATRIBUT =====
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // ===== KONSTRUKTOR DEFAULT =====
    public Dosen09() {
        idDosen        = "";
        nama           = "";
        statusAktif    = false;
        tahunBergabung = 0;
        bidangKeahlian = "";
    }

    // ===== KONSTRUKTOR BERPARAMETER =====
    public Dosen09(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen        = idDosen;
        this.nama           = nama;
        this.statusAktif    = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // ===== METHOD =====

    // Menampilkan informasi lengkap dosen
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    // Mengatur status aktif dosen
    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (statusAktif) {
            System.out.println(nama + " sekarang berstatus Aktif.");
        } else {
            System.out.println(nama + " sekarang berstatus Tidak Aktif.");
        }
    }

    // Menghitung dan mengembalikan masa kerja dosen
    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }

    // Mengubah bidang keahlian dosen
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}