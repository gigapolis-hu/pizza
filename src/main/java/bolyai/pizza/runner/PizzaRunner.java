package bolyai.pizza.runner;

import bolyai.pizza.model.Pizza;
import bolyai.pizza.model.PizzaMeret;
import bolyai.pizza.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PizzaRunner implements ApplicationRunner {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Pizza pizza = new Pizza();
        pizza.setNev("Sonkás (nagy)");
        pizza.setMeret(PizzaMeret.NAGY);
        pizza.setAr(1000);
        pizza.setVegan(false);
        pizzaRepository.save(pizza);

        System.out.println("Sonkás (nagy) pizza létrehozva.");

        pizza = new Pizza();
        pizza.setNev("Tonhalas (normál)");
        pizza.setMeret(PizzaMeret.NORMAL);
        pizza.setAr(1200);
        pizza.setVegan(false);
        pizzaRepository.save(pizza);

        System.out.println("Tonhalas (közepes) pizza létrehozva.");

        pizza = new Pizza();
        pizza.setNev("Kukoricás (kicsi)");
        pizza.setMeret(PizzaMeret.KICSI);
        pizza.setAr(900);
        pizza.setVegan(true);
        pizzaRepository.save(pizza);

        System.out.println("Kukoricás (kicsi) pizza létrehozva.");
    }
}
