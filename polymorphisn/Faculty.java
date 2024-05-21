/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal.polymorphisn;


/**
 *
 * @author salsabila husaini
 */
public class Faculty extends Employee {
    private int jamKerja;
    private String pangkat;

public Faculty(String name, String alamat, String telepon, String email, String kantor, double gaji, MyDate tanggalKerja, int jamKerja, String pangkat) {
    super(name, alamat, telepon, email, kantor, gaji, tanggalKerja);
    this.jamKerja = jamKerja;
    this.pangkat = pangkat;
    }

    @Override
    public String toString() {
    return "class Faculty, name : " + name + ", jamKerja : " + jamKerja + ", Pangkat : " + pangkat;    
    }
}


