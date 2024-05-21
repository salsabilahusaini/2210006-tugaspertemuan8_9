/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasinheritance;

public class Segitiga extends ObjekGeometris {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

public Segitiga(){
}

public double getSide1 (){
    return side1;
}

public double getSide2 (){
    return side2;
}

public double getSide3 (){
    return side3;
}

public void setSide1(){
    this.side1 = side1;
}

public void setSide2(){
    this.side2 = side2;
}

public void setSide3(){
    this.side3 = side3;
}

public double getArea(){
    double s = (side1 + side2 + side3)/2;
    return Math.sqrt(s * (s - side1)* (s - side3));
}

public double getPerimater(){
    return side1 + side2 + side3;
}

@Override
public String toString(){
    return "Segitiga: side1 = " + side1 + " side2 = " + side2 + "side3 = " + side3;
}
}