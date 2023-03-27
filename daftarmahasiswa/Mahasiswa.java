/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author sekar
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String nilai;
    private String gender;
    
    public Mahasiswa(String nim, String nama, String nilai, String gender){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.gender = gender;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return this.nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
    public String getNilai() {
        return this.nilai;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }  
}
