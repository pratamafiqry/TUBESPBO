/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hariyanto
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Aplikasi {
   private ArrayList<Pasien> daftarPasien;
   private ArrayList<Dokter> daftarDokter;
   private ArrayList<PasienInap> daftarPasienInap;
   private ArrayList<Ruangan> daftarRuangan;
    
   
    public Aplikasi() {
        this.daftarPasien = new ArrayList<>();
        this.daftarDokter = new ArrayList<>();
        this.daftarPasienInap = new ArrayList<>();
        this.daftarRuangan = new ArrayList<>();
        //this.con = new Database();
        //con.connect();
    }
    
    public void createPasien(String nama,long id, String alamat) {
        Pasien p = new Pasien(nama,id,alamat);
        daftarPasien.add(p);
        //con.savePelanggan(p);
        
        //con.savePelanggan(daftarPelanggan.get(index));
        
        //return daftarPelanggan.get(index).getIdPelanggan();
        //return p.getIdPelanggan();
    }
    
    public Pasien getPasien(long idP) {
        for (Pasien p : daftarPasien) {
            if (p.getId() == idP) {
                return p;
            }
        }
        return null;        
        //Pasien p = con.getPasien(idP);
        //daftarPasien.add(p);
        //return p;
    }
    
    public void lihatPasien(){
        System.out.println("Data Pasien :");
        
        for (Pasien p : daftarPasien) {
            System.out.println("==============================");
            System.out.println("ID           : "+p.getId());
            System.out.println("Nama         : "+p.getNama());
            System.out.println("Alamat       : "+p.getAlamat());
            System.out.println("==============================");
            System.out.println("\n");
        }
    }
    
    public void deletePasien(long idp){
        int x =0;
        for(Pasien p : daftarPasien){
            if(p.getId() == idp){
                break;
            }
            x++;
        }
            daftarPasien.remove(x);
            
    }
    
    public void cariPasien(long idp){
        for(Pasien p : daftarPasien){
            if(p.getId() == idp){
                System.out.println("Data Ditemukan :");
                System.out.println("==============================");
                System.out.println("ID           : "+p.getId());
                System.out.println("Nama         : "+p.getNama());
                System.out.println("Alamat       : "+p.getAlamat());
                System.out.println("==============================");
            }
        }
    }
    
    public void createDokter(String nama,long id,String spesialisasi) {
        Dokter d = new Dokter(nama,id);
        d.setSpesialisasi(spesialisasi);
        daftarDokter.add(d);
        //con.savePelanggan(p);
        
        //con.savePelanggan(daftarPelanggan.get(index));
        
        //return daftarPelanggan.get(index).getIdPelanggan();
        //return p.getIdPelanggan();
    }
    
    public Dokter getDokter(long idP) {
        for (Dokter d : daftarDokter) {
            if (d.getId() == idP) {
                return d;
            }
        }
        return null;        
        //Pasien p = con.getPasien(idP);
        //daftarPasien.add(p);
        //return p;
    }
    
    public void lihatDokter(){
        System.out.println("Data Dokter :");
        
        for (Dokter d : daftarDokter) {
            System.out.println("==============================");
            System.out.println("ID           : "+d.getId());
            System.out.println("Nama         : "+d.getNama());
            System.out.println("Spesialisasi : "+d.getSpesialisasi());
            System.out.println("==============================");
            System.out.println("\n");
        }
    }
    
    public void deleteDokter(long idp){
        int x =0;
        for(Dokter d : daftarDokter){
            if(d.getId() == idp){
                break;
            }
            x++;
        }
            daftarDokter.remove(x);
            
    }
    
    public void cariDokter(long idp){
        for(Dokter d : daftarDokter){
            if(d.getId() == idp){
                System.out.println("Data Ditemukan :");
                System.out.println("==============================");
                System.out.println("ID           : "+d.getId());
                System.out.println("Nama         : "+d.getNama());
                System.out.println("Spesialisasi : "+d.getSpesialisasi());
                System.out.println("==============================");
            }
        }
    }
    
    public void createRuangan(String namaRuangan, String noRuang){
        Ruangan r = new Ruangan(namaRuangan,noRuang);
        daftarRuangan.add(r);
    }
    
    public Ruangan getRuangan(String noRuang){
        for (Ruangan r : daftarRuangan){
            if(r.getNoRuang().length() == noRuang.length()){
                return r;    
            }
            
        }
                return null;
    }
    
     public void lihatRuangan(){
         try{
        System.out.println("Data Ruangan : ");    
        int xi = 0;
        int yi = 1;
        for (Ruangan r : daftarRuangan) {
            System.out.println("==============================");
            System.out.println("No Ruang                : "+r.getNoRuang());
            System.out.println("Nama Ruang              : "+r.getNama());
            while(xi < r.getnPasien()){
            System.out.println("Pasien Inap "+yi+"            ");
            System.out.println("ID                      : "+r.getPasienInapByIndex(xi).getPasien().getId());
            System.out.println("Nama                    : "+r.getPasienInapByIndex(xi).getPasien().getNama());
            xi++;
            yi++;
            }
            System.out.println("==============================");
            System.out.println("\n");
        }
         }
           catch(NullPointerException e){
               System.out.println(e.getMessage());
            }
    }
    
    public void updatePiRuangan(PasienInap pi){
        int x = 0;
        for (Ruangan r : daftarRuangan){
            if(r.getPasienInapByIndex(x) == pi){
                r.tambahPasienInap(pi);
            }
            x++;
        }
    }
    
    public void tambahPasienInap(String noRuang,long idpas){
        try{
            PasienInap pi = getPasienInap(idpas);
            Ruangan r = getRuangan(noRuang);
            r.tambahPasienInap(pi);     
        } catch(NullPointerException e){
            System.out.println("Pasien atau ruangan tidak terdaftar");
        }
    }
    
    public void createPasienInap(long idpas,long iddok,String diagnosa){
        if(this.getPasien(idpas) == null || this.getDokter(iddok) == null){
            System.out.println("Pasien atau Dokter tidak terdaftar");
        }
        Pasien p1 = this.getPasien(idpas);
        PasienInap pi = new PasienInap(p1);
        Dokter d1 = this.getDokter(iddok);
        pi.setDokter(d1);
        pi.addDiagnosa(diagnosa);
        daftarPasienInap.add(pi);
        
    }
    
     public PasienInap getPasienInap(long idP) {
        for (PasienInap pi : daftarPasienInap) {
            if (pi.getPasien().getId() == idP) {
                return pi;
            }
        }
        return null;        
        //Pasien p = con.getPasien(idP);
        //daftarPasien.add(p);
        //return p;
    }
    
     public void lihatPasienInap(){
        System.out.println("Data Pasien Inap : ");      
        for (PasienInap py : daftarPasienInap) {
            System.out.println("==============================");
            System.out.println("ID Pasien               : "+py.getPasien().getId());
            System.out.println("Dokter Pemeriksa        : "+py.getDokter().getNama());
            System.out.println("Diagnosa                : "+py.getDiagnosa());
            System.out.println("==============================");
            System.out.println("\n");
        }
    }
     
     public void deletePasienInap(long idp){
        int x =0;
        for(PasienInap pi : daftarPasienInap){
            if(pi.getPasien().getId() == idp){
                break;
            }
            x++;
        }
            daftarPasienInap.remove(x);
            
    } 
            
    
}
