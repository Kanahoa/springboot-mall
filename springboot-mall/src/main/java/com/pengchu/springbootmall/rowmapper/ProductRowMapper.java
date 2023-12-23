package com.pengchu.springbootmall.rowmapper;

import com.pengchu.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();

        product.setProductId(resultSet.getInt("productId"));
        product.setProductName(resultSet.getString("productName"));
        product.setCatrgory(resultSet.getString("category"));
        product.setImageUrl(resultSet.getString("imageUrl"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDecription(resultSet.getString("description"));
        product.setCreatedDate(resultSet.getTimestamp("createdDate"));
        product.setLastModifiedDate(resultSet.getTimestamp("lastModifiedDate"));

        return product;
    }
}
