package AdminRole;
import java.util.ArrayList;
import electrictybilmangement.Person;
import java.util.Scanner;
import java.sql.*;
import javax.xml.transform.Result;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;

/**
 *
 * @author hazem
 */
public class operator extends Person{

    public operator() {}

    public operator(String FName, String LName, int age, String Adress, String UserName, String PassWord, String Mail) {
        super(FName, LName, age, Adress, UserName, PassWord, Mail);
    }
    
    @Override
    public boolean login(String Username, String Password) throws SQLException {
	Connection c = null;
	Statement s = null;
	try {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         c =  DriverManager.getConnection("" +"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
	s = c.createStatement();
	} catch (Exception e) {e.printStackTrace();}
        String sql = "Select * from operatorLogin where UserName=? and Password = ?";
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
   public void Add(String cost,String metercode )throws SQLException 
   {
   Connection c = null;
	Statement s = null;
	try {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         c =  DriverManager.getConnection("" +"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
	s = c.createStatement();
	} catch (Exception e) {e.printStackTrace();}
        String sql = "update  NewCsutomer set cost=? where metercode=?";
            PreparedStatement pst = null;
        try {
            pst = c.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(operator.class.getName()).log(Level.SEVERE, null, ex);
        }
         pst.setString(1,cost);
         pst.setString(2,metercode);
         pst.executeUpdate();
             
              
   }

//public  boolean MakeSure(String Fname,String Lname,String metercode,String cost,String Reading,String Address,String Age,String Region ) throws SQLException 
//   {
//              Connection c = null;
//	Statement s = null;
//	try {
//	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//         c =  DriverManager.getConnection("" +"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
//	s = c.createStatement();
//	} catch (Exception e) {e.printStackTrace();}
//        String sql = "Select * from NewCsutomer where Fname=? and Lname=? and metercode=? and cost=? and addresses=? and age=? and cost=? and Region=?";
//            PreparedStatement pst = null;
//        try {
//            pst = c.prepareStatement(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(operator.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        pst.setString(1,Fname);
//        pst.setString(2,Lname);
//        pst.setString(3,metercode);
//        pst.setString(4,cost);
//       pst.setString(5,Reading);
//       pst.setString(3,Address);
//        pst.setString(4,Age);
//       pst.setString(5,Region);
//        ResultSet rs = pst.executeQuery();
//            return rs.next();     
//   }
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
 public  int delete(String metercode) throws SQLException 
   {
       Connection c = null;
	Statement s = null;
	try {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         c =  DriverManager.getConnection("" +"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
	s = c.createStatement();
	} catch (Exception e) {e.printStackTrace();}
        String sql = "DELETE FROM NewCsutomer where metercode=?";
            PreparedStatement pst = null;
        try {
            pst = c.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(operator.class.getName()).log(Level.SEVERE, null, ex);
        }
            pst.setString(1,metercode);
                 
            return  pst.executeUpdate();  
           
   }
 public  boolean Validate(String Metercode ,String Reading) throws SQLException 
   {
       Connection c = null;
	Statement s = null;
	try {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         c =  DriverManager.getConnection("" +"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
	s = c.createStatement();
	} catch (Exception e) {e.printStackTrace();}
        String sql = "Select * from NewCsutomer where metercode=? and Reading=?";
            PreparedStatement pst = null;
        try {
            pst = c.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(operator.class.getName()).log(Level.SEVERE, null, ex);
        }
            pst.setString(1,Reading);
            pst.setString(2,Metercode);
            ResultSet rs = pst.executeQuery();
            return rs.next();       
   }
 
public ArrayList<String> retriveCustomerdata(String metercode){
        ArrayList<String>v=new ArrayList<>();
        Connection connect = null;
		Statement s = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connect =  DriverManager.getConnection("" +
			"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
			s = connect.createStatement();
			String sql = "SELECT * FROM  NewCsutomer WHERE metercode =? ";
                        PreparedStatement prepared = connect.prepareStatement(sql);
                        prepared.setString(1, metercode);
                        ResultSet rec = prepared.executeQuery();
			while((rec!=null) && (rec.next()))
            {
                v.add(rec.getString("metercode"));
                v.add(rec.getString("Fname"));
                v.add(rec.getString("Lname"));
                v.add(rec.getString("cost"));
                 v.add(rec.getString("Reading"));
                v.add(rec.getString("addresses"));
                v.add(rec.getString("age"));
                v.add(rec.getString("region"));
                 

            }
             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      return v;
    }
 
 public double DefineTriff(double reading) throws SQLException
 {
 final int KWprice=2;
 double triff;
 if(reading>100&&reading<200){
     triff=0.1;
 }
 else if(reading>=200&&reading<300){
     triff=0.2;
 }
 else if(reading>=300&&reading<400){
     triff=0.3;
 }
 else if (reading>=400&&reading<500){
     triff=0.4;
 }
 else{
     triff=0.5;
 }
 reading=reading*triff*KWprice+reading*KWprice;
     return reading;
 }
 public void addDate(String metercode,java.sql.Date date) throws SQLException{
     
          {
   Connection c = null;
	Statement s = null;
	try {
	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         c =  DriverManager.getConnection("" +"jdbc:sqlserver://localhost:1433;databaseName=ELECDB1;user=Project;password=1234");
	s = c.createStatement();
	} catch (Exception e) {e.printStackTrace();}
        String sql = "update  NewCsutomer set lastPay=? where metercode=?";
            PreparedStatement pst = null;
        try {
            pst = c.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(operator.class.getName()).log(Level.SEVERE, null, ex);
        }
         pst.setDate(1,date);
         pst.setString(2,metercode);
         pst.executeUpdate();           
          }}
}