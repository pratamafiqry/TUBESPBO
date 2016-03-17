/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author hariyanto
 */
public class Ruangan {
    private PasienInap[] daftarPasien;
    private int maxPasien;
    private int nPasien = 0;
    private String namaRuangan;
    
    public Ruangan(String namaRuangan){
        this.namaRuangan = namaRuangan;
        maxPasien = 4;
        PasienInap[] daftarPasien = new PasienInap[maxPasien];
    }
    
    public void tambahPasienInap(PasienInap daftarPasien){
        this.daftarPasien[nPasien] = daftarPasien;
        nPasien++;
    }
    
    public PasienInap getPasienInapByIndex(int x){
        return daftarPasien[x];
    }
    
    public void setNama(String namaRuangan){
        this.namaRuangan = namaRuangan;
    }
    
    public String getNama(){
        return namaRuangan;
    }
         
}
