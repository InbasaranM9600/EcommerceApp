package com.example.ecommerceapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.MyViewHolder> {
    private Context context;
    private List<CartModel> productModelList;

    public CartAdapter(Context context) {
        this.context = context;
        productModelList=new ArrayList<>();
    }

    public void addProduct(CartModel productModel){

        productModelList.add(productModel);
        notifyDataSetChanged();
    }

    public List<CartModel> getSelectedItems() {
        List<CartModel> selectedItems = new ArrayList<>();
        for (CartModel cartModel : productModelList) {
            if (cartModel.is_selected) {
                selectedItems.add(cartModel);
            }
        }
        return selectedItems;
    }


    @NonNull
    @Override
    public CartAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_row, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        CartModel cartModel = productModelList.get(position);
        holder.title.setText(cartModel.getProductName());
        holder.price.setText(cartModel.getProductPrice());
        holder.qty.setText(cartModel.getProductQty());

        Glide.with(context).load(cartModel.getProductImage())
                .into(holder.img);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cartModel.is_selected){
                    holder.main.setBackgroundColor(context.getResources().getColor(R.color.white));
                    cartModel.is_selected=false;
                }
                else {
                    holder.main.setBackgroundColor(context.getResources().getColor(R.color.teal_700));
                    cartModel.is_selected=true;
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return productModelList.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView title,qty,price;
        private ImageView img;

        private LinearLayout main;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            qty=itemView.findViewById(R.id.qty);
            price=itemView.findViewById(R.id.price);
            img=itemView.findViewById(R.id.image);
            main=itemView.findViewById(R.id.mainLayout);
        }
    }
}
