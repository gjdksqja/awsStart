package AWS.common.logger;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggingInterceptor extends HandlerInterceptorAdapter {
	//private Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);
	protected Log log = LogFactory.getLog(LoggerAspect.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	    log.debug("====================Request Info====================");
	    log.debug("request.getRequestURI() : " + request.getRequestURI());
	    log.debug("request.getRequestURL() : " + request.getRequestURL());
	    log.debug("request.getServletPath() : " + request.getServletPath());
	    log.debug("request.getContextPath() : " + request.getContextPath());
	    log.debug("request.getPathInfo() : " + request.getPathInfo());
	    log.debug("request.getMethod() : " + request.getMethod());
	    log.debug("this.getClass().getName() : " + handler.getClass().getName());
	    log.debug("request.getRemoteAddr() : " + request.getRemoteAddr());
	   
	    Enumeration<?> enums = request.getParameterNames();
	    while (enums.hasMoreElements()) {
	      String paramName = (String)enums.nextElement();
	      String[] parameters = request.getParameterValues(paramName);
	      for (int i = 0; i < parameters.length; i++)
	        log.debug("parameter ::: [" + paramName + "] " + parameters[i]); 
	    } 
	    log.debug("====================Request Info====================");
	    return true;
	  }
	}