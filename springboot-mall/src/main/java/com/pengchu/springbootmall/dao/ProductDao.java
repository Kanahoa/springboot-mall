package com.pengchu.springbootmall.dao;

import com.pengchu.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
