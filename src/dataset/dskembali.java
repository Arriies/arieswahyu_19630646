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
public class dskembali {
     private ArrayList<Integer> no_kembali;
    private ArrayList<Integer> no_sj;
    private ArrayList<Integer> tgl_kembali;
   
    
     public dskembali() {
        no_kembali = new ArrayList<Integer>();
        no_sj = new ArrayList<Integer>();
        tgl_kembali = new ArrayList<Integer>();
        
   
    }
    
    public void insertno_kembali(int isi){
        this.no_sj.add(isi);
    }
    public ArrayList<Integer> getRecordno_kembali(){
        return this.no_kembali;
    }
    
    public void insertno_sj(int isi){
        this.no_sj.add(isi);
    }
    public ArrayList<Integer> getRecordno_sj(){
        return this.no_sj;
    }
    
    public void inserttgl_kembali(int isi){
        this.tgl_kembali.add(isi);
    }
    public ArrayList<Integer> getRecordtgl_kembali(){
        return this.tgl_kembali;
    }
    
    
    public void insertkembali(int no_kembali, int no_sj, int tgl_kembali){
        this.no_kembali.add(no_kembali);
        this.no_sj.add(no_sj);
        this.tgl_kembali.add(tgl_kembali);
       
       
        
    }


   
    
}
