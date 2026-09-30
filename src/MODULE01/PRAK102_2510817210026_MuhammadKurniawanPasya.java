import java.util.Scanner;

public class PRAK102_2510817210026_MuhammadKurniawanPasya {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("");
        int angka = input.nextInt();
        int i = 1;

        while (i <= 10) {
            int hasil = angka;
            if (angka % 5 == 0) {
                hasil = angka / 5 - 1;
            }

            System.out.print(hasil);
            if (i < 10) {
                System.out.print(",");
            }

            angka++;
            i++;
        }
    }
}