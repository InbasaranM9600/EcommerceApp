package com.example.ecommerceapp;

import static com.example.ecommerceapp.CartActivity.CartsItemList;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecommerceapp.databinding.ActivityOrderPlacingBinding;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class OrderPlacingActivity extends AppCompatActivity {
    ActivityOrderPlacingBinding binding;
    int mainTotal=0;

    private String name,number,address,cityName,Postalcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOrderPlacingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.placeOder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=binding.name.getText().toString();
                address=binding.address.getText().toString();
                cityName=binding.cityName.getText().toString();
                number=binding.number.getText().toString();
                placeOrder();
            }
        });

    }

    private void placeOrder() {

        String orderNumber= String.valueOf(getRandomNumber(100000,999999));
        OrderModel orderModel = new OrderModel(orderNumber,name,number,cityName,address,String.valueOf(mainTotal),"100",null,"Tcs",String.valueOf(Calendar.getInstance().getTimeInMillis()),"Pending");

        FirebaseFirestore.getInstance()
                .collection("orders")
                .document(orderNumber)
                .set(orderModel);

        for (int i=0;i<CartsItemList.size();i++){
            CartModel cartModel=CartsItemList.get(i);
            cartModel.setOrderNumber(orderNumber);

            String id= UUID.randomUUID().toString();
            cartModel.setCartId(id);


            FirebaseFirestore.getInstance()
                    .collection("orderProducts")
                    .document(id)
                    .set(cartModel);




        }

    }
    public static int getRandomNumber(int min, int max){
        return (new Random()).nextInt((max - min) + 1) + min;

    }

    @Override
    protected void onStart() {
        super.onStart();
        for (int i=0;i<CartsItemList.size();i++){

            CartModel cartModel = CartsItemList.get(i);
            int price=Integer.parseInt(cartModel.getProductPrice());
            int qty=Integer.parseInt(cartModel.getProductQty());
            int total=price*qty;
            mainTotal+=total;
        }
        binding.expense.setText(String.valueOf(mainTotal));
        binding.delivery.setText("100");
        binding.totalCod.setText(String.valueOf(mainTotal+100));
    }
}