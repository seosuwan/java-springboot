package seosuwan.UserService.item.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import seosuwan.UserService.item.entity.Cart;
import seosuwan.UserService.item.repository.CartRepository;
import seosuwan.UserService.item.repository.ItemRepository;

@Service
@RequiredArgsConstructor
public class CartService {

    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;

    CartService(ItemRepository itemRepository, CartRepository cartRepository){
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;

    }
    Mono<Cart> addToCart(String cartId, String id){
        return this.cartRepository.findAllById(cartId)
                .defaultIfEmpty(new Cart(cartId))
                .flatMap(cart -> cart.getCartItems().stream())
                    .filter(cartItem -> cartItem.getItem())
    }
}
