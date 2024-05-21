/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal.polymorphisn;

/**
 *
 * @author salsabila husaini
 */
public class Person {
    protected String name;
    protected String alamat;
    protected String telepon;
    protected String email;
    private MyDate tanggalKerja;
    

    public Person(String name, String alamat, String telepon, String email) {
        this.name = name;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "class Person, name : " + name;
    }
}


