package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
    @GetMapping(value = {"/", "index.html"})
    public String index(ModelAndView model){
        return "views/index";
    }

    @GetMapping("/your-endpoint")
    public String handleRequest(@RequestParam(name = "map") String mapParam) {
        //BackEnd:
        System.out.println(mapParam);
        
        return "views/index";
    }
}
