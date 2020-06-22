package pl.coderslab.jeespringmvc.controler.cookies;

import org.springframework.stereotype.Component;

public class Product {
    private double price;
    private String name;
    private long id;


    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Product(String name, double price, long id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Product(String name, long id) {
        this.name = name;
        this.id = id;
    }
}
