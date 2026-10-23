package MODULE04.soal1;

import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaHewan = input.nextLine();
        String rasHewan = input.nextLine();

        HewanPeliharaan hp1 = new HewanPeliharaan(namaHewan, rasHewan);
        hp1.display();
    }
}
