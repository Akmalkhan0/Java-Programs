import java.util.*;
import java.io.*;
import java.sql.*;

public class DBConnection{
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String USER = "Scott";
	private static final String PASSWORD = "akmal";
	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
}