package com.internousdev.template.util;
import java.text.SimpleDateFormat;

public class DateUtil {
	public String getDate(){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/ddHH:mm:ss");
		return simpleDateFormat.format(date);
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