/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

public class tbl_detailarsip {
    private int no_sj;
    private int id_Barang;
    private int jumlah;
    private int satuan;

    public tbl_detailarsip(int no_sj, int id_Barang, int jumlah, int satuan) {
        this.no_sj = no_sj;
        this.id_Barang = id_Barang;
        this.jumlah = jumlah;
        this.satuan = satuan;
    }

    // Getter dan setter untuk setiap properti

    public int getno_sj() {
        return no_sj;
    }

    public void setno_sj(int no_sj) {
        this.no_sj = no_sj;
    }

    public int getId_Barang() {
        return id_Barang;
    }

    public void setId_Barang(int id_Barang) {
        this.id_Barang = id_Barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getsatuan() {
        return satuan;
    }

    public void setsatuan(int satuan) {
        this.satuan = satuan;
    }
}
