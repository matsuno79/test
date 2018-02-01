package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import com.internousdev.ecsite.dao.MyPageDAO;
import com.internousdev.ecsite.dto.MyPageDTO;

public class MyPageAction extends ActionSupport implements SessionAware {

	public Map<String,Object>session;
	public MyPageDAO myPageDAO = new MyPageDAO();

	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();

	//public MyPageDTO myPageDTO = new MyPageDTO();
	public String deleteFlg;
	private String message;

	public String execute() throws SQLException {

		//商品を削除しない場合
		if(!session.containsKey("id")){
			return ERROR;
		}

		if(deleteFlg == null){
			String item_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();

			myPageList = myPageDAO.getMyPageUserInfo(item_transaction_id,user_master_id);

			session.put("buyItem_name",myPageDTO.getItemName());
			session.put("total_price",myPageDTO.getTotalPrice());
			session.put("total_count",myPageDTO.getTotalCount());
			session.put("total_payment",myPageDTO.getPayment());
			session.put("massage","");

			//商品を削除する場合
		}else if(deleteFlg.equals("1")) {
			delete();
		}
		result = SUCCESS;
		return result;
	}

	public void delete() throws SQLException {
		String item_transaction_id = session.get("id").toString();
		String user_master_id = session.get("login_user_id").toString();

		int res = myPageDAO.buyItemHistoryDelete(item_transaction_id,user_master_id);

		if(res > 0) {
			session.put("message","商品情報を正しく削除しました");
		}else if(res == 0) {
			session.put("message","商品情報の削除に失敗しました");
		}
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	@Override
	public void setSession(Map<String,Object>loginSessionMap){
		this.session = loginSessionMap;
	}
}
