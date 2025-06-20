package ayarabu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


//Ctrl+Shift+o 自動的にimportする
//Ctrl+Shift+f 自動成形

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "あやらぶ");
        return "index";
    }
}