package com.example.ecommerceapp;

public class CartModel {

    private String cartId;
    private String productName;
    private String productImage;
    private String productPrice;
    private String productQty;
    private String sellurUid;

    private String orderNumber;

    public boolean is_selected;

    public CartModel() {
    }

    public CartModel(String cartId, String productName, String productImage, String productPrice, String productQty, String sellurUid, String orderNumber) {
        this.cartId = cartId;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productQty = productQty;
        this.sellurUid = sellurUid;
        this.orderNumber = orderNumber;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public String getSellurUid() {
        return sellurUid;
    }

    public void setSellurUid(String sellurUid) {
        this.sellurUid = sellurUid;
    }
}
