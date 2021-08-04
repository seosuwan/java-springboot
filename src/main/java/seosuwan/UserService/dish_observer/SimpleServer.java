package seosuwan.UserService.dish_observer;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class SimpleServer {
    private final KitchenService Kitchen;


    Flux<Dish> doingMyjob(){
        return this.Kitchen.getDishes().map(dish -> Dish.deliver(dish));
    }
}
