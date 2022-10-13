/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author J U L D A N
 */
public class Siswa {
    private String nama;
    private int nilai=0;
    private String kelas;
    private String alamat;
    
    public void isiData(){
        nama="Juldan";
        nilai=100;
        kelas="XI RPL B";
        alamat="Surakarta";
    }
    
    public String getNama(){
        return this.nama;
    }
    public int getNilai(){
        return this.nilai;
    }
    public String getKelas(){
        return this.kelas;
    }   
    public String getAlamat(){
        return this.alamat;
    }
    public void cetak(){
        System.out.println("Nama   : " + nama);
        System.out.println("Nilai   : " + nilai);
        System.out.println("Kelas   : " + kelas);
        System.out.println("alamat   : " + alamat);
    }
}      
