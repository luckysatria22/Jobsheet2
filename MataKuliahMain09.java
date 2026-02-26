public class MataKuliahMain09 {
    public static void main(String[] args) {

        // ===== OBJEK 1: menggunakan konstruktor DEFAULT =====
        MataKuliah09 mk1 = new MataKuliah09();
        mk1.kodeMK    = "IF101";
        mk1.nama      = "Algoritma dan Pemrograman";
        mk1.sks       = 3;
        mk1.jumlahJam = 4;

        System.out.println("====== Informasi MK 1 (Sebelum diubah) ======");
        mk1.tampilInformasi();

        // Panggil semua method
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.kurangiJam(10); // simulasi jumlah jam tidak mencukupi

        System.out.println("\n====== Informasi MK 1 (Setelah diubah) ======");
        mk1.tampilInformasi();

        System.out.println();

        // ===== OBJEK 2: menggunakan konstruktor BERPARAMETER =====
        MataKuliah09 mk2 = new MataKuliah09("IF202", "Pemrograman Berorientasi Objek", 3, 6);

        System.out.println("====== Informasi MK 2 (Sebelum diubah) ======");
        mk2.tampilInformasi();

        // Panggil semua method
        mk2.ubahSKS(2);
        mk2.tambahJam(3);
        mk2.kurangiJam(4);

        System.out.println("\n====== Informasi MK 2 (Setelah diubah) ======");
        mk2.tampilInformasi();
    }
}