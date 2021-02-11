package kerneels.mvc.controllers;

import kerneels.mvc.models.Issues;
import kerneels.mvc.repository.IssuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IssueController {

    @Autowired
    private IssuesRepository issuesRepository;

    @RequestMapping(value = "/comics", method = RequestMethod.GET)
    public String comicsPage(Model model) {
        Iterable<Issues> Issues = issuesRepository.findTop10By();
        model.addAttribute("Issues", Issues);
        return "comics";
    }
}
