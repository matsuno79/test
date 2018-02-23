package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite3.util.DBConnector;
import com.internousdev.ecsite3.util.DateUtil;

public class BuyItemCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();

	private String sql = "INNSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date) VALUES(?,?,?,?,?,?)";

	public void buyItemInfo(int item_transaction_id,String user_master_id,String total_price,int total_count,String pay,int item_stock)throws SQLException {

		try{
			PreparedStatement premaredStatement = connection.prepareStatement(sql);

			premaredStatement.setInt(1,item_transaction_id);
			premaredStatement.setString(2,total_price);
			premaredStatement.setInt(3,total_count);
			premaredStatement.setString(4,user_master_id);
			premaredStatement.setString(5,pay);
			premaredStatement.setString(6,dateUtil.getDate());

			int checkCount = preparedStatement.executeUpdate();
			if(checkCount>0){
				String sql2="UPDATE item_info_transaction SET item_stock = ? WHERE id=?";


				PreparedStatement ps =connection.prepareStatement(sql2);
				ps.setInt(1,item_stock);
				ps.setInt(2,item_transaction_id);
				ps.executeUpdate();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		finally{
			connection.close();
		}

	}
}
