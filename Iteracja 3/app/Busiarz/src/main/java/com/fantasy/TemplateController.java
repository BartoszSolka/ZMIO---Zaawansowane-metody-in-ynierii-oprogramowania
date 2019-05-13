package com.fantasy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
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
}
