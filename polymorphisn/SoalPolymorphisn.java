/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.polymorphisn;
/**
 *
 * @author salsabila husaini
 */
public class SoalPolymorphisn {

    public static void main(String[] args) {
        
    Person person = new Person("Elsha ", "Ujung Berung", "0851234", "elsha@gmail.com");
    Student student = new Student("Lutfia", " Bekasi", "0855678", "lutfia@gmail.com", Student.MahasiswaBaru);
    MyDate tanggalKerja = new MyDate(2024,1,1);
    Employee employee = new Employee("Millenda", " Cimahi", "0858765", "millenda@gmail.com", "A101", 50000000, tanggalKerja);
    Faculty faculty = new Faculty("Dewi", " Medan", "0853456", "dewi@gmail.com", "B202", 75000000, tanggalKerja, 10, "Professor");
    Staff staff = new Staff("Esyaa", " Padang", "0854321", "esyaa@gmail.com", "C303", 600000000, tanggalKerja, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);            
        
    }
}
    

