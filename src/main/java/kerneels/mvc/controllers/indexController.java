package kerneels.mvc.controllers;

import kerneels.mvc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
        public String landingPage(Model model) { // Model view controller
        model.addAttribute("Customers", customerRepository.findAll());
        return "index";
    }
}
