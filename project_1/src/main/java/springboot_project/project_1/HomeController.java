package springboot_project.project_1;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String home() {
        return "home";
    }
}