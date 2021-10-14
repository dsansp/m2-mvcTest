package com.example.m2mvcTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SmartPhoneController {
@GetMapping("/smartphone/show")
    public String showSmartPhone(Model model){
    SmartPhone smartphone1 = new SmartPhone (1L,"Samsung Galaxy", 8);
    SmartPhone smartphone2 = new SmartPhone (2L,"Nokia 9800", 32);

    model.addAttribute("samsung",smartphone1);
    model.addAttribute("nokia",smartphone2);

    return "smartphoneview";
}
    @GetMapping("/smartphonelist")
public String findAll(Model model) {
List<SmartPhone> smartphones= new ArrayList<>();
       SmartPhone smartphone2= new SmartPhone(4L,"Xiaomi A9", 32);
        SmartPhone smartphone3= new SmartPhone(5L,"IphoneX", 16);
        SmartPhone smartphone4= new SmartPhone(6L,"One Plus9", 16);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);
        smartphones.add(smartphone4);

        model.addAttribute("smar",smartphones);
    return "smartphonelist";
    }
}

