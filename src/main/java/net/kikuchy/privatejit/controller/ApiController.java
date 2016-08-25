package net.kikuchy.privatejit.controller;

import net.kikuchy.privatejit.entity.NewRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Construct API version1 methods.
 */
@RestController
@RequestMapping("/api/v1")
public class ApiController {
    /**
     * Register the new Git repository and build it.
     *
     * @param newRepository have to contains repository's url.
     * @param model         A mode.
     * @return (In future, ) Status of registration.
     */
    @RequestMapping(path = "/repository", method = RequestMethod.POST)
    public String registerRepository(@ModelAttribute NewRepository newRepository, Model model) {
        return newRepository.getUrl();
    }
}
