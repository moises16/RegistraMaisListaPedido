package com.example.registramaislistapedido.model;

import java.util.Date;

public class Pedido {

private  int id;
private double valor;
private  String produto;
private String data;

    public Pedido(double valor, String produto, String data) {
        this.valor = valor;
        this.produto = produto;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValorComoString() {
        return String.valueOf(valor);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;

    }


    @Override
    public String toString() {
        return "R$" + valor +produto+data;
    }
}
