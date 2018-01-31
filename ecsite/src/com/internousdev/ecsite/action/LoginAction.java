package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	public String loginPassword;
	public Map<String,Object>session;

	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	public String execute() {
		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser",loginDto);

		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result = SUCCESS;
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

			session.put("login_user_id",loginDTO.getLoginId());
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_price",buyItemDTO.getItemPrice());

			return result;
		}
		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public String setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}


	public String getLoginPassword(){
		return loginPassword;
	}

	public String setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

}

