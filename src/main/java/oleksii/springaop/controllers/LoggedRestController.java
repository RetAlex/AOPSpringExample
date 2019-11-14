package oleksii.springaop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggedRestController {
    @GetMapping("/api/getRest")
    public String getRest(){
        return "rest";
    }
}
