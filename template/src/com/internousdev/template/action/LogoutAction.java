package com.internousdev.template.action;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LogoutAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	public String execute() {
		session.clear();
		return SUCCESS;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
}


