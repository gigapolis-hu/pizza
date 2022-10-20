package bolyai.pizza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/etlap")
    public String menuPage() {
        return "etlap";
    }

    @GetMapping("/bemutatkozas")
    public String aboutPage() {
        return "bemutatkozas";
    }

    @GetMapping("/kapcsolat")
    public String contactPage() {
        return "kapcsolat";
    }

    @GetMapping("/rendeles")
    public String orderPage() {
        return "rendeles";
    }

    @GetMapping("/visszaigazolas")
    public String confirmationPage() {
        return "visszaigazolas";
    }

}
