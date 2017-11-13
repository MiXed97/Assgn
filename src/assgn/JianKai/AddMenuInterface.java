/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn.JianKai;

/**
 *
 * @author USER
 */
public interface AddMenuInterface {
    public void setall(String foodname,String resname, String desc, String price, String tel);
    public boolean checkfn(String foodname);
    public boolean checkrn(String resname);
    public boolean checkdesc(String desc);
    public boolean checkprice(String price);
    public boolean checktel(String tel);
}
