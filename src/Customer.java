import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {
	private final String url = "jdbc:postgresql://localhost/testdb";
	private final String user = "postgres";
	private final String password = "postgres";
	
	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.createTable();
		cust.registerCustomerInfo("Brandon", "01046367387", "Male", "33", "Test");
	}
	
	/**
	 * Connect to PostgreSQL server
	 * @author ijzone
	 * @return Connection conn
	 */
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to PostgreSQL server successfully");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		return conn;
	}
	
	/**
	 * Create Table
	 * @author ijzone
	 */
	public void createTable() {
		Connection conn = this.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String createTableSql = "CREATE TABLE IF NOT EXISTS "
						   + "CUSTOMER("
						   			+ "ID BIGSERIAL NOT NULL PRIMARY KEY, NAME VARCHAR(50), PHONE VARCHAR(20), GENDER VARCHAR(10), AGE INT, NOTE VARCHAR(255)"
						   + ");";
		try {
			System.out.println(createTableSql);
			pstmt = conn.prepareStatement(createTableSql);
//			pstmt.setString(1, "user_id");
//			pstmt.setString(2, "user_name");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				System.out.println(rs.getString("user_id") + " / " + rs.getString("user_name"));
				System.out.println("Success!");
			}
			
		}catch (SQLException e) {
//			e.printStackTrace();
			e.getMessage();
		}finally {
			System.out.println("Table has been created successfully!");
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(rs != null) {
					rs.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void registerCustomerInfo(String name, String phone, String gender, String age, String note) {
		Connection conn = this.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		
		try {
			sb.append("INSERT INTO CUSTOMER");
			sb.append("(name, phone, gender, age, note) ");
			sb.append("VALUES");
			sb.append("('" + name + "', '" + phone + "', '" + gender + "', " + age + ", '" + note + "');");
			pstmt = conn.prepareStatement(sb.toString());
			int insertCnt = pstmt.executeUpdate();
			System.out.println("### " + insertCnt);
//			pstmt.setString(1, name);
		} catch (Exception e) {
			e.getMessage();
		} finally {
			System.out.println("Customer's information is registered!");
			try {
				pstmt.close();
				rs.close();
				conn.close();
			}catch (Exception e) {
				e.getMessage();
			}
		}
	}
}
