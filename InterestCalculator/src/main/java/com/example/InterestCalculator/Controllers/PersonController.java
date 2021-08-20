package com.example.InterestCalculator.Controllers;

import com.example.InterestCalculator.Classes.Person;
import com.example.InterestCalculator.Data.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("index")
    public String welcomePage() {
        return "index";
    }

    @GetMapping("addPerson")
    public String addPerson(Model model, Person newPerson) {
        newPerson = new Person();
        personRepository.save(newPerson);
        model.addAttribute("title", "Add Person");
        model.addAttribute("person", personRepository.findAll());
        model.addAttribute("personName", newPerson);

        return "addPerson";
    }


    @GetMapping("person")
    public String displayPerson(@ModelAttribute @Validated Person newPerson, Model model) {
        personRepository.save(newPerson);
        model.addAttribute("person", personRepository.findAll());
        model.addAttribute("title", "Person");

        return "personDisplay";
    }
}
