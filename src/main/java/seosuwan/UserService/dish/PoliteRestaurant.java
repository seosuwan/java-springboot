package seosuwan.UserService.dish;

public class PoliteRestaurant {
    public static void main(String[] args) {
        PoliteServer server = new PoliteServer(new KitchenService());
        server.doingMyjob().subscribe(
                dish -> System.out.println(dish +"를 먹먹"),
                throwable -> System.out.println(throwable)
        );
    }
}
