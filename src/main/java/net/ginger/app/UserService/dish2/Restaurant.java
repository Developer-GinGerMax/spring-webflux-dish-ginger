package net.ginger.app.UserService.dish2;

/**
 * 구독(subscription) 을 하기 전에는 어떤 연산도 일어나지 않는다.
 * Flux<Dish>는 머지않아 전달될 결과를 담는 플레이스홀더일 뿐이다.
 *
 * */

public class Restaurant {
    public static void main(String... args) {
        AdvancedServer server = new AdvancedServer(new KitchenService());
        server.doingMyJob().subscribe(
                dish -> System.out.println(dish),
                throwable -> System.out.println(throwable)
        );
    }
}
