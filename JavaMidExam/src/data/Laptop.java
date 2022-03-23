package data;
public class Laptop {
    String namaUser, merkLaptop, soLaptop, namaProsesor, jenisStorage;
    int jumlahCore, jumlahram, jumlahstok;
    
    public Laptop(String namaUser, String merkLaptop, String namaProsesor, int jumlahCore, String soLaptop, int jumlahram, String jenisStorage, int jumlahstok) {
        this.namaUser=namaUser; 
        this.merkLaptop=merkLaptop;
        this.soLaptop=soLaptop;
        this.namaProsesor=namaProsesor;
        this.jenisStorage=jenisStorage;
        this.jumlahCore=jumlahCore;
        this.jumlahram=jumlahram;
        this.jumlahstok=jumlahstok;
    }
    public String setNama() {
        return namaUser;
    } 
    public String setMerk() {
        return merkLaptop;
    }  
    public String setSistem() {
        return soLaptop;
    }  
    public String setProsesor() {
        return namaProsesor;
    }  
    public String setStorage() {
        return jenisStorage;
    }  
    public int setCore() {
        return jumlahCore;
    }  
    public int setRAM() {
        return jumlahram;
    }  
    public int setStok() {
        return jumlahstok;
    }  
}

