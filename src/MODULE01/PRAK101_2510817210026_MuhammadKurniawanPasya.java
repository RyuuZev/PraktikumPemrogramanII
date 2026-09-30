import java.util.Scanner;

public class PRAK101_2510817210026_MuhammadKurniawanPasya {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama_lengkap = input.nextLine();

        System.out.print("Masukkan tempat lahir: ");
        String tempat_lahir = input.nextLine();

        System.out.print("Masukkan tanggal lahir: ");
        int tanggal_lahir = input.nextInt();

        System.out.print("Masukkan bulan lahir: ");
        int bulan_lahir = input.nextInt();

        if (bulan_lahir < 1 || bulan_lahir > 12) {
            System.out.println("Bulan tidak valid");
            return;
        }

        System.out.print("Masukkan tahun lahir: ");
        int tahun_lahir = input.nextInt();

        int max_hari;
        if (bulan_lahir == 2) {
            if ((tahun_lahir % 4 == 0 && tahun_lahir % 100 != 0) || (tahun_lahir % 400 == 0))  {
                max_hari = 29;
            } else {
                max_hari = 28;
            }
        } else if (bulan_lahir == 4 || bulan_lahir == 6 ||
                bulan_lahir == 9 || bulan_lahir == 11) {
            max_hari = 30;
        } else {
            max_hari = 31;
        }

        if (tanggal_lahir < 1 || tanggal_lahir > max_hari) {
            System.out.println("Tanggal tidak valid");
            return;
        }

        System.out.print("Masukkan tinggi badan: ");
        int tinggi_badan = input.nextInt();

        System.out.print("Masukkan berat badan: ");
        double berat_badan = input.nextDouble();

        String nama_bulan;

        switch (bulan_lahir) {
            case 1: nama_bulan = "Januari"; break;
            case 2: nama_bulan = "Februari"; break;
            case 3: nama_bulan = "Maret"; break;
            case 4: nama_bulan = "April"; break;
            case 5: nama_bulan = "Mei"; break;
            case 6: nama_bulan = "Juni"; break;
            case 7: nama_bulan = "Juli"; break;
            case 8: nama_bulan = "Agustus"; break;
            case 9: nama_bulan = "September"; break;
            case 10: nama_bulan = "Oktober"; break;
            case 11: nama_bulan = "November"; break;
            default: nama_bulan = "Desember";
        }

        System.out.println();
        System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d\n" +
                        "Tinggi Badan %d cm dan Berat Badan %.2f kilogram",
                nama_lengkap, tempat_lahir, tanggal_lahir, nama_bulan, tahun_lahir, tinggi_badan, berat_badan);

    }
}