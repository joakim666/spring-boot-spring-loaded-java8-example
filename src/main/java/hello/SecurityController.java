package hello;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring.support.Layout;

@Controller
public class SecurityController {

    @RequestMapping({"/", "/home"})
    public String home(final Model model) {
        return "home";
    }

    @Layout("layouts/logged_in")
    @RequestMapping("/hello")
    public String hello(@AuthenticationPrincipal User user, final Model model) {
        model.addAttribute("name", user.getUsername());
        return "hello";
    }

    @RequestMapping("/login")
    public String login(final Model model) {
        return "login";
    }
}
