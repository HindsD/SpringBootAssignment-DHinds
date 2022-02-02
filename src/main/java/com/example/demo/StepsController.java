package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/steps")
public class StepsController {
    @RequestMapping("/first")
    public String showFirstStep(){ return "pages/tutorialStepOne"; }

    @RequestMapping("/second")
    public String showSecondStep(){ return "pages/tutorialStepTwo"; }

    @RequestMapping("/third")
    public String showThirdStep(){ return "pages/tutorialStepThree"; }
}
