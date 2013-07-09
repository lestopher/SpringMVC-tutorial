package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/*")
public class HelloWorldController {

    @RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String sayHi(Model model) {
        model.addAttribute("msg", "Hello World Example");
        return "HelloWorldPage";
    }
    
    @RequestMapping(value="/", method=RequestMethod.GET)
	public String rootView(HttpServletRequest request, Model model) {
        return "RootPage";
    }
}
