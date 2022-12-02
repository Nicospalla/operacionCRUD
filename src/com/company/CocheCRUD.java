package com.company;

import java.util.List;
//Se declaran los metodos, pero no se implementan
public interface CocheCRUD {
    void save(Coche coche);
    List<Coche> findAll();
    void delete(Coche coche);
}
