package MODULE03.soal3;

import java.util.Scanner;
import java.util.ArrayList;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        String namaMahasiswa;
        String nimMahasiswa;

        int pilihan;

        do {
            boolean nimSudahAda = false;

            System.out.println("Menu:\n" +
                    "1. Tambah Mahasiswa\n" +
                    "2. Hapus Mahasiswa berdasarkan NIM\n" +
                    "3. Cari Mahasiswa berdasarkan NIM\n" +
                    "4. Tampilkan Daftar Mahasiswa\n" +
                    "0. Keluar\n" +
                    "Pilihan: ");
            pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Nama Mahasiswa: "); namaMahasiswa = input.nextLine();
                    System.out.println("Masukkan NIM Mahasiswa (harus unik): "); nimMahasiswa = input.nextLine();
                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        Mahasiswa m = daftarMahasiswa.get(i);
                        if (m.getNim().equals(nimMahasiswa)) {
                            nimSudahAda = true;
                            System.out.println("Nim sudah digunakan!");
                        } else {
                            Mahasiswa mahasiswaBaru = new Mahasiswa(namaMahasiswa, nimMahasiswa);
                        daftarMahasiswa.add(mahasiswaBaru);
                        }
                    }
            }
        } while (pilihan != 0);
    }
}
