package com.internousdev.template.dto;

public class BuyItemDTO {

	private int id;
	private String itemName;
	private String itemPrice;

	public String loginFlg;
	public String buyItemInfo;
	public String loginId;



	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}


	public String getLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(String loginFlg){
		this.loginFlg = loginFlg;
	}

	public String getBuyItemInfo() {
		return buyItemInfo;
	}

	public void setBuyItemInfo(String buyItemInfo){
		this.buyItemInfo = buyItemInfo;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}


}
