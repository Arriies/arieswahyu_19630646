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
public class dscostumer {
     private ArrayList<Integer> id_costumer;
    private ArrayList<String> nama_costumer;
    private ArrayList<String> alamat;
    private ArrayList<Integer> telphone;
    
    
     public dscostumer() {
        id_costumer = new ArrayList<Integer>();
        nama_costumer = new ArrayList<String>();
        alamat = new ArrayList<String>();
        telphone = new ArrayList<Integer>();
   
    }
    
    public void insertid_costumer(int isi){
        this.id_costumer.add(isi);
    }
    public ArrayList<Integer> getRecordid_costumer(){
        return this.id_costumer;
    }
    
    public void insertnama_costumer(String isi){
        this.nama_costumer.add(isi);
    }
    public ArrayList<String> getRecordnama_costumer(){
        return this.nama_costumer;
    }
    
    public void insertalamat(String isi){
        this.alamat.add(isi);
    }
    public ArrayList<String> getRecordalamat(){
        return this.alamat;
    }
    
    public void inserttelphone(int isi){
        this.telphone.add(isi);
    }
    public ArrayList<Integer> getRecordtelphone(){
        return this.telphone;
    }
    
    
    public void insertcostumer (int id_costumer, String nama_costumer, String alamat,int telphone){
        this.id_costumer.add(id_costumer);
        this.nama_costumer.add(nama_costumer);
        this.alamat.add(alamat);
        this.telphone.add(telphone);
       
        
    }


   
    
}
