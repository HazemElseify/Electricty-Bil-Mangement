package AdminRole;
import electrictybilmangement.Person;
import java.util.Scanner;
import java.sql.*;
import javax.xml.transform.Result;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
public class Admin extends Person{
    public Admin (){
       super();
}
    @Override
    public boolean login(String Username, String Password) throws SQLException {
        Connection connect = null;
	Statement s = null;
	try {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         connect =  DriverManager.getConnection("" +"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
	s = connect.createStatement();
	} catch (Exception e) {
			e.printStackTrace();
		}
        String sql = "Select * from admin where username=? and password = ?";
            PreparedStatement pst = null;
        try {
            pst = connect.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
            pst.setString(1,Username);
            pst.setString(2,Password);
            ResultSet rs = pst.executeQuery();
            return rs.next();
       
    }
    
}