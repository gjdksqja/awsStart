package AWS.Login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/login/"})
public class LoginController {
	private Log logger = LogFactory.getLog(LoginController.class);
	 @RequestMapping("main.do")
	  public String loginMain(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
	    	   
	    return "page";
	 }
	 @RequestMapping({"login.do"})
	  public String loginStart(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
	    	   
	    return "login/login";
	 }
	 @RequestMapping({"logout.do"})
	  public String loginOut(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
	    	   
	    return "";
	 }	 
}
