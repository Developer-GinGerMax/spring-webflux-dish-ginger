package net.ginger.app.UserService.dish2;
import reactor.core.publisher.Flux;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SimpleServer {
    private final KitchenService kitchen;

    Flux<Dish> doingMyJob(){
        return this.kitchen.getDishes().map(dish -> Dish.deliver(dish));
    }
}
