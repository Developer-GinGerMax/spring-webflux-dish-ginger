package net.ginger.app.UserService.dish;
import java.util.Objects;
import lombok.Data;
@Data


class Dish {
    private String description;
    private boolean delivered = false;

    Dish(String description){
        this.description = description;
    }

    public static Dish deliver(Dish dish){
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }
}
