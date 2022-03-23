package data;
public class Laptop2 extends Laptop{
    String warna;
    public Laptop2(String namaUser, String merkLaptop, String namaProsesor, int jumlahCore, String soLaptop, int jumlahram, String jenisStorage, int jumlahstok, String warna) {
        super(namaUser, merkLaptop, namaProsesor, jumlahCore, soLaptop, jumlahram, jenisStorage, jumlahstok);
        this.warna=warna;
    }
     public String setWarna() {
        return warna;
    }
    @Override
    public String toString() {
        return "Laptop [Nama = " + setNama() + ", Brand = " + setMerk() + ", Nama Processor = " + setProsesor() + ", Jumlah Core pada Processor = " + setCore() + ", Sistem Operasi = " + setSistem() + ", Ukuran RAM dalam GB = " + setRAM() + ", Jenis Storage = " + setStorage() + ", Stok = " + setStok() + ", Warna  = "
                + warna;
    }
}
