package converting.controller;

import converting.service.IConvertingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Converting {

    @Autowired
    private IConvertingService convertingService;

    @GetMapping("")
    public String showFormList() {
        return "list";
    }

    @PostMapping()
    public String save(Model model, double usd) {
        double vnd = convertingService.calculate(usd);
        model.addAttribute("vnd", vnd);
        return "list";
    }
}
