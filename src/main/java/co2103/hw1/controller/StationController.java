package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Radio;
import co2103.hw1.domain.Station;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class StationController {

    @InitBinder
    protected void initBinder(WebDataBinder binder){binder.addValidators(new StationValidator());}

    @GetMapping("/stations")
    public String stations(@RequestParam int radio, Model model) {
        for (Radio r: Hw1Application.radios){
            if(r.getId() == radio){
                model.addAttribute("radio_id", radio);
                model.addAttribute("stations", r.getStations());
            }
        }
        return "stations/list";
    }

    @RequestMapping("/newStation")
    public String newStation(@RequestParam int radio, Model model){
        model.addAttribute("station", new Station());
        model.addAttribute("radio", radio);
        return "stations/form";
    }

    @PostMapping("/addStation")
    public String addStation(@RequestParam int radio, @Valid @ModelAttribute Station station, BindingResult result, Model model) {
        if (result.hasErrors()){
            model.addAttribute("radio", radio);
            return "stations/form";
        }
        for (Radio r: Hw1Application.radios){
            if(r.getId() == radio){
                r.addStation(station);
            }
        }
        return "redirect:/radios";
    }
}
