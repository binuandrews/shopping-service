package com.shopping.shoppingservice.model;

public class ShoppingList {
    private String productName;
    private String productDesc;

    private String productId;

    public ShoppingList(String productId, String productName, String productDesc) {
        this.productName = productName;
        this.productDesc = productDesc;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

}
