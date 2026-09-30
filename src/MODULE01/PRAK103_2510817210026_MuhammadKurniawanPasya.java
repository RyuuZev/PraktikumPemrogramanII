import java.util.Scanner;

public class PRAK103_2510817210026_MuhammadKurniawanPasya {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N_baris = input.nextInt();
        int angka_awal = input.nextInt();
        int i = 0;

        do {
            i++;
            if (angka_awal % 2 == 0) {
                angka_awal += 1;
            }
            System.out.print(angka_awal);
            if (i < N_baris) {
                System.out.print(",");
            }
            angka_awal += 2;
        } while (i < N_baris);

    }
}