package MODULE04.soal1;

public class HewanPeliharaan {

    private String namaHewan;
    private String rasHewan;

    public HewanPeliharaan(String namaHewan, String rasHewan) {
        this.namaHewan = namaHewan;
        this.rasHewan = rasHewan;
    }

    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:" +
                "\nNama hewan peliharaanku adalah : " + namaHewan +
                "\nDengan ras : " + rasHewan);
    };
}