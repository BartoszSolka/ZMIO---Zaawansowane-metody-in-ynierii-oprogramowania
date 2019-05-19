package com.fantasy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TemplateController {

    @GetMapping("/buy-ticket")
    public String buyTicket() {
        return "/buy-ticket";
    }

    @GetMapping("/view-ticket")
    public String viewTicket() {
        return "/view-ticket";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("login", new LoginDto());
        return "/login";
    }
}
