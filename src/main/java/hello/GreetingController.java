package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

@Controller
public class GreetingController {

  List<String> persons = Arrays.asList("Walter White", "Heisenberg", "Jesse Pinkman", "Saul Goodman", "Gustavo Fringe");

  Function<List<String>, String> random = (List<String> list) -> list.get(new Random().nextInt(list.size() - 1));

  @RequestMapping("/greeting")
  public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
    model.addAttribute("name", name);
    return "greeting";
  }



  @RequestMapping("/randomgreeting")
  public String whoAmI(Model model){
    final String randomName = random.apply(persons);
    model.addAttribute("name",
        persons
            .stream()
            .filter(person -> person.equals(randomName))
            .findFirst().get());
    return "greeting";
  }

}
