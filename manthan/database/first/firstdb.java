package manthan.database.first;
import java.sql.*;
import javax.sql.*;

public class firstdb {
	public static final String username="root";
	public static final  String password="root@123";
	public static final  String url = "jdbc:mysql://localhost:33/student";
	public static void getConnection() {
	  Connection cn;	
	try {
		//ste2 : load the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		/*step 3
		 * 1 : url/database
		 * 2  : username
		 * 3:password
		 */
		cn = DriverManager.getConnection(url,username,password);
		System.out.println(cn);
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}	
		
	}

}
