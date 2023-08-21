package com.alh.tiendaOnline.model;

public class DetallePedido {
    private int idDetallePedido;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;

    public DetallePedido() {
    }

    public DetallePedido(int idDetallePedido, String nombre, double cantidad, double precio, double total) {
        this.idDetallePedido = idDetallePedido;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
