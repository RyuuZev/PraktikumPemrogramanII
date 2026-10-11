package MODULE03.soal2;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Negara> daftarNegara = new LinkedList<>();
        HashMap<Integer, String> daftarBulan = new HashMap<>();

        daftarBulan.put(1, "Januari");
        daftarBulan.put(2, "Februari");
        daftarBulan.put(3, "Maret");
        daftarBulan.put(4, "April");
        daftarBulan.put(5, "Mei");
        daftarBulan.put(6, "Juni");
        daftarBulan.put(7, "Juli");
        daftarBulan.put(8, "Agustus");
        daftarBulan.put(9, "September");
        daftarBulan.put(10, "Oktober");
        daftarBulan.put(11, "November");
        daftarBulan.put(12, "Desember");

        int jumlahNegara = input.nextInt(); input.nextLine();

        for (int i = 1; i <= jumlahNegara; i++) {
            String namaNegara = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();
            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;
            if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                tanggalKemerdekaan = input.nextInt(); input.nextLine();
                bulanKemerdekaan = input.nextInt(); input.nextLine();
                tahunKemerdekaan = input.nextInt(); input.nextLine();
            }

            Negara negaraX = new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);

            daftarNegara.add(negaraX);
        }

        for (int i = 0; i < daftarNegara.size(); i++) {
            Negara negara = daftarNegara.get(i);

            if (negara.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
                System.out.printf("\nNegara %s mempunyai Raja bernama %s\n", negara.getNamaNegara(), negara.getNamaPemimpin());
            } else if (negara.getJenisKepemimpinan().equalsIgnoreCase("presiden")) {
                System.out.printf("\nNegara %s mempunyai Presiden bernama %s\n" +
                        "Deklarasi Kemerdekaan pada Tanggal %d %s %d\n", negara.getNamaNegara(), negara.getNamaPemimpin(), negara.getTanggalKemerdekaan(), daftarBulan.get(negara.getBulanKemerdekaan()), negara.getTahunKemerdekaan());
            } else if (negara.getJenisKepemimpinan().equalsIgnoreCase("perdana menteri")) {
                System.out.printf("\nNegara %s mempunyai Perdana Menteri bernama %s\n" +
                        "Deklarasi Kemerdekaan pada Tanggal %d %s %d\n", negara.getNamaNegara(), negara.getNamaPemimpin(), negara.getTanggalKemerdekaan(), daftarBulan.get(negara.getBulanKemerdekaan()), negara.getTahunKemerdekaan());
            }
        }
    }
}