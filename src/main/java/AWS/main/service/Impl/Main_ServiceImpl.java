package AWS.main.service.Impl;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import AWS.main.service.Main_Service;

@Service("main_Service")
public class Main_ServiceImpl implements Main_Service {
	
	public void getCustomMainPrograms(HttpSession session, String tmplSiteCode, ModelMap model) throws Exception {
		
	}
}
