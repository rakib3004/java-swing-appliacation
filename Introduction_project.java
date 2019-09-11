import java.util.Scanner;
import javax.swing.JOptionPane;


public class Java_pro {
    public static void main(String[] args) {
       ;        
        String user_name,user_college,user_university,user_institution,user_dept,user_batch,user_course_1,user_course_2,user_course_3; 
             user_name = JOptionPane.showInputDialog("Enter Your Name :");
             
             user_name ="Mr. "+user_name;
             
             user_college = JOptionPane.showInputDialog("Enter Your College Name ");
             user_college = "\nYou have passed your H.S.C. examination from "+user_college+".";
             
  user_university=JOptionPane.showInputDialog("Enter Your University Name :");
  user_university ="\nNow you are admitted into "+ user_university+".\n";
  
  
  
  user_dept =JOptionPane.showInputDialog("Enter Your Department Name:");
  user_dept ="Department of : "+user_dept+",";
  
  
  user_institution=JOptionPane.showInputDialog("Enter Your Institute Name:");
  
     user_batch=JOptionPane.showInputDialog("Enter Your Batch No :");
     user_batch="You are the "+user_batch+" batch at "+user_institution+".\n\"Last Binary batch of the century.\"\n";
     
     
 user_course_1=JOptionPane.showInputDialog("Enter Course No-1 :");
 
  user_course_2=JOptionPane.showInputDialog("Enter Course No-2 :");
  
     user_course_3=JOptionPane.showInputDialog("Enter Course No-3 :");
     
  String  courses = "Your courses are : "+ "\n1."+ user_course_1 +"\n2."+  user_course_2 + "\n3."+ user_course_3 ;
  
     
     
             
     String message_1 ="\nWelcome to :\nt@r@fder !nformatics Ltd.";  
     
        JOptionPane.showMessageDialog(null, "Hello," +user_name + message_1,"Introduction",1);
 JOptionPane.showMessageDialog(null, "Hi !!! "+user_name+user_college+user_university+user_dept+user_institution,"Description",1); 
 JOptionPane.showMessageDialog(null, user_batch,"Proposal",1);
  JOptionPane.showMessageDialog(null, courses,"Execution",1);
  
    }
    
}
