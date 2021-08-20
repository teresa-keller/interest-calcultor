package com.example.InterestCalculator.Controllers;

import com.example.InterestCalculator.Classes.CreditCard;
import com.example.InterestCalculator.Data.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("creditCard")
public class CreditCardController {

    @Autowired
    CreditCardRepository creditCardRepository;

    @GetMapping
    public String addCard(Model model, CreditCard creditCard) {
        creditCard = new CreditCard();
        creditCardRepository.save(creditCard);
        model.addAttribute("title", "Credit Card");
        return "test";
    }

    @PostMapping
    public String saveCard(Model model) {
        model.addAttribute("creditCard", creditCardRepository.findAll());
        return "test";
    }
}
