/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118053.latihan33.userlogin;

/**
 *
 * @author
 * NAMA     : Kevin Alvian
 * KELAS    : IF-2
 * NIM      : 10118053
 * Deskripsi Program : Membuat program user login dengan berbasis objek pada 
 * java
 */
public class User {
    private final String username = "KevinAlvian";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        return (username.equals(parUserName) && parPassword.equals(password));
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        System.out.println("");
        
        if(status) {
            System.out.println("******HALLO "+parUserName+"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else
            System.out.println("Ooops, Username atau Password anda salah");
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun ,parUserName);
    }
}
