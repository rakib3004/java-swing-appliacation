import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;



public class Hackerrank {
    public static void main(String[] args) {
       ImageIcon icon = new ImageIcon("C:\\Users\\Rakib\\Desktop\\AppData\\Background\\AI.jpg");
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Rakib\\Desktop\\AppData\\Background\\techno stream.jpg");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Rakib\\Desktop\\AppData\\Background\\electronics.jpg");
        ImageIcon icon3 = new ImageIcon("C:\\Users\\Rakib\\Desktop\\AppData\\Background\\AI tech.jpg");
        String user_name,user_college,user_university,user_institution,user_dept,user_batch,user_course_1,user_course_2,user_course_3;
      user_name = JOptionPane.showInputDialog("Enter Your Name :",icon);

        user_name ="Mr. "+user_name;
        user_college = JOptionPane.showInputDialog("Enter Your College Name ");
        JOptionPane.showMessageDialog(null,"Your college name is "+user_college,"college",-1, icon);

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

        JOptionPane.showMessageDialog(null, "Hello," +user_name + message_1,"Introduction", 1,icon3);
        JOptionPane.showMessageDialog(null, "Hi !!! "+user_name+user_college+user_university+user_dept+user_institution,"Description",1,icon1);
        JOptionPane.showMessageDialog(null, user_batch,"Proposal",1,icon);
        JOptionPane.showMessageDialog(null, "Great idea","Execution",1,icon2);



    }

}
