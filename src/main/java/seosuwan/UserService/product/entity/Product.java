package seosuwan.UserService.product.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Product {
    @Id
    private long productId;
}
