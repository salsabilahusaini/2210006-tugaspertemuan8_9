/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal.polymorphisn;


/**
 *
 * @author salsabila husaini
 */
public class Staff extends Employee {
    private String gelar;

public Staff(String name, String alamat, String telepon, String email, String kantor, double gaji, MyDate tanggalKerja, String gelar) {
    super(name, alamat, telepon, email, kantor, gaji, tanggalKerja);
    this.gelar = gelar;
    }

    @Override
    public String toString() {
    return "class Staff, name : " + name + ", Gelar : " + gelar;
    }
}

