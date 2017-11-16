package assgn.JianKai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class aff implements RegisterInterface{
    
    private String name;
    private String resname;
    private String IC;
    private String tel;
    private String email;
    private String theerror="";
    String host = "jdbc:derby://localhost:1527/Affiliates";
    String name1 = "umi";
    String pw = "umi";
    
    public aff(){}
    
public aff(String name,String resname,String IC,String tel,String email)
    {
        this.name = name;
        this.resname = resname;
        this.IC = IC;
        this.tel = tel;
        this.email = email;
    }
    
    @Override
    public boolean checkName() {
        boolean result = true;
        
        char c[] = name.toCharArray();
        int namelength = c.length;
        for(int i=0;i<namelength;i++)
        {
            if (Character.isDigit(c[i])) {
                theerror += "Do not enter digit in your name \n";
                return false;
            }
        }
        
        if (name.isEmpty()) {
            theerror += "Please enter your name \n";
            return false;
            
        }
        return result;
        
    }
    
    

    @Override
    public boolean checkResName() {
        boolean result = true;
        if (resname.isEmpty()) {
            theerror += "Please enter your restaurent name \n";
            return false;
        }
        
        return result;
    }

    @Override
    public boolean checkIC() {
        boolean result = true;
        char d[] = IC.toCharArray();
        int iclength = d.length;
        if (iclength != 12) {
            theerror += "IC length error \n";
            return false;
        }
        
        for (int o = 0; o < iclength; o++) {
            if (!Character.isDigit(d[o])) {
                theerror += "Please enter digit only for IC number\n";
                return false;
            }
        }
        
        if (IC.isEmpty()) {
            theerror += "Please enter your IC \n";
            return false;
        }
        
        if (iclength != 12) {
            theerror += "Error IC length\n";
            return false;
        }
        
        return result;
    }

    @Override
    public boolean checkTel() {
        boolean result = true;
        if (tel.isEmpty()) {
            theerror += "Please enter your telephone number \n";
            return false;
        }
        
        char e[] = tel.toCharArray();
        int tellength = e.length;
        for (int p = 0; p < tellength; p++) {
            if (!Character.isDigit(e[p])) {
                theerror += "Please enter digit for telephone number only \n";
                return false;
            }
        }
        
        if (tellength != 10 || tellength != 10) {
            theerror += "Error telephone length\n";
            return false;
        }
        return result;
    }

    @Override
    public boolean checkEmail(){
        boolean result = true;
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email))) 
        {
            theerror += "Please enter valid email \n";
            return false;
        }
        
        if (email.isEmpty()) {
            theerror += "Please enter email \n";
            return false;
        }
        return result;
    }
    
    public String toString(){
        return theerror;
    }

    @Override
    public void store() {
        
        String query = "Insert into AFTABLE values(?,?,?,?,?)";
        try {
            Connection con = DriverManager.getConnection(host,name1,pw);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,resname);
            ps.setString(3,IC);
            ps.setString(4,tel);
            ps.setString(5,email);
            ps.execute();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
