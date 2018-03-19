package io.honeymon.springboot.jspsample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @RequestMapping("/")
    public String helloWorld(Model model) {

        model.addAttribute("hello", "dfkas 111");
        return "hello";
    }

    @RequestMapping("/2nd")
    public String secondSubPage() {
        return "test/list";
    }
}
