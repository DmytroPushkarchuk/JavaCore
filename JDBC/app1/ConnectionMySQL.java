package app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {

	static Connection conn = null;

	public static void connectionMySQL() throws ClassNotFoundException, SQLException {

		String URL = "jdbc:mysql://127.0.0.1:3306/";
		String db = "db";
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
		}

	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("asd");
		conn.close();

	}
}
