/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class dsdetailarsip {
     private ArrayList<Integer> no_sj;
    private ArrayList<Integer> id_barang;
    private ArrayList<Integer> jumlah;
    private ArrayList<Integer> satuan;
    
     public dsdetailarsip() {
        no_sj = new ArrayList<Integer>();
        id_barang = new ArrayList<Integer>();
        jumlah = new ArrayList<Integer>();
        satuan = new ArrayList<Integer>();
   
    }
    
    public void insertno_sj(int isi){
        this.no_sj.add(isi);
    }
    public ArrayList<Integer> getRecordno_sj(){
        return this.no_sj;
    }
    
    public void insertid_barang(int isi){
        this.id_barang.add(isi);
    }
    public ArrayList<Integer> getRecordid_barang(){
        return this.id_barang;
    }
    
    public void insertjumlah(int isi){
        this.jumlah.add(isi);
    }
    public ArrayList<Integer> getRecordjumlah(){
        return this.jumlah;
    }
    
    public void insertsatuan(int isi){
        this.satuan.add(isi);
    }
    public ArrayList<Integer> getRecordsatuan(){
        return this.satuan;
    }
    
    
    public void insertdetailarsip(int no_sj, int id_barang, int jumlah, int satuan){
        this.no_sj.add(no_sj);
        this.id_barang.add(id_barang);
        this.jumlah.add(jumlah);
        this.satuan.add(satuan);
       
        
    }


   
    
}
