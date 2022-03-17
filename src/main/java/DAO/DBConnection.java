package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.*;

public class DBConnection {
	private static String connectionString = "";
	private static String userName = "postgres";
	private static String password = "";
	
	private static Connection conn = null;
	private final static Logger log = LogManager.getLogger(DBConnection.class);
	private static String localConnectionString = "jdbc:postgresql://localhost:5432/Project1";
	private static String ec2ConnectionString = "jdbc:postgresql://ip-172-31-13-88.us-east-2.compute.internal:5432/Project2";
	
	private static String localPassword = "1234";
	private static String ec2Password = "mysecretpassword";
	static {
		
		// switch from local to ec2 when done local testing
		connectionString = ec2ConnectionString;
		password = ec2Password;
		try {
			Class.forName("org.postgresql.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			log.info("Estabilishing DB connection");
			conn = DriverManager.getConnection(connectionString,userName,password);
		} catch (SQLException e) {
			// temporary remove backup connection
			//
	/*		try
			{
				// Dimitri, place your DB password and connection string here so the backend will also work for on your side
				password = "Samara-13";
				connectionString = "jdbc:postgresql://localhost:5432/reimbursement_project";
				conn = DriverManager.getConnection(connectionString,userName,password);
			}
			catch(SQLException e2)
			{ */
				log.error("Connection Failed " + e.getMessage());
				e.printStackTrace();
		//	}
		}
	}
	
	public static Connection getConnection()
	{
		try {
			if(conn == null || conn.isClosed() == true)
			{
				log.info("ReEstabilishing DB connection");
				conn = DriverManager.getConnection(connectionString,userName,password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error("Connection Failed " + e.getMessage());
		}
		return conn;
	}
	public static void closeConnection()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
