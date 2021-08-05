package net.ginger.app.UserService.dish2;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor class AdvancedServer {
    private final KitchenService kitchen;
    Flux<Dish> doingMyJob() {
        return kitchen.getDishes()
                .doOnNext(dish -> System.out.println(dish))
                .doOnError(error -> System.out.println(error.getMessage()))
                .doOnComplete(() -> System.out.println("모든 주문이 완료되었다"))
                .map(Dish::deliver);
    }
}