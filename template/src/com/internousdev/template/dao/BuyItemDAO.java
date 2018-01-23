package com.internousdev.template.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.template.action.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private BuyItemDTO getNuyItemInfo() {
		String sql = "SELLECT id, item_name, item_price FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(result.next()) {
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return buyItemDTO;
	}
	public BuyItemDTO getBuyItemDTO() {
		return buyItemDTO;
	}

}