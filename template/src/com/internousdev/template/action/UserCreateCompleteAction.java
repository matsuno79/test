package com.internousdev.template.action;
import java.util.Map;
import java.sql.SQLException;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdev.template.dao.UserCreateCompleteDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object> session;
	private UserCreateComplateDAO userCreateComplateDAO = new UserCreateComplateDAO();

	public String execute() throws SQLEXception {
		userCreateCompleteDAO.cerateUser(session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString());

		String result = SUCCESS;
		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}


public String getLoginPassword(){
	return loginPassword;
}

public void setLoginPassword(String loginPassword){
	this.loginPassword = loginPassword;
}

public String getUaerName(){
	return userName;
}

public void setUserName(String userName){
	this.userName = userName;
}

@Override
public void setSession(Map<String,Object>session){
	this.session = session;
}

}


