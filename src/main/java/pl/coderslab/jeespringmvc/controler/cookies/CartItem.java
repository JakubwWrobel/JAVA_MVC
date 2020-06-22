package pl.coderslab.jeespringmvc.controler.cookies;

import org.springframework.stereotype.Component;


@Component
public class CartItem {
    private int quantity;
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "quantity=" + quantity +
                ", product=" + product.getName() +
                '}';
    }

    public CartItem(int quantity, Product product) {
        this.product = product;
        this.quantity = quantity;
    }

    public CartItem(){};
}
