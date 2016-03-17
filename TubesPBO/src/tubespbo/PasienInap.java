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
public class PasienInap {
    private Pasien pasien =  new Pasien();
    private Dokter dokter = new Dokter();
    private String[] diagnosa;
    private int ndiagnosa = 0;
    
    public PasienInap(Pasien pasien){
        this.pasien = pasien;
    }
    
    public void setDokter(Dokter d){
        dokter = d;
    }
    
    public Dokter getDokter(){
        return dokter;
    }
    
    public void addDiagnosa(String d){
        diagnosa[ndiagnosa] = d;
        ndiagnosa++;
    }
    
    public String getDiagnosaByIndex(int x){
        return diagnosa[x];
    }
    
    public void deleteDiagnosa(String d){
        int y = 0;
        while(y<=5){
        if(diagnosa[y] != d){
            y++;
        }
        diagnosa[y]= null;
        }
    }
}
