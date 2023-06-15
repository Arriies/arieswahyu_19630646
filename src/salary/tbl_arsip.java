/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */


public class tbl_arsip {
    private int no_sj;
    private int no_order;
    private int id_costumer;
    private int tanggal_sj;

    public tbl_arsip(int no_sj, int no_order, int id_costumer, int tanggal_sj) {
        this.no_sj = no_sj;
        this.no_order = no_order;
        this.id_costumer = id_costumer;
        this.tanggal_sj = tanggal_sj;
        
    }

    // Getter dan setter untuk setiap properti

    public int getno_sj() {
        return no_sj;
    }

    public void setno_sj(int no_sj) {
        this.no_sj = no_sj;
    }

    public int no_order() {
        return no_order;
    }

    public void setno_order(int no_order) {
        this.no_order = no_order;
    }

   

    public int gettanggal_sj() {
        return tanggal_sj;
    }

    public void settanggal_sj(int tanggal_sj) {
        this.tanggal_sj = tanggal_sj;
    }
}
