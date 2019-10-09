package swing;
import javax.swing.*;
import java.awt.*;
public class Test3 extends JFrame {
private  Container capto;
ImageIcon icon;
private JLabel user_label,user_labe2,user_labe3,img_label;
private Font fbs;

Test3(){
    initialization();
}
public  void initialization(){

 capto = this.getContentPane();
 capto.setBackground(Color.GRAY);
 fbs = new Font("Arial",Font.BOLD,20);
 capto.setLayout(null);
    icon = new ImageIcon(getClass().getResource("AI.jpg"));
    img_label =new JLabel(icon);
    img_label.setBounds(750,0,700,450);
 capto.add(img_label);
 user_label = new JLabel();
 user_label.setText("Enter your University name : ");
 user_label.setBounds(0,0,750,150);
 user_label.setFont(fbs);
 user_label.setForeground(Color.GREEN);
 user_label.setOpaque(true);
 user_label.setBackground(Color.RED);
 user_label.setToolTipText("Ex. University of Dhaka");
 capto.add(user_label);

 user_labe2 = new JLabel();
 user_labe2.setText("Enter your Department name : ");
 user_labe2.setBounds(0,150,750,150);
 user_labe2.setFont(fbs);
 user_labe2.setForeground(Color.blue);
 user_labe2.setOpaque(true);
 user_labe2.setBackground(Color.CYAN);
 user_labe2.setToolTipText("Ex. Institute of Information Technology");
 capto.add(user_labe2);

 user_labe3 = new JLabel();
 user_labe3.setText("Enter your Course name : ");
 user_labe3.setBounds(0,300,750,150);
 user_labe3.setFont(fbs);
 user_labe3.setForeground(Color.cyan);
 user_labe3.setOpaque(true);
 user_labe3.setBackground(Color.magenta);
 user_labe3.setToolTipText("Ex. Artificial Intelligence");
 capto.add(user_labe3);
}
    public static void main(String[] args) {


        Container contain = new Container();


        Test3 frame = new  Test3();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1500,1300);
        frame.setTitle("my_soft word");



    }
}
