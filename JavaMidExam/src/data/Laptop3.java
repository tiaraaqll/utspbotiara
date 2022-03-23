package data;
public class Laptop3 extends Laptop2{
    String storefrontPosition;

    public Laptop3(String namaUser, String merkLaptop, String namaProsesor, int jumlahCore, String soLaptop, int jumlahram, String jenisStorage, int jumlahstok, String warna, String storefrontPosition) {
        super(namaUser, merkLaptop, namaProsesor, jumlahCore, soLaptop, jumlahram, jenisStorage, jumlahstok, warna);
        this.storefrontPosition=storefrontPosition;
    }
    public String setStorefrontPosition() {
        return storefrontPosition;
    }
    @Override
    public String toString() {
        return "\n \n Laptop "
                + "\nNama = " + setNama() 
                + "\nBrand = " + setMerk() 
                + "\nNama Processor = " + setProsesor() 
                + "\nJumlah Core pada Processor = " + setCore() 
                + "\nSistem Operasi = " + setSistem() 
                + "\nUkuran RAM dalam GB = " + setRAM() 
                + "\nJenis Storage = " + setStorage() 
                + "\nStok = " + setStok() 
                + "\nWarna = " + setWarna() 
                + "\nStorefront Position  = " + storefrontPosition;
    }
}
