package com.internousdev.template.dto;

public class MyPageDTO {

	private String itemName;
	private String totalPrice;
	private String totalCount;
	private String payment;

	public String userName;
	public String id;
	public String insert_date;

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String Payment) {
		this.payment = Payment;
	}



	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String UserName) {
		this.userName = UserName;
	}


	public String getId() {
		return this.id;
	}

	public void setId(String Id) {
		this.id = Id;
	}



	public String getInsert_date() {
		return this.insert_date;
	}

	public void setInsert_date(String Insert_date) {
		this.insert_date = Insert_date;
	}




}