package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/")
public class HelloWorldController {
	
	
	private static final Logger logger = LogManager.getLogger(HelloWorldController.class);
	
    @RequestMapping(path="/" ,method=RequestMethod.GET)
    public @ResponseBody String HelloRequest(HttpServletRequest request, HttpServletResponse response) {
        
    	logger.debug("inside authResponse method, path =/uidai/auth/{aadhaar}");
    	
    	
		return "Hello World";
    
    }
}
