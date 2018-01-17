/**
 *
 */
package snippet;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;


/**
 * @author internousdev
 *MySQLに接続するためのユーティリティクラス
 *ルートアカウントでDBに接続される↓
 */
public class DBConnector {

	//JDBC　Driver名
	private static String driverName = "com.mysql.jdbc.Driver";

	//データベース接続URL
	private static String url =
			"jdbc:mysql://localhost/testdb?autoReconnect = true&useSSL = false";

	//DB接続ユーザー
	private static String user = "root";

	//DB接続PW
	private static String password = "mysql";




	public Connection getConnection() {
		Connection con = null;

		try{
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url,user,password);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();

		}

		return con;

	}

}
