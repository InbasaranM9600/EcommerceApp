package com.example.ecommerceapp;

public class OrderModel {

    private String orderedNumber;
    private String customerName;
    private String customerNumber;
    private String customerCityName;
    private String customerAddress;
    private String itemExpense;
    private String deliveryCharges;
    private String orderTrackingNumber;
    private String courier;
    private String orderPlacingDate;
    private String orderStatus;


    public OrderModel() {
    }

    public OrderModel(String orderedNumber, String customerName, String customerNumber, String customerCityName, String customerAddress, String itemExpense, String deliveryCharges, String orderTrackingNumber, String courier, String orderPlacingDate, String orderStatus) {
        this.orderedNumber = orderedNumber;
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.customerCityName = customerCityName;
        this.customerAddress = customerAddress;
        this.itemExpense = itemExpense;
        this.deliveryCharges = deliveryCharges;
        this.orderTrackingNumber = orderTrackingNumber;
        this.courier = courier;
        this.orderPlacingDate = orderPlacingDate;
        this.orderStatus = orderStatus;
    }

    public String getOrderedNumber() {
        return orderedNumber;
    }

    public void setOrderedNumber(String orderedNumber) {
        this.orderedNumber = orderedNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerCityName() {
        return customerCityName;
    }

    public void setCustomerCityName(String customerCityName) {
        this.customerCityName = customerCityName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getItemExpense() {
        return itemExpense;
    }

    public void setItemExpense(String itemExpense) {
        this.itemExpense = itemExpense;
    }

    public String getDeliveryCharges() {
        return deliveryCharges;
    }

    public void setDeliveryCharges(String deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getOrderPlacingDate() {
        return orderPlacingDate;
    }

    public void setOrderPlacingDate(String orderPlacingDate) {
        this.orderPlacingDate = orderPlacingDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
