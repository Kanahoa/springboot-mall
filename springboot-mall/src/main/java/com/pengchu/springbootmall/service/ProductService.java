package com.pengchu.springbootmall.service;

import com.pengchu.springbootmall.constant.ProductCategory;
import com.pengchu.springbootmall.dto.ProductQueryParams;
import com.pengchu.springbootmall.dto.ProductRequest;
import com.pengchu.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}