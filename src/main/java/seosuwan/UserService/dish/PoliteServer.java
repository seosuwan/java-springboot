package seosuwan.UserService.dish;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class PoliteServer {
    private final KitchenService Kitchen;

    Flux<Dish> doingMyjob(){
        return Kitchen.getDishes()
                .doOnNext(dish -> System.out.println(String.format("감사감사." +dish)))
                .doOnError(error -> System.out.println(error.getMessage()+"때문에 죄송합니다."))
                .doOnComplete(()-> System.out.println("모든것이 땡큐"))
                .map(Dish::deliver);
    }
}
