package MODULE02.PRAK202_2510817210026_MuhammadKurniawanPasya;

public class Kopi {

    private String namaPembeli;

    String namaKopi;
    String ukuran;
    double harga;

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: " + harga);
    }

    public void setPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getPembeli() {
        return namaPembeli;
    }

    public double getPajak() {
        return harga * 0.11;
    }
}