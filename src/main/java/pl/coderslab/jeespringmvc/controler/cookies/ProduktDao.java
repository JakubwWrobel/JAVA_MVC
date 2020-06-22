package pl.coderslab.jeespringmvc.controler.cookies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProduktDao {
    Product mleko = new Product("mleko", 12, 1);
    Product ser = new Product("ser", 5, 2);
    Product masło = new Product("masło", 3, 3);

    public List<Product> getList() {
        List<Product> productList = new ArrayList<>();
        productList.add(masło);
        productList.add(mleko);
        productList.add(ser);
        return productList;

    }
}
