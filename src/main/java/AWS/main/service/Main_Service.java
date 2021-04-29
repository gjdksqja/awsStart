package AWS.main.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;

public interface Main_Service {
	void getCustomMainPrograms(HttpSession paramHttpSession, String paramString, ModelMap paramModelMap) throws Exception;
}
