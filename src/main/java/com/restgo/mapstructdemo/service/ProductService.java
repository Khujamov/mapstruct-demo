package com.restgo.mapstructdemo.service;

import com.restgo.mapstructdemo.entity.Product;
import com.restgo.mapstructdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

    public Product save(Product stock) {
        return productRepository.save(stock);
    }

    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }


}
