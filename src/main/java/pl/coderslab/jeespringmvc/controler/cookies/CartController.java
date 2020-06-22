package pl.coderslab.jeespringmvc.controler.cookies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.stream.Collectors;

//wstrzyknij komponent typu Cart.

@Controller
@SessionAttributes({"cart"})
public class CartController {
    //    works with AutoWired here, instead of constructor
    @Autowired
    private Cart cart;
    @Autowired
    private ProduktDao produktDao;

/*    public CartController(Cart cart) {
        this.cart = cart;
    }*/

    @RequestMapping("/addtocart/{id}/{quantity}")
    @ResponseBody
    public String addtocart(HttpSession session, @PathVariable(name = "id") int id, @PathVariable(name = "quantity") int quantity) {
        cart.addToCart(new CartItem(quantity, produktDao.getList().get(id)));
        session.setAttribute("cart", cart);
        return "Added to Cart";
    }

    @GetMapping("/cart")
    public String showCart() {
        return "show-cart";
    }
}
