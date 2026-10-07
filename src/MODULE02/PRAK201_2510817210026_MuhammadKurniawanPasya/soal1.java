package MODULE02.PRAK201_2510817210026_MuhammadKurniawanPasya;

public class soal1 {
    public static void main(String[] args) {

        Buah apel = new Buah("Apel", 0.4, 7000, 40);
        Buah mangga = new Buah("mangga", 0.2, 3500, 15);
        Buah alpukat = new Buah("alpukat", 0.25, 10000, 12);

        apel.tampilkanInfo();
        mangga.tampilkanInfo();
        alpukat.tampilkanInfo();
    }
}

