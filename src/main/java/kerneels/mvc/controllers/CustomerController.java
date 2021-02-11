package kerneels.mvc.controllers;

//import kerneels.mvc.models.Customer;
import kerneels.mvc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String customerPage(Model model) {
        model.addAttribute("Customers", customerRepository.findAll());
        return "customers";
    }
}
