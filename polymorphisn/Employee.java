/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal.polymorphisn;


/**
 *
 * @author salsabila husaini
 */
public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalKerja;
    
    
public Employee(String name, String alamat, String telepon, String email, String kantor, double gaji, MyDate tanggalKerja) {
    super(name, alamat, telepon, email);
    this.kantor = kantor;
    this.gaji = gaji;
    this.tanggalKerja = tanggalKerja;
    }

    @Override
    public String toString() {
    return "class Employee, name: " + name + ", Kantor : " + kantor + ", tanggal Kerja : " + tanggalKerja;    
    }
}


