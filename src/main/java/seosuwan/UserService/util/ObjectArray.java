package seosuwan.UserService.util;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//하나의 클래스엔 public이 하나만 존재

@Data class Product {
    private final int productId;
    private final String description;
}
public class ObjectArray {
    public Product[] createCart() {
        Product[] cart = new Product[5];
        String[] productNames = {"Coffee","Computer","Apple","Dress","Fairy-tale book"};
        int j = 0;
        Product p1 = new Product(1, "Coffee");
        Product p2 = new Product(2, "Computer");
        Product p3 = new Product(3, "Apple");
        Product p4 = new Product(4, "Dress");
        Product p5 = new Product(5, "Fairy-tale book");

        for(int i = 0; i < cart.length; i ++){
            cart[j] = new Product(i + 1,productNames[j]);
            j++;
        }

        return cart;
    }
}

