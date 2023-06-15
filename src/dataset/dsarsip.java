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
public class dsarsip {
     private ArrayList<Integer> no_sj;
    private ArrayList<Integer> no_order;
    private ArrayList<Integer> id_costumer;
    private ArrayList<Integer> tanggal_sj;
    
     public dsarsip() {
        no_sj = new ArrayList<Integer>();
        no_order = new ArrayList<Integer>();
        id_costumer = new ArrayList<Integer>();
        tanggal_sj = new ArrayList<Integer>();
   
    }
    
    public void insertno_sj(int isi){
        this.no_sj.add(isi);
    }
    public ArrayList<Integer> getRecordno_sj(){
        return this.no_sj;
    }
    
    public void insertno_order(int isi){
        this.no_order.add(isi);
    }
    public ArrayList<Integer> getRecordno_order(){
        return this.no_order;
    }
    
    public void insertid_costumer(int isi){
        this.id_costumer.add(isi);
    }
    public ArrayList<Integer> getRecordid_costumer(){
        return this.id_costumer;
    }
    
    public void inserttanggal_sj(int isi){
        this.tanggal_sj.add(isi);
    }
    public ArrayList<Integer> getRecordtanggal_sj(){
        return this.tanggal_sj;
    }
    
    
    public void insertarsip(int no_sj, int no_order, int id_costumer, int tanggal_sj){
        this.no_sj.add(no_sj);
        this.no_order.add(no_order);
        this.id_costumer.add(id_costumer);
        this.tanggal_sj.add(tanggal_sj);
       
        
    }


   
    
}
