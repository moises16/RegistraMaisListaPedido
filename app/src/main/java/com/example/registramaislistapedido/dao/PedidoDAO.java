package com.example.registramaislistapedido.dao;

import com.example.registramaislistapedido.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    private static int ultimoId = 0;
    private static List<Pedido> pedidoList = new ArrayList<>();

    public void inseri(Pedido pedido) {
        pedido.setId(ultimoId);
        pedidoList.add(pedido);
        ultimoId++;
    }

    public List<Pedido> recuperTodosPedidos() {
        return pedidoList;

    }
}

