package com.artedatamax.minimarket.persistence;

import com.artedatamax.minimarket.persistence.crud.ProductoCrudRepository;
import com.artedatamax.minimarket.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
