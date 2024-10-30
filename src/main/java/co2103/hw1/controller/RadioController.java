package co2103.hw1.controller;

import javax.validation.Valid;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Radio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class RadioController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {binder.addValidators(new RadioValidator());}

    @GetMapping("/radios")
    public String radios(Model model){
        model.addAttribute("radios", Hw1Application.radios);
        return"radios/list";
    }

    @RequestMapping("/newRadio")
    public String newRadio(Model model){
        model.addAttribute("radio", new Radio());
        return "radios/form";
    }

    @PostMapping("/addRadio")
    public String addRadio(@Valid @ModelAttribute Radio radio, BindingResult result){
        if (result.hasErrors()){
            return "radios/form";
        }
        Hw1Application.radios.add(radio);
        return "redirect:/radios";
    }
}
