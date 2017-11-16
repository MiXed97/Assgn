/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn.JianKai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class MenuClass implements AddMenuInterface{
    
    private String foodname;
    private String resname;
    private String desc;
    private String price;
    private String tel;
    
    private String theerror="";
    
    String host = "jdbc:derby://localhost:1527/Affiliates";
    String name = "umi";
    String pw = "umi";
    
    public MenuClass(){}

    public MenuClass(String foodname, String resname, String desc, String price, String tel) {
        this.foodname = foodname;
        this.resname = resname;
        this.desc = desc;
        this.price = price;
        this.tel = tel;
    }

    @Override
    public boolean checkfn() {
        boolean result = true;
        char c[] = foodname.toCharArray();
        int namelength = c.length;
        for(int i=0;i<namelength;i++)
        {
            if (Character.isDigit(c[i])) {
                theerror += "Do not enter digit as food name \n";
                return false;
            }
        }
        
        if (foodname.isEmpty()) {
            theerror += "Please enter food name \n";
            return false;
            
        }
        return result;
        
    }

    @Override
    public boolean checkrn() {
        boolean result = true;
        if (resname.isEmpty()) {
            theerror += "Please enter your restaurent name \n";
            return false;
        }
        
        return result;
        
    }

    @Override
    public boolean checkdesc() {
        boolean result = true;
        if (desc.isEmpty()) {
            theerror += "Please enter your food description \n";
            return false;
        }
        
        return result;
        
    }

    @Override
    public boolean checkprice() {
        boolean result = true;
        if (price.isEmpty()) {
            theerror += "Please enter your food price \n";
            return false;
        }
        
        char f[] = price.toCharArray();
        int pricelength = f.length;
        for (int v = 0; v < pricelength; v++) {
            if (Character.isLetter(f[v])) {
                theerror += "Please enter only digit in price\n";
                return false;
            }
        }
        
        return result;
    }

    @Override
    public boolean checktel() {
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
    
    public String toString(){
        return theerror;
    }

    @Override
    public void storefood() {
        try
             {
                
                String query = "Insert into MENU values(?,?,?,?,?)";
                Connection con = DriverManager.getConnection(host,name,pw);
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1,foodname);
                ps.setString(2,resname);
                ps.setString(3,desc);
                ps.setString(4, price);
                ps.setString(5,tel);
                ps.execute();
                con.close();
                
            }
            catch(SQLException ex)
            {
                System.out.println(ex.getMessage());

            }
    }
    
}
