package seosuwan.UserService.item.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
/***
 * 판매하는 아이템 객체 생성하기
 */
@Data public class Item {
    private @Id String id;
    private String name;
    private double price;

    private Item() {}

    Item(String name, double price){
        this.name = name;
        this.price = price;
    }

}
