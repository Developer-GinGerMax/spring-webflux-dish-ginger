package net.ginger.app.UserService.item.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class ItemController {

    @GetMapping
    Mono<?> home(){
        return null;
    }
    // 87p
    @PostMapping("/add/{id}")
    Mono<String> addToCart(@PathVariable String id){
        return null;
    }
}
