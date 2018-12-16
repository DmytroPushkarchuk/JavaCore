package app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	private static Connection conn = null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {

		String URL = "jdbc:mysql://127.0.0.1:3306/";
		String db = "java";
		String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String login = "root";
		String password = "1973";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			conn = (Connection) DriverManager.getConnection(URL + db + timezone, login, password);
			if (conn != null) {
				System.out.println("-----Успішне підключення-----");
			}
		} catch (Exception e) {
			System.out.println("-----Помилка під час підключення!-----");
			return;
		}
		
		Statement statement = conn.createStatement();
		
		statement.executeUpdate("SELECT * FROM shops;");
//		statement.executeUpdate("INSERT INTO book.shops (name,city) value ('media','wroclaw')");
//		statement.executeUpdate("DROP TABLE book");
//		statement.executeUpdate("CREATE TABLE  book (id INT NOT NULL AUTO_INCREMENT,name VARCHAR(45) NOT NULL, PRIMARY KEY (id))");
		
		}

	}

	
