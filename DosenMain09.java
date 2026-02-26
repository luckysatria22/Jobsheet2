public class DosenMain09 {
    public static void main(String[] args) {

        // ===== OBJEK 1: menggunakan konstruktor DEFAULT =====
        Dosen09 dosen1 = new Dosen09();
        dosen1.idDosen        = "D001";
        dosen1.nama           = "Dr. Budi Santoso";
        dosen1.statusAktif    = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Pemrograman";

        System.out.println("====== Informasi Dosen 1 (Sebelum diubah) ======");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja      : " + dosen1.hitungMasaKerja(2025) + " tahun");

        System.out.println();

        // Panggil semua method
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Kecerdasan Buatan");

        System.out.println("\n====== Informasi Dosen 1 (Setelah diubah) ======");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja      : " + dosen1.hitungMasaKerja(2025) + " tahun");

        System.out.println();

        // ===== OBJEK 2: menggunakan konstruktor BERPARAMETER =====
        Dosen09 dosen2 = new Dosen09("D002", "Dr. Siti Rahayu", true, 2015, "Jaringan Komputer");

        System.out.println("====== Informasi Dosen 2 (Sebelum diubah) ======");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja      : " + dosen2.hitungMasaKerja(2025) + " tahun");

        System.out.println();

        // Panggil semua method
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Keamanan Siber");

        System.out.println("\n====== Informasi Dosen 2 (Setelah diubah) ======");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja      : " + dosen2.hitungMasaKerja(2025) + " tahun");
    }
}