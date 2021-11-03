package electrictybilmangement;

import java.sql.SQLException;

public abstract class Person{
    
    private String FName;
    private String LName;
    private int Age;
    private String Adress;
    private String UserName;
    private String PassWord;
    private String Mail;
    public Person(){
        
    }
    public Person(String FName,String LName,int age,String Adress,String UserName,String PassWord,String Mail)
    {
        this.FName=FName;
        this.LName=LName;
        this.Age=age;
        this.Adress=Adress;
        this.UserName=UserName;
        this.PassWord=PassWord;
        this.Mail=Mail;
    }

    public abstract boolean login(String Username,String Password) throws SQLException ;
      

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public int getAge() {
        return Age;
    }

    public String getAdress() {
        return Adress;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public String getMail() {
        return Mail;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }
}