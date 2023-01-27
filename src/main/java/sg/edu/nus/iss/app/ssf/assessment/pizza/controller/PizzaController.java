package sg.edu.nus.iss.app.ssf.assessment.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import sg.edu.nus.iss.app.ssf.assessment.pizza.models.Order;
import sg.edu.nus.iss.app.ssf.assessment.pizza.models.Pizza;
import sg.edu.nus.iss.app.ssf.assessment.pizza.service.PizzaService;

@Controller
// @RequestMapping("/")
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @Autowired
    private HttpSession session;

    @GetMapping("/")
    public String orderForm(Model model) {
        model.addAttribute("pizza", new Pizza());
        return "pizza";
    }

    @PostMapping("/pizza")
    public String orderPizza(@ModelAttribute Pizza pizza, Model model) {
        model.addAttribute("order", new Order());
        return "/pizza/order";
    }

    @PostMapping("/delivery")
    public String orderPizza(@Valid Pizza pizza, BindingResult bindingResult, Model model, HttpSession session) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pizza";
        }
        return "delivery";
    }

    @PostMapping("/confirm")
    public String orderConfirm() {
        return "confirm";
    }

    // @GetMapping("delivery")
    // public String deliveryDetails(@Valid Delivery delivery, BindingResult bindingResult, Model model, HttpSession session) {
    //     if (bindingResult.hasErrors()) {
    //         model.addAttribute("errors", bindingResult.getAllErrors());
    //     }
    //     return "confirm";
    // }

    // @GetMapping("delivery")
    // public String orderConfirm(Model model) {
    //     return "confirm";
    // }

}
