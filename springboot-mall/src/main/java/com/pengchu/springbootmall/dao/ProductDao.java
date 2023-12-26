package com.pengchu.springbootmall.dao;

import com.pengchu.springbootmall.dto.ProductRequest;
import com.pengchu.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}

