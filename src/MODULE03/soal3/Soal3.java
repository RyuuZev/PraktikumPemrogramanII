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

            System.out.print("\nMenu:\n" +
                    "1. Tambah Mahasiswa\n" +
                    "2. Hapus Mahasiswa berdasarkan NIM\n" +
                    "3. Cari Mahasiswa berdasarkan NIM\n" +
                    "4. Tampilkan Daftar Mahasiswa\n" +
                    "0. Keluar\n" +
                    "Pilihan: ");
            pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: "); namaMahasiswa = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): "); nimMahasiswa = input.nextLine();

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        Mahasiswa m = daftarMahasiswa.get(i);
                        if (m.getNim().equals(nimMahasiswa)) {
                            nimSudahAda = true;
                            break;
                        }
                    }

                    if (nimSudahAda) {
                        System.out.println("NIM ini sudah digunakan!");
                    } else {
                        Mahasiswa m = new Mahasiswa(namaMahasiswa, nimMahasiswa);
                        daftarMahasiswa.add(m);
                        System.out.printf("Mahasiswa %s ditambahkan.", namaMahasiswa);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: "); nimMahasiswa = input.nextLine();

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        Mahasiswa m = daftarMahasiswa.get(i);
                        if (nimMahasiswa.equals(m.getNim())) {
                            nimSudahAda = true;
                            daftarMahasiswa.remove(i);
                            break;
                        };
                    }

                    if (nimSudahAda) {
                        System.out.printf("Mahasiswa dengan NIM %s dihapus.", nimMahasiswa);
                    } else {
                        System.out.printf("Mahasiswa dengan NIM %s tidak ditemukan", nimMahasiswa);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: "); nimMahasiswa = input.nextLine();

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        Mahasiswa m = daftarMahasiswa.get(i);
                        if (nimMahasiswa.equals(m.getNim())) {
                            nimSudahAda = true;
                            System.out.printf("NIM: %s, Nama: %s", nimMahasiswa, m.getNama());
                            break;
                        }
                    }

                    if (!nimSudahAda) {
                        System.out.printf("Mahasiswa dengan NIM %s tidak ditemukan", nimMahasiswa);
                    }
                    break;
                case 4:
                    System.out.println("Daftar Mahasiswa: ");

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        Mahasiswa m = daftarMahasiswa.get(i);
                        System.out.printf("NIM: %s, Nama: %s\n", m.getNim(), m.getNama());
                    }
                    break;
                case 0:
                    daftarMahasiswa.clear();
                    System.out.println("Terima Kasih!");
            }
        } while (pilihan != 0);
    }
}