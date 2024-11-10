package auth;
import java.sql.*;
import auth.Dbconn;

public class authDao {
	public void store(AuthPojo e) {
		Connection c = null;
		PreparedStatement ps = null;
		try {
			c = Dbconn.conn();
			System.out.println(c);
			System.out.println("im hereeee");
			ps = c.prepareStatement("INSERT INTO main values(?,?)");
			System.out.println(e);
			ps.setString(1, e.getName());
			ps.setString(3, e.getPassword());
			ps.executeUpdate();
			
			System.out.println("Success");
		}catch(SQLException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("finished");
		}		
	}
}
