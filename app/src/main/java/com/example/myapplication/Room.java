package com.example.myapplication;

public class Room {

    String id;
    String name;
    double price;
    String status;
    String tenantName;
    String tenantPhone;

    public Room(String id, String name, double price, String status, String tenantName, String tenantPhone) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.tenantName = tenantName;
        this.tenantPhone = tenantPhone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public String getTenantName() {
        return tenantName;
    }

    public String getTenantPhone() {
        return tenantPhone;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}