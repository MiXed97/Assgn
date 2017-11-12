/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

/**
 *
 * @author Mixed_97
 */
public class Assgn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayListInterface<student>  a= new ArrList<>();
        student s = new student("Nicholas","123");
        student s1 = new student("Soon Jian Kai","321");
        student s2 = new student("Ng Poh Hooi","456");
        student s3 = new student("Ong Kai Zhi","193");
        a.add(s);
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.remove(s1);
        
        
        for(int i = 0; i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
        
        
    }
    
}
