package seosuwan.UserService.dish_observer;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

/***
 * 주방장의 인스턴스를 생성자 주입으로 받는다(연관관계) Kitchen 이 갑이다
 * Kitchen.getDishes()는 알바가 주방에 가서 요리를 가져오는 모습이다.
 * 요리가 완성되면 즉시 손님에게 전달한다... map()
 * Reactive Consumer 는 다른 Reactive Service 를 호출하고 결과를 변환(transform)한다.
 * 서빙점원의 역할은 웹 컨트롤이다.
 */
@RequiredArgsConstructor
public class PoliteServer {
    private final KitchenService Kitchen;

    Flux<Dish> doingMyjob(){
        return Kitchen.getDishes()
                .doOnNext(dish -> System.out.println(String.format("주문해주셔서 감사감사." +dish)))
                .doOnError(error -> System.out.println(error.getMessage()+"때문에 죄송합니다."))
                .doOnComplete(()-> System.out.println("모든것이 땡큐"))
                .map(Dish::deliver);
    }
}
