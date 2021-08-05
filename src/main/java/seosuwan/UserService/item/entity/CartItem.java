package seosuwan.UserService.item.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.beans.ConstructorProperties;

/***
 * 아이템과 수량포함 구매 상품 데이터
 */
@Data public class CartItem {
    private Item item;
    private int quantity;


    private CartItem(){}

    CartItem(Item item){
        this.item = item;
        this.quantity = 1;
    }
}
