/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author ASUS
 */
public class KontrolSenjata {
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    public boolean isAdaPeluru(){
        return senjata.getPeluru()>0;
    } 
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah +" kali");
        
        if(!isAdaPeluru()){
                System.out.println("Peluru Habis");
                return;
        }
        
        int tembakan = Math.min(jumlah, senjata.getPeluru());
        for (int i = 0; i < tembakan; i++){
            System.out.println(senjata.getBunyi());
            senjata.setPeluru(senjata.getPeluru() - 1);
        }
        
        if (jumlah > tembakan) {
            System.out.println("Gagal tembak, Peluru Habis");
            System.out.println("Gagal tembak, Peluru Habis");
        }                    
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}

            
        
            

            


