package com.internousdev.ecsite3.action;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdev.ecsite3.dao.BuyItemDAO;
import com.internousdev.ecsite3.dao.LoginDAO;
import com.internousdev.ecsite3.dto.BuyItemDTO;
import com.internousdev.ecsite3.dto.LoginDTO;


public class LoginAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	public Map<String,Object>session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();

	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	private List<BuyItemDTO> buyItemDTOList;

	public String execute() {
		String result = ERROR;

		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);

		session.put("loginUser",loginDTO);




		if(((LoginDTO)session.get("loginUser")).getLoginMaster()){

			buyItemDTOList = buyItemDAO.getBuyItemInfo();
			session.put("buyItemDTOList",buyItemDTOList);
			session.put("masterId",loginUserId);

			return result;
		}


		if(result != "master"){
			if(((LoginDTO) session.get("loginUser")).getloginFlg()){
				result = SUCCESS;

				buyItemDTOList=buyItemDAO.getBuyItemInfo();

				session.put("buyItemDTOList",buyItemDTOList);
				session.put("id",buyItemDTO.getId());
				session.put("login_user_id",loginDTO.getLoginId());
				session.put("userName",LoginDTO.getUserName());
				session.put("userAddress",loginDTO.getUserAddress());
			}

		}

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

	public List<buyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList=buyItemDTOList;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}

}


