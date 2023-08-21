package com.alh.tiendaOnline.model;

import java.util.Date;

public class Pedido {
    private int idPedido;
    private String numero;
    private Date fechaPedido;
    private Date fechaRecibo;
    private String status;
    private double total;

    public Pedido(){

    }

    public Pedido(int idPedido, String numero, Date fechaPedido, Date fechaRecibo, String status, double total) {
        this.idPedido = idPedido;
        this.numero = numero;
        this.fechaPedido = fechaPedido;
        this.fechaRecibo = fechaRecibo;
        this.status = status;
        this.total = total;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaRecibo() {
        return fechaRecibo;
    }

    public void setFechaRecibo(Date fechaRecibo) {
        this.fechaRecibo = fechaRecibo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
