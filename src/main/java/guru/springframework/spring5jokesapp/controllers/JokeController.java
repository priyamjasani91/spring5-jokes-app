package guru.springframework.spring5jokesapp.controllers;

import guru.springframework.spring5jokesapp.services.JokeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";

    }
}
