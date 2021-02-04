package kerneels.mvc.controllers;

import kerneels.mvc.repository.CustomerRepository;
import kerneels.mvc.repository.IssuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexController {

    @Autowired
    private CustomerRepository customerRepository;
    private IssuesRepository issuesRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
        public String landingPage(Model model) { // Model view controller
        model.addAttribute("Customers", customerRepository.findAll());
        return "homepage";
    }

    @RequestMapping(value = "/customers.html", method = RequestMethod.GET)
        public String customerPage(Model model) {
        model.addAttribute("Customers", customerRepository.findAll());
        return "customers";
    }

    @RequestMapping(value = "/comics.html", method = RequestMethod.GET)
    public String comicsPage(Model model) {
        model.addAttribute("Issues", issuesRepository.findAll());
        return "comics";
    }
}
