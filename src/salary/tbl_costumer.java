/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */


public class tbl_costumer {
    private int id_customer;
    private String nama_customer;
    private String alamat;
    private int telphone;
    

    public tbl_costumer(int id_customer, String nama_customer,  String alamat,  int telphone) {
        this.id_customer = id_customer;
        this.nama_customer = nama_customer;
        this.alamat = alamat;
        this.telphone = telphone;
        
        
    }

    // Getter dan setter untuk setiap atribut

    public int id_customer() {
        return id_customer;
    }

    public void setid_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getnama_customer() {
        return nama_customer;
    }

    public void setnama_customer(String nama_customer) {
        this.nama_customer = nama_customer;
    }

    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

   public int telphone() {
        return telphone;
    }

    public void settelphone(int telphone) {
        this.telphone = telphone;
    }
    
    
}
