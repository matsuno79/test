package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite3.dto.BuyItemDTO;
import com.internousdev.ecsite3.util.DBConnector;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection =dbConnector.getConnection();
	private List<BuyItemDTO> buyItemDTOList=new ArrayList<BuyItemDTO>();


	public List<BuyItemDTO> getbuyItemInfo() {
		String sql ="SELECT id, item_name, item_price, item_stock FROM item_info_transaction";


		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				BuyItemDTO dto=new BuyItemDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_stock"));
				buyItemDTOList.add(dto);
			}

		} catch(Exception e){
			e.printStackTrace();
		}

		return buyItemDTOList;
	}

	public List<BuyItemDTO> getBuyItemDTO(){
		return buyItemDTOList;
	}
}
