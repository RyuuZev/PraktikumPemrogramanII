package MODULE03.PRAK301_2510817210026_MuhammadKurniawanPasya;

import java.util.Scanner;
import java.util.LinkedList;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        int inputDadu = input.nextInt();
        int total = 0;

        for (int i = 1; i <= inputDadu; i++) {
            Dadu daduX = new Dadu();
            daftarDadu.add(daduX);

            System.out.printf("Dadu ke-%d bernilai %d", i, daduX.getNilaiDadu());
            System.out.println();

            total += daduX.getNilaiDadu();
        }

        System.out.printf("Total nilai dadu keseluruhan %d", total);
    }
}
