package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

    @RequestMapping({"/", "/home"})
    public String home(final Model model) {
        return "home";
    }

    @RequestMapping("/hello")
    public String hello(final Model model) {
        return "hello";
    }

    @RequestMapping("/login")
    public String login(final Model model) {
        return "login";
    }
}
