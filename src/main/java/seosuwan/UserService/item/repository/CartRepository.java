package seosuwan.UserService.item.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import seosuwan.UserService.item.entity.Cart;

public interface CartRepository extends ReactiveCrudRepository<Cart, String> {

}
