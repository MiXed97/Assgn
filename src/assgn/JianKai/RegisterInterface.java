package assgn.JianKai;


public interface RegisterInterface {
    
    public void setall(String name,String resname,String IC,String tel,String email);
    public boolean checkName(String name);
    public boolean checkResName(String resname);
    public boolean checkIC(String IC);
    public boolean checkTel(String tel);
    public boolean checkEmail(String email);
    
}
