package bolyai.pizza.repository;

import bolyai.pizza.model.Pizza;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PizzaRepository extends CrudRepository<Pizza, Long> {

    List<Pizza> findByOrderByNev();

}
