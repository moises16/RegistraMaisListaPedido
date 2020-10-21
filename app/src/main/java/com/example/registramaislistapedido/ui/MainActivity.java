package com.example.registramaislistapedido.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.registramaislistapedido.R;
import com.example.registramaislistapedido.dao.PedidoDAO;
import com.example.registramaislistapedido.model.Pedido;
import com.example.registramaislistapedido.ui.recyclerviewpedidos.adapter.PedidoAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView RecyclerViewPedidos;
    private TextView textViewTotalDeLucro;
    private PedidoAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConfiguraListView();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 2 && data.hasExtra("SALVAR_PEDIDO")) {
            Pedido pedido = (Pedido) data.getSerializableExtra("SALVAR_PEDIDO");
            new PedidoDAO().inseri(pedido);
            adapter.notifyDataSetChanged();
        }
    }
    private void ConfiguraListView(){
        gerarPedidos(100);
        RecyclerViewPedidos=findViewById(R.id.recyclerViewListaPedidos);
        RecyclerViewPedidos.setLayoutManager(new LinearLayoutManager(this));
        final List<Pedido> pedidos = new PedidoDAO().recuperTodosPedidos();
        adapter = new PedidoAdapter(pedidos);
        RecyclerViewPedidos.setAdapter(adapter);


    }

    private  void gerarPedidos(double qtsPedidos){
        for (int i=1; i<=qtsPedidos;i++){
new PedidoDAO().inseri(new Pedido(25,"vatapa","24/10/2020"));
        }
    }
}

