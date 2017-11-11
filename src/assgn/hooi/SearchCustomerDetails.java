/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn.hooi;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author pc
 */
public class SearchCustomerDetails extends JFrame{
    
    private JButton searchBtn = new JButton("Search");
    private JTextField phoneTxt = new JTextField();
    private JLabel space = new JLabel();
    private JLabel phoneLbl = new JLabel("Enter customer's phone number: ");
    private ProfileInterface p1;
    private ArrayList<ProfileInterface> userList = new ArrayList(); 
           
    public SearchCustomerDetails(){
        startUp();
        JPanel inputPanel = new JPanel(new GridLayout(1,2));
        JPanel btnPanel = new JPanel();
        
        inputPanel.add(phoneLbl);
        inputPanel.add(phoneTxt);
        SubmitListener submitL = new SubmitListener();
        searchBtn.addActionListener(submitL);
        btnPanel.add(searchBtn);
        
        add(inputPanel,BorderLayout.CENTER);
        add(btnPanel,BorderLayout.SOUTH);
        
        
        setSize(450, 100);
        setTitle("Search Customer Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void startUp(){
        p1 = new Profile("Tester 1","0111111111","pv16","tester1@gmail.com");
        userList.add(p1);
        p1 = new Profile("Tester 2","0222222222","pv15","tester2@gmail.com");
        userList.add(p1);
        p1 = new Profile("Tester 3","0333333333","pv14","tester3@gmail.com");
        userList.add(p1);
    }
    
    private class SubmitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
      
        JTextField test = new JTextField("Customer Details will display here");
        JTextArea detailsTA = new JTextArea(50, 200);
        String cusDetails = String.format("%-5s %-10s", "abcde","abcde12345");
        
        for(int a = 0; a<userList.size();a++){
            p1 = userList.get(a);
            if(p1.matchPhone(phoneTxt.getText()))    
                cusDetails += "\n"+" "+p1.getName()+" "+p1.getPhone()+" "+p1.getAddress()+" "+p1.getEmail()+" ";
            
        }
        
        detailsTA.setText(cusDetails);
        detailsTA.setEditable(false);
      
        JFrame detailsFrame = new JFrame();
        detailsFrame.add(detailsTA);
        detailsFrame.setSize(300, 300);
        detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        detailsFrame.setLocationRelativeTo(null);
        detailsFrame.setVisible(true);

        }
  }
    
    public static void main(String args[]){
       new SearchCustomerDetails();
    }
    
}
