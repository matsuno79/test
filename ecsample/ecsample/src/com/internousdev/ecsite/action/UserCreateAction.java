package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateAction extends ActionSupport {


	public String execute() {
		return SUCCESS;
	}
}
