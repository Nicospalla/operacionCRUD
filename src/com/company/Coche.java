package com.company;

 public class Coche {
     //atributos
    int puertas;
    String color;
    double ccMotor;

    //constructores

     public Coche(int puertas, String color, double ccMotor) {
         this.puertas = puertas;
         this.color = color;
         this.ccMotor = ccMotor;
     }

     //metodos

     @Override
     public String toString() {
         return "Coche{" +
                 "puertas=" + puertas +
                 ", color='" + color + '\'' +
                 ", ccMotor=" + ccMotor +
                 '}';
     }
 }
