package net.kikuchy.privatejit.controller;

import net.kikuchy.privatejit.entity.NewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * A controller gives front form to register a repository.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("newRepository", new NewRepository());
        return "index";
    }
}
