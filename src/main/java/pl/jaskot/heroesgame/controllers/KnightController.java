package pl.jaskot.heroesgame.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.jaskot.heroesgame.domain.Knight;
import pl.jaskot.heroesgame.services.KnightService;

import java.util.List;

@Controller
public class KnightController {

    @Autowired
    KnightService knightService;

    @RequestMapping(value = "/knights", method = RequestMethod.GET)
    public String getKnights(Model model){
        List<Knight> knights = knightService.getKnights();
        model.addAttribute("knights",knights);
        return "knights";
    }

    @RequestMapping("/newknight")
    public String createKnight(Model model){
        model.addAttribute("knight", new Knight());
        return "new_knights";
    }

    @RequestMapping(value = "/knights", method = RequestMethod.POST)
    public String saveKnights(Knight knight){
        knightService.saveKnight(knight);
        return "redirect:/knights";
    }

//    @RequestMapping(value = "/knights", method = RequestMethod.DELETE)
//    public String deleteKnights(Model model){
//        String kName = (String) model.getAttribute("name");
//        knightService.deleteKnight(kName);
//        return "redirect:/knights";
//    }
}
