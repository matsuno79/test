/**
 *
 */
package snippet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author internousdev
 *
 */
public class TestUserDAO {

	String name = "";
	String password = "";

	public void selectALL() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "selectALL";


		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,name);

			int i = ps.executeUpdate();

			if(i>0){

				System.out.println(i+"件更新されました");
			}


		}
		catch (SQLException e){
			e.printStackTrace();

		}

		try{
			con.close();
		}
		catch (SQLException e){
			e.printStackTrace();
		}

		}}



