package embeddedjetty.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

    @Value("${example.message}")
    private String message;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String showIndex() {
        return "Hello world!! "+message;
    }

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView helloWorld() {
        return new ModelAndView("helloWorld");
    }
}
