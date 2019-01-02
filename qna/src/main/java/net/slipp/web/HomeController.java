package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping("/")    
    public String home()
    {
        // view(/home.jsp)를 Return  
        return "home";
    }

}