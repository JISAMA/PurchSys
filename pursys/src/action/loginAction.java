package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import service.LoginService;

public class loginAction extends ActionSupport implements ServletRequestAware {
	
	private LoginService userService;
	private HttpServletRequest request;
	private String username;
	private String password;
    
	
	public String login(){
		
	
		  List<User> users=userService.findUser();
//		  HttpServletRequest request=ServletActionContext.getRequest();//获得session
//        HttpSession session=request.getSession(); 
       
//        String username = (String) session.getAttribute("username");
//        String password = (String) session.getAttribute("password");
//		
		for(User user:users){
			if(user.getUser().equals(username) && user.getPassword().equals(password)){
				ServletActionContext.getRequest().getSession().setAttribute("user", username);
				
				return "loginsucc";
			}
			}
//		session.removeAttribute("username");
//		session.removeAttribute("password");
		return "fail";
		
		}
		
		
	


	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}


	public LoginService getUserService() {
		return userService;
	}


	public void setUserService(LoginService userService) {
		this.userService = userService;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
