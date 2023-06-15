/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

public class tbl_user {
    private int id_user;
    private String nama;
    private String password;
    private String level;
   
    public tbl_user(int id_user, String nama, String password, String level) {
        this.id_user = id_user;
        this.nama = nama;
        this.password = password;
        this.level = level;
    }

    // Getter dan setter untuk setiap properti

    public int getIdUser() {
        return id_user;
    }

    public void setid_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 public String getlevel() {
        return level;
    }

    public void setlevel(String level) {
        this.level = level;
    }
   
}
