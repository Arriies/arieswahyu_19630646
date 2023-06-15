/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

public class tbl_barang {
    private int id_barang;
    private String nama_barang;
   

    public tbl_barang(int id_barang, String nama_barang) {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
       
    }

    // getter dan setter
    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    
    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    
}
