package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    ToDoRepository ToDoRepository;

    @RequestMapping("/")
    public String todoList(Model model){
        model.addAttribute("toDos", ToDoRepository.findAll());
        return "todoList";
    }
    @GetMapping("/add")
    public String todoForm(Model model){
        model.addAttribute("toDo", new ToDo());
        return "todoForm";
    }
    @PostMapping("/process")
    public String processForm(@Valid ToDo todo, BindingResult result){
        if (result.hasErrors()){
            return "todoForm";
        }
        ToDoRepository.save(todo);
        return "redirect:/";
    }

}
