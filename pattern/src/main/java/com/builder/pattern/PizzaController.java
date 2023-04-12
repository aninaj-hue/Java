package com.builder.pattern;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pizza")
public class PizzaController {
    @GetMapping("/homePage")
    public ResponseEntity<String> getHomePage() {
        return ResponseEntity.ok("Bun venit la Pizza Builder!");
    }
    @PostMapping("/build")
    public Pizza buildPizza(
            @RequestParam(name = "pepperoni", defaultValue = "false") boolean hasPepperoni,
            @RequestParam(name = "salt", defaultValue = "false") boolean isSalted,
            @RequestParam(name = "sweet_ketchup", defaultValue = "false") boolean hasSweetKetchup,
            @RequestParam(name = "cheese", defaultValue = "false") boolean hasCheese,
            @RequestParam(name = "spicy_ketchup", defaultValue = "false") boolean hasSpicyKetchup,
            @RequestParam(name = "ham", defaultValue = "false") boolean hasHam) {
        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder();

        pizzaBuilder.addPepperoni(hasPepperoni);//fara if
        pizzaBuilder.addSalt(isSalted);
        pizzaBuilder.addSweetKetchup(hasSweetKetchup);
        pizzaBuilder.addCheese(hasCheese);
        pizzaBuilder.addSpicyKetchup(hasSpicyKetchup);
        pizzaBuilder.addHam(hasHam);

        return pizzaBuilder.build();

    }
}

