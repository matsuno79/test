package com.internousdev.ecsite3.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite3.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterConfirmAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private ArrayList<BuyItemDTO> buyItemDTOList=new ArrayList<>();

	@SuppressWarnings("unchecked")
	public String execute() throws SQLException{
		List<BuyItemDTO> list=(ArrayList<BuyItemDTO>) session.get("list");

		for(int i=0; i<list.size(); i++){

		}
	}

}
