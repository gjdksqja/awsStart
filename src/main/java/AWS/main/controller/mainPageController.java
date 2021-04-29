package AWS.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import AWS.main.service.Main_Service;

@Controller
public class mainPageController {
	  @Autowired
	  private Main_Service main_Service;

	  @RequestMapping("/home")
	  public String doMain(HttpSession session, ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		  String url = "";	
	    return url;
	  }	  
}
