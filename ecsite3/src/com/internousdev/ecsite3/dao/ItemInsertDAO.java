package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite3.dto.ItemInsertDTO;
import com.internousdev.ecsite3.util.DBConnector;
import com.internousdev.ecsite3.util.DateUtil;

public class ItemInsertDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private ItemInsertDTO itemInsertDTO = new itemInsertDTO();
	private DateUtil dateUtil=new DateUtil();

	private String sql="INSERT INTO item_info_transaction (item_name,item_price,item_stock,insert_date)VALUES(?,?,?,?)";

	public ItemInsertDTO itemInsertInfo(String itemName,String itemPrice,String itemStock)throws SQLException{

		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,itemName);
			ps.setString(2,itemPrice);
			ps.setString(3,itemStock);
			ps.setString(4,dateUtil.getDate());

			ps.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			connection.close();

		}
		return itemInsertDTO;
	}

}
