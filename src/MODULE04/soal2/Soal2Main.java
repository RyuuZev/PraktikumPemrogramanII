package MODULE04.soal2;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        String pilihan = input.nextLine();

        if (pilihan.equals("1") || pilihan.equals("2")) {
            System.out.print("Nama hewan peliharaan: ");
            String namaHewan = input.nextLine();

            System.out.print("Ras: ");
            String ras = input.nextLine();

            System.out.print("Warna Bulu: ");
            String warnaBulu = input.nextLine();

            if (pilihan.equals("1")) {
                Kucing kucing = new Kucing(namaHewan, ras, warnaBulu);
                kucing.displayDetailKucing();
            } else {
                System.out.print("Kemampuan: ");
                String inputKemampuan = input.nextLine();

                String[] kemampuan = inputKemampuan.split("\\s*,\\s*");

                Anjing anjing = new Anjing(namaHewan, ras, warnaBulu, kemampuan);
                anjing.displayDetailAnjing();
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}