package web.project.webproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import web.project.webproject.entity.MaterialAssets;
import web.project.webproject.entity.Person;
import web.project.webproject.repository.MaterialAssetsRepository;
import web.project.webproject.repository.PersonRepository;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private MaterialAssetsRepository materialAssetsRepository;

    @GetMapping("/")
    public String listOfPeople(Model model){
        List<Person> listPeople = personRepository.findAll();
        model.addAttribute("listPeople", listPeople);
        return "index";
    }
    @GetMapping("/person/new")
    public String createPerson(Model model){
        model.addAttribute("person", new Person());
        return "create_person";
    }

    @PostMapping("/person/save")
    public String savePerson(Person person){
        personRepository.save(person);
        return "redirect:/";
    }

    @GetMapping("/person/delete/{id}")
    public String deletePerson(@PathVariable("id") Integer id, Model model){
        personRepository.deleteById(id);
        return "redirect:/";
    }

}
