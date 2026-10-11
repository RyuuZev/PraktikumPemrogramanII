package MODULE03.PRAK301_2510817210026_MuhammadKurniawanPasya;

import java.util.Random;

public class Dadu {
    Random r = new Random();

    private int nilai_dadu;

    public int getNilaiDadu() {
        return nilai_dadu;
    }

    public void acakNilai() {
        nilai_dadu = r.nextInt(6) + 1;
    }

    public Dadu() {
        acakNilai();
    }
}