package com.example.registramaislistapedido.ui.recyclerviewpedidos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.registramaislistapedido.R;
import com.example.registramaislistapedido.model.Pedido;

import java.util.List;

public class PedidoAdapter extends RecyclerView.Adapter<PedidoAdapter.ViewHolder> {

    private List <Pedido> pedidoList;

    public PedidoAdapter(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @NonNull
    @Override
    public PedidoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_recycler_pedido,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PedidoAdapter.ViewHolder holder, int position) {
        Pedido pedido = pedidoList.get(position);
        holder.vicula(pedido);

    }

    @Override
    public int getItemCount() {return pedidoList.size();}


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewPedido;
        private TextView textViewValor;
        private TextView textViewData;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            textViewData=itemView.findViewById(R.id.txtViewData);
            textViewPedido=itemView.findViewById(R.id.txtViewNomeComida);
            textViewValor=itemView.findViewById(R.id.txtViewValorPedido);
        }
        public void vicula(Pedido pedido) {
            textViewData.setText(pedido.getData());
            textViewValor.setText(pedido.getValorComoString());
            textViewPedido.setText(pedido.getProduto());

        }
    }
}
