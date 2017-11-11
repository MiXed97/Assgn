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
        
        a.add(new student("Nicholas","123"));
        a.add(new student("Soon Jian Kai","321"));
        a.add(new student("Ng Poh Hooi","456"));
        a.add(new student("Ong Kai Zhi","193"));
        
        
        for(int i = 0; i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
        
        
    }
    
}
