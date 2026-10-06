package MODULE02.PRAK201_2510817210026_MuhammadKurniawanPasya;

public class Buah {

    private String namaBuah;
    private double beratBuah;
    private double hargaBuah;
    private double jumlahBeli;

    public Buah(String namaBuah, double beratBuah, double hargaBuah, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.beratBuah = beratBuah;
        this.hargaBuah = hargaBuah;
        this.jumlahBeli = jumlahBeli;
    }

    private double hitungHargaSebelumDiskon() {
        double jumlahBuah = jumlahBeli / beratBuah;
        return jumlahBuah * hargaBuah;
    }

    private double hitungDiskon() {
        double totalDiskon = 0;

        int jumlahPerulangan = (int) (jumlahBeli / 4);

        for (int i = 0; i < jumlahPerulangan; i++) {
            totalDiskon += (4 * hargaBuah) * 0.02;

        }
        return totalDiskon;
    }

    public void tampilkanInfo() {
        double hargaSebelumDiskon = hitungHargaSebelumDiskon();
        double totalDiskon = hitungDiskon();
        double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;

        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + beratBuah);
        System.out.println("Harga: " + hargaBuah);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", hargaSebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f%n", totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hargaSetelahDiskon);
        System.out.println();
    }
}
