/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal.polymorphisn;

/**
 *
 * @author salsabila husaini
 */
public class Student extends Person {
    public static final String MahasiswaBaru = "Mahasiswa Baru";
    public static final String Mhsdua  = "Mahasiswa tahun kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String alamat, String telepon, String email, String status) {
        super(name, alamat, telepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "class Student, name : " + name +", Status : " + status;
    }
}

