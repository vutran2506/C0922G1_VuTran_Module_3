package com.product.service;

import com.product.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static Map<Integer,Product> products;
    static {
products =new HashMap<>();
products.put(1,new Product(1,"Iphone14","1000","new","Apple"));
products.put(2,new Product(2,"Iphone13","900","new","Apple"));
products.put(3,new Product(3,"Iphone12","800","new","Apple"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
products.put(id,product);
    }

    @Override
    public void remove(int id) {
products.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Map.Entry<Integer, Product> entry : products.entrySet()){
            name = name.toLowerCase();
            if (entry.getValue().getNameProduct().toLowerCase().contains(name)) {
                productList.add(entry.getValue());
            }
        }
        return productList;
    }
}
