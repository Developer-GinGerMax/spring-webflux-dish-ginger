package net.ginger.app.UserService.dish2;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

/**
 * 주방장의 인스턴스를 생성자 주입으로 받는다 ( 연관관계 )
 * kitchen.getDishes() 는 알바가 주방에 가서 요리를 가져오는 모습이다.
 * 요리가 완성되면 즉시 손님에게 전달한다 ... map()
 * Reactive Consumer 는 다른 Reactive Service 를 호출하고 결과를 변환 ( transform ) 한다.
 * 서빙 점원의 역할은 웹 컨트롤이다.
 * */

@RequiredArgsConstructor
public class PrototypeServer {
    private final KitchenService kitchen;
    Flux<Dish> doingMyJob(){
        return kitchen.getDishes().map(dish -> Dish.deliver((dish)));
    }
}