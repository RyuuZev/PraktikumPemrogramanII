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
        double hargaPerKg = hargaBuah / beratBuah;

        int jumlahPerulangan = (int)
    }
}
