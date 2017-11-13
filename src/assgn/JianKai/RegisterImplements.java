package assgn.JianKai;

import java.util.regex.Pattern;

public class RegisterImplements implements RegisterInterface{
    
    private String name;
    private String resname;
    private String IC;
    private String tel;
    private String email;
    private String thetel;
    private String theerror="";
    
    public void setall(String name,String resname,String IC,String tel,String email)
    {
        this.name = name;
        this.resname = resname;
        this.IC = IC;
        this.tel = tel;
        this.email = email;
    }
    
    @Override
    public boolean checkName(String name) {
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
    public boolean checkResName(String resname) {
        boolean result = true;
        if (resname.isEmpty()) {
            theerror += "Please enter your restaurent name \n";
            return false;
        }
        
        return result;
    }

    @Override
    public boolean checkIC(String IC) {
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
    public boolean checkTel(String tel) {
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
    public boolean checkEmail(String email) {
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
    
}
