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
public class dsbarang {
     private ArrayList<Integer> id_barang;
    private ArrayList<String> nama_barang;
    
     public dsbarang() {
        id_barang = new ArrayList<Integer>();
        nama_barang = new ArrayList<String>();
        
    }
    
    public void insertid_barang(int isi){
        this.id_barang.add(isi);
    }
    public ArrayList<Integer> getRecordid_barang(){
        return this.id_barang;
    }
    
    public void insertnama_barang(String isi){
        this.nama_barang.add(isi);
    }
    public ArrayList<String> getRecordnama_barang(){
        return this.nama_barang;
    }
    
   
    public void insertBarang(int id_barang, String nama_barang){
        this.id_barang.add(id_barang);
        this.nama_barang.add(nama_barang);
        
       
        
    }


   
    
}
