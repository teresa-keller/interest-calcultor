package com.example.InterestCalculator.Controllers;

import com.example.InterestCalculator.Classes.Person;
import com.example.InterestCalculator.Data.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("index")
    public String welcomePage() {
        return "index";
    }

    @GetMapping("addPerson")
    public String addPerson(Model model, Person person) {
        person = new Person();
        personRepository.save(person);
        model.addAttribute("title", "Add Person");

        return "addPerson";
    }

    @PostMapping("person")
    public String displayPerson(Model model) {
        model.addAttribute("person", personRepository.findAll());
        model.addAttribute("title", "Person");

        return "personDisplay";
    }
}
