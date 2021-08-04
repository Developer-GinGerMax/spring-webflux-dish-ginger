package net.ginger.app.UserService.dish;

public class PoliteRestaurant {
    public static void main(String[] args) {
        PoliteServer server = new PoliteServer(new KitchenService());
        server.doingMyJob().subscribe(
                dish -> System.out.println(dish + "를 먹었다"),
                throwable -> System.out.println(throwable)
        );
    }
}
