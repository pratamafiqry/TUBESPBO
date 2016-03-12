/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Fiqry
 */
public class Pasien {
    private String tanggalDatang;
    private String keluhan;
    
    public void setTanggalDatang(String tanggalDatang){
        this.tanggalDatang = tanggalDatang;
    }
    public String getTanggalDatang(){
        return tanggalDatang;
    }
    public void setKeluhan(String keluhan){
        this.keluhan = keluhan;
    }
    public String getKeluhan(){
        return keluhan;
    }
}