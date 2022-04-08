package com.artedatamax.minimarket.persistence.crud;

import com.artedatamax.minimarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
