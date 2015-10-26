package pl.jwest.wildsnake.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kamila on 2015-10-12.
 */

@Controller
public class HomeController {
    @Value("${welcome.message}")
    private String pageMessage;
    @RequestMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("pageMessage", pageMessage);
        return "index";}
}
