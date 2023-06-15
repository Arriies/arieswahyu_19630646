/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19630646;

import salary.*;
import dataset.*;
import forms.*;
/**
 *
 * @author ASUS
 */
public class main_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        tblBarang barang = new tblBarang();
        tblPelanggan pelanggan = new tblPelanggan();
        tblPembelian pembelian = new tblPembelian();
        tblPenjualan penjualan = new tblPenjualan();
        tblSupplier supplier = new tblSupplier();
        tblUser user = new tblUser();
       
        //Set
        barang.setkdBrg(1001);
        barang.setnmaBrg("Bodrex");
        barang.setSatuan(5);
        barang.sethrgBeli(50000);
        barang.sethrgJual(30000);
        
        pelanggan.setkdPelanggan(0001);
        pelanggan.setnmaPelanggan("Muhammad Rafli Aditya");
        pelanggan.settelpPelanggan("08123456789");
        pelanggan.setfaxPelanggan(5000);
        pelanggan.setemailPelanggan("muhrafliaditya062@gmail.com");
        pelanggan.setalamatPelanggan("Jln. Sungai Lulut");
        pelanggan.setTgl("18 Mei 2023");
        
                
        //Get
        System.out.println("Kode Obat: " + barang.getkdBrg());
        System.out.println("Nama Obat : " + barang.getnmaBrg());
        System.out.println("Satuan : " + barang.getSatuan());
        System.out.println("Harga Beli : " + barang.gethrgBeli());
        System.out.println("Harga Jual : " + barang.gethrgJual());
        
        System.out.println("------------------------------------------");
        System.out.println("Kode Pelanggan :" + pelanggan.getkdPelanggan());
        System.out.println("Nama : " + pelanggan.getnmaPelanggan());
        System.out.println("Telepon : " + pelanggan.gettelpPelanggan());
        System.out.println("Fax : " + pelanggan.gettelpPelanggan());
        System.out.println("Email : " + pelanggan.getemailPelanggan());
        System.out.println("Alamat : " + pelanggan.getalamatPelanggan());
        System.out.println("Tgl : " + pelanggan.getTgl());
        /
        //Memasukkan Array List kedalam Object
        dsarsip arsip = new dsarsip();
        dsbarang barang = new dsbarang();
        dscostumer costumer = new dscostumer();
        dsdetailarsip detailarsip= new dsdetailarsip();
        dskembali kembali = new dskembali();
        dsuser user = new dsuser();
        
        //Menginput data ArrayList pada masing-masing tabel
        arsip.insertno_sj(01);
        arsip.insertno_order(01);
        arsip.insertid_costumer(1);
        arsip.inserttanggal_sj(13);
        arsip.insertBarang(02, 02, 2,14);
       
        
        barang.insertid_barang(01);
        barang.insertnama_barang("kabel");
        barang.insertBarang(02, "kabel_jumbo");
       
        
        costumer.insertid_costumer(01);
        costumer.insertnama_costumer("Aries");
        costumer.insertalamat("Jl. Mangga");
        costumer.inserttelphone(8);
        costumer.insertcostumer(02,"wahyu", "jl. merdeka", 9);
       
        
        detailarsip.insertno_sj(01);
        detailarsip.insertid_barang(01);
        detailarsip.insertjumlah(40);
        detailarsip.insertsatuan(15000);
        detailarsip.insertdetailarsip(02, 02, 30, 1600);
        
        
        kembali.insertno_kembali(01);
        kembali.insertno_sj(01);
        kembali.inserttgl_kembali(15);
        kembali.insertkembali(02, 02, 16);
       
        
        user.insertid_user(01);
        user.insertusername("admin");
        user.insertpassword(01);
        user.insertlevel(01);
        user.insertuser(02, "aris", 01, 01);
        
        
        //Menampilkan data ArrayList
        System.out.println("===============DATA ARSIP==============");
        System.out.println(arsip.getRecordno_sj());
        System.out.println(arsip.getRecordno_order());
        System.out.println(arsip.getRecordid_costumer());
        System.out.println(arsip.getRecordtanggal_sj());
        
        System.out.println("\t");
        System.out.println("===============DATA BARANG==============");
        System.out.println(barang.getRecordid_barang());
        System.out.println(barang.getRecordnama_barang());
        
        
        System.out.println("\t");
        System.out.println("===============DATA COSTUMER==============");
        System.out.println(costumer.getRecordid_costumer());
        System.out.println(costumer.getRecordnama_costumer());
        System.out.println(costumer.getRecordalamat());
        System.out.println(costumer.getRecordtelphone());
        
        
        System.out.println("\t");
        System.out.println("===============DATA DETAIL ARSIP==============");
        System.out.println(detailarsip.getRecordno_sj());
        System.out.println(detailarsip.getRecordid_barang());
        System.out.println(detailarsip.getRecordjumlah());
        System.out.println(detailarsip.getRecordsatuan());
       
        
        System.out.println("\t");
        System.out.println("===============DATA KEMBALI==============");
        System.out.println(kembali.getRecordno_kembali());
        System.out.println(kembali.getRecordno_sj());
        System.out.println(kembali.getRecordtgl_kembali());
       
        
        System.out.println("\t");
        System.out.println("===============DATA USER==============");
        System.out.println(user.getRecordid_user());
        System.out.println(user.getRecordusername());
        System.out.println(user.getRecordpassword());
        System.out.println(user.getRecordlevel());*/
        
        new frameutama().setVisible(true);
    }
    
}