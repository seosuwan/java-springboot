package seosuwan.UserService.dish_observer;

/**
 * 구독(subscription) 을 하기 전에는 어떤 연산도 일어나지 않는다.
 *
 */
public class PoliteRestaurant {
    public static void main(String... args) {
        PoliteServer server = new PoliteServer(new KitchenService());
        server.doingMyjob().subscribe(
                dish -> System.out.println(dish +"를 먹먹했다"),
                throwable -> System.out.println(throwable)
        );
    }
}
