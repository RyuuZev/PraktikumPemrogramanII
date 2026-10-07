package MODULE02.PRAK203_2510817210026_MuhammadKurniawanPasya;

// Error: nama class tidak sesuai dengan nama file Pegawai.java.
// Karena class dibuat sebagai public, nama class harus sama dengan nama file.
// public class Employee {

public class Pegawai {

    public String nama;
    // Error: tipe char hanya dapat menyimpan satu karakter,
    // sedangkan asal pegawai berupa teks "Kingdom of Orvel".
    // public char asal

    public String asal; // seharusnya String bukan char
    public String jabatan;
    public int umur = 17; // umur 17

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena method setJabatan()
    // tidak memiliki parameter j, padahal main mengirimkan nilai jabatan.
    // public void setJabatan() {
    //     this.jabatan = j;
    // }

    // Perbaikan: menambahkan parameter String jabatan agar
    // nilai jabatan dari main dapat disimpan ke atribut jabatan.

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}