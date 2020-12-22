package kerneels.mvc.controllers;

import com.sun.corba.se.impl.logging.POASystemException;
import kerneels.mvc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HelloController {
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloForm(Model model) { // Model view controller
        model.addAttribute("Customers", customerRepository.findAll());
        return "helloForm";
    }

    @RequestMapping( value = "/hello", method = RequestMethod.POST)
    public String hello(HttpServletRequest request, Model model) {

        String name = request.getParameter("name");

        if( name == null) {
            name = "world";
        }

        model.addAttribute("name", name);
        return "hello";
//        return  "<h1>HEllo" + name +"</h1>";
    }

}
