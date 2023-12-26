package com.pengchu.springbootmall.controller;

import com.pengchu.springbootmall.dto.ProductRequest;
import com.pengchu.springbootmall.model.Product;
import com.pengchu.springbootmall.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
   @Autowired
   private ProductService productService;
    @GetMapping("/products/{productId}")
    public ResponseEntity<Product>getProduct(@PathVariable Integer productId){
        Product product = productService.getProductById(productId);

        if (product !=null) {
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
    }
@PostMapping("/products")
    public ResponseEntity<Product> creatProduct(@RequestBody @Valid ProductRequest productRequest){
    Integer productId = productRequest.createProduct(productRequest);

    Product product = productService.getProductById(productId);

    return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
}
