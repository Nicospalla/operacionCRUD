package com.company;

public class Main {

    public static void main(String[] args) {
        CocheCRUDImpl cocheCrud = new CocheCRUDImpl();

        Coche coche1 =new Coche(2,"azul",1244);
        Coche coche2 =new Coche(3,"amarillo",2244);
        Coche coche3 =new Coche(4,"negro",3000);

        cocheCrud.save(coche1);
        cocheCrud.save(coche2);
        cocheCrud.save(coche3);

        System.out.println(cocheCrud.findAll());

        cocheCrud.delete(coche2);

        System.out.println(cocheCrud.findAll());
    }
}
