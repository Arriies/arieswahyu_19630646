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
public class dsuser {
     private ArrayList<Integer> id_user;
    private ArrayList<String> username;
    private ArrayList<Integer> password;
    private ArrayList<Integer> level;
    
     public dsuser() {
        id_user = new ArrayList<Integer>();
        username = new ArrayList<String>();
        password = new ArrayList<Integer>();
        level = new ArrayList<Integer>();
   
    }
    
    public void insertid_user(int isi){
        this.id_user.add(isi);
    }
    public ArrayList<Integer> getRecordid_user(){
        return this.id_user;
    }
    
    public void insertusername(String isi){
        this.username.add(isi);
    }
    public ArrayList<String> getRecordusername(){
        return this.username;
    }
    
    public void insertpassword(int isi){
        this.password.add(isi);
    }
    public ArrayList<Integer> getRecordpassword(){
        return this.password;
    }
    
    public void insertlevel(int isi){
        this.level.add(isi);
    }
    public ArrayList<Integer> getRecordlevel(){
        return this.level;
    }
    
    
    public void insertuser(int id_user, String username, int password, int level){
        this.id_user.add(id_user);
        this.username.add(username);
        this.password.add(password);
        this.level.add(level);
       
        
    }


   
    
}
