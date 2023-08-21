package com.alh.tiendaOnline.model;

public class Producto {
    private int idProduct;
    private String productName;
    private String description;
    private int price;
    private String picture;
    private int cantidad;

    public Producto(){

    }

    public Producto(int idProduct, String productName, String description, int price, String picture, int cantidad) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.picture = picture;
        this.cantidad = cantidad;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
