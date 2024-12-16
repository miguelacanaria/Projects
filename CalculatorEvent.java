

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class CalcuEvent extends JFrame implements ActionListener{
   
    private JTextField xInput, yInput;  
    private JLabel answer;  
     	
   public static void main(String[] args) {
      CalcuEvent calc = new CalcuEvent();
      calc.setLocation(100,100);
	  calc.setSize(300,200);
	  calc.setResizable(false);
      calc.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      calc.setVisible(true);
   }
   
   
   
 
      
     
      
      
      public CalcuEvent() {
         super("Calculator Events");
         setBackground(Color.GRAY);
         
         xInput = new JTextField("0", 10);
         yInput = new JTextField("0", 10);
       
         
         JPanel xPanel = new JPanel();
         xPanel.add( new JLabel(" First number = "));
         xPanel.add(xInput);
         
         JPanel yPanel = new JPanel();
         yPanel.add( new JLabel(" Second number = "));
         yPanel.add(yInput);
         
     
         JPanel buttonPanel = new JPanel();
         buttonPanel.setLayout(new GridLayout(1,5));
         
         JButton plus = new JButton("+");
         plus.addActionListener(this);
         buttonPanel.add(plus);
         
         JButton minus = new JButton("-");
         minus.addActionListener(this);
         buttonPanel.add(minus);
         
         JButton times = new JButton("*");
         times.addActionListener(this);
         buttonPanel.add(times);
         
         JButton divide = new JButton("/");
         divide.addActionListener(this);
         buttonPanel.add(divide);
         
         JButton modulus = new JButton("%");
         modulus.addActionListener(this);
         buttonPanel.add(modulus);
         
         
        
         
         answer = new JLabel("First number + second number = 0", JLabel.CENTER);
         answer.setForeground(Color.red);
         answer.setBackground(Color.white);
         answer.setOpaque(true);
         
 
         
         setLayout(new GridLayout(4,1,3,3));
         add(xPanel);
         add(yPanel);
         add(buttonPanel);
         add(answer);
         
         xInput.requestFocus();
         
      }  
      
      public void actionPerformed(ActionEvent evt) {
         
         double x, y;  
         try {
            String xStr = xInput.getText();
            x = Double.parseDouble(xStr);
         }
         catch (NumberFormatException e) {
           
            answer.setText("Illegal data for x.");
            xInput.requestFocus();
            return;
         }
         
       
         
         try {
            String yStr = yInput.getText();
            y = Double.parseDouble(yStr);
         }
         catch (NumberFormatException e) {
            answer.setText("Illegal data for y.");
            yInput.requestFocus();
            return;
         }
         
         
         String op = evt.getActionCommand();
         if (op.equals("+"))
            answer.setText( "First number + second number = " + (x+y) );
         else if (op.equals("-"))
            answer.setText( "First number - second number = " + (x-y) );
         else if (op.equals("*"))
            answer.setText( "First number * second number = " + (x*y) );
         else if (op.equals("/")) {
            if (y == 0)
               answer.setText("Can't divide by zero!");
            else
               answer.setText( "First number / second number = " + (x/y) );
         }
         
      } 
 
   

 }
