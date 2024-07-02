package com.programacaoweb.categorias.models;

public class ProductCategory {
    private Long productId;
    private String productName;
    private String productDescription;
    private String categoryName;

    // Getters
    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getCategoryName() {
        return categoryName;
    }

    // Setters
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
