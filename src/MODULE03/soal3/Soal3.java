
package MODULE03.soal3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        HashMap<String, Mahasiswa> dataNim = new HashMap<>();

        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("5. Update Nama Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            try {
                pilihan = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                pilihan = -1;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = input.nextLine();

                    if (nama.trim().isEmpty() || nim.trim().isEmpty()) {
                        System.out.println("Nama dan NIM tidak boleh kosong!");
                    } else if (dataNim.containsKey(nim)) {
                        System.out.println("NIM ini sudah digunakan!");
                    } else {
                        Mahasiswa m = new Mahasiswa(nama, nim);

                        daftarMahasiswa.add(m);
                        dataNim.put(nim, m);

                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM yang akan dihapus: ");
                    nim = input.nextLine();

                    Mahasiswa hapus = dataNim.get(nim);

                    if (hapus != null) {
                        daftarMahasiswa.remove(hapus);
                        dataNim.remove(nim);
                        System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang akan dicari: ");
                    nim = input.nextLine();

                    Mahasiswa cari = dataNim.get(nim);

                    if (cari != null) {
                        System.out.println("NIM: " + cari.getNim()
                                + ", Nama: " + cari.getNama());
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");

                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        for (Mahasiswa m : daftarMahasiswa) {
                            System.out.println("NIM: " + m.getNim()
                                    + ", Nama: " + m.getNama());
                        }
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM yang akan diupdate: ");
                    nim = input.nextLine();

                    Mahasiswa update = dataNim.get(nim);

                    if (update != null) {
                        System.out.print("Masukkan Nama Baru: ");
                        String namaBaru = input.nextLine();

                        if (namaBaru.trim().isEmpty()) {
                            System.out.println("Nama tidak boleh kosong!");
                        } else {
                            update.setNama(namaBaru);
                            System.out.println("Nama mahasiswa berhasil diupdate.");
                        }
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 0:
                    daftarMahasiswa.clear();
                    dataNim.clear();
                    System.out.println("Terima Kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 0);

        input.close();
    }
}