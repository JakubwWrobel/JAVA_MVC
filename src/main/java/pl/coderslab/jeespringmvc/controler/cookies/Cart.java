package pl.coderslab.jeespringmvc.controler.cookies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//Scope tworzy osobną sesje koszyka dla każdego klienta, wymagane ponieważ domyślnie klasa Produkt która posiada Cart jest Singletonem
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class Cart {
    private List<CartItem> cartItems = new ArrayList<>();

    public List<CartItem> addToCart(CartItem cartItem) {
        if (cartItems.size() == 0) {
            this.cartItems.add(cartItem);
        } else {
            if (containsProdukt(cartItem)) {
                for (int i = 0; i < this.cartItems.size(); i++) {
                    if (cartItems.get(i).getProduct() == cartItem.getProduct()) {
                        cartItems.get(i).setQuantity((int) (cartItems.get(i).getQuantity() + cartItem.getQuantity()));
                    }
                }
            } else {
                this.cartItems.add(cartItem);
            }
        }
        return this.cartItems;
    }

    public boolean containsProdukt(CartItem cartItem) {
        return cartItems.stream().filter(o -> o.getProduct().getName().equals(cartItem.getProduct().getName())).findFirst().isPresent();
    }

    public List<CartItem> getCartItems() {
        return this.cartItems;
    }

    public int getNumberOfPositions() {
        return this.cartItems.size();
    }

    public int getNumberOfQuantities() {
        int count = this.cartItems.stream()
                .mapToInt(o -> (int) o.getQuantity())
                .sum();
        return count;
    }

    public double getTotalAmount() {
        double prize = this.cartItems.stream()
                .mapToInt(o -> (int) (o.getProduct().getPrice() * o.getProduct().getPrice()))
                .sum();
        return prize;
    }

    public double getSizeOfCart() {
        return this.cartItems.size();
    }
    
    @Override
    public String toString() {
        return "Cart{" +
                "cartItems=" + cartItems +
                '}';
    }
}
