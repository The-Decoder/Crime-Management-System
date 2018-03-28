import java.sql.Driver;
import java.util.Properties;

public class Connection {
	
	public Connection conn() throws Exception                  
	{
		Connection con=null;                             // con = Connection class reference
		Driver d=(Driver)(Class.forName("oracle.jdbc.OracleDriver").newInstance());                //   using driver class reference d
		Properties pro=new Properties();                                              // Properties class reference pro
		pro.put("user","system");                                                     // assign variable user and its value 
		pro.put("password","admin");                                                  // password and its value
		con=(Connection) d.connect("jdbc:oracle:thin:@127.0.0.1:1521:xe",pro);                     // establishing the connection between database & java
		return con;                                                               // return true if connection established
	}

}
