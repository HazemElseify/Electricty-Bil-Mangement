
package OldCustomer;
import AdminRole.operator;
import java.util.ArrayList;
import electrictybilmangement.Person;
import java.util.Scanner;
import java.sql.*;
import javax.xml.transform.Result;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import electrictybilmangement.Person;
import java.sql.SQLException;

public class OldCustomer extends Person{

    @Override
    public boolean login(String Username, String Password) throws SQLException {
	Connection c = null;
	Statement s = null;
	try {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         c =  DriverManager.getConnection("" +"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
	s = c.createStatement();
	} catch (Exception e) {e.printStackTrace();}
        String sql = "Select * from NewCsutomer where username=? and password= ?";
            PreparedStatement pst = null;
        try {
            pst = c.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(operator.class.getName()).log(Level.SEVERE, null, ex);
        }
            pst.setString(1,Username);
            pst.setString(2,Password);
            ResultSet rs = pst.executeQuery();
            return rs.next();       
    }

    public OldCustomer() {
    }

    public OldCustomer(String FName, String LName, int age, String Adress, String UserName, String PassWord, String Mail) {
        super(FName, LName, age, Adress, UserName, PassWord, Mail);
    }
    public  boolean Search(String metercode) throws SQLException 
   {
       Connection c = null;
	Statement s = null;
	try {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         c =  DriverManager.getConnection("" +"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
	s = c.createStatement();
	} catch (Exception e) {e.printStackTrace();}
        String sql = "Select * from NewCsutomer where metercode=?";
            PreparedStatement pst = null;
        try {
            pst = c.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(operator.class.getName()).log(Level.SEVERE, null, ex);
        }
            pst.setString(1,metercode);
            ResultSet rs = pst.executeQuery();
            return rs.next();       
   }
    public void Enter(String Reading ,String metercode )throws SQLException 
   {
   Connection c = null;
	Statement s = null;
	try {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         c =  DriverManager.getConnection("" +"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
	s = c.createStatement();
	} catch (Exception e) {e.printStackTrace();}
        String sql = "update  NewCsutomer set Reading=? where metercode=?";
            PreparedStatement pst = null;
        try {
            pst = c.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(operator.class.getName()).log(Level.SEVERE, null, ex);
        }
         pst.setString(1,Reading);
         pst.setString(2,metercode);
         pst.executeUpdate();           
   }
}
