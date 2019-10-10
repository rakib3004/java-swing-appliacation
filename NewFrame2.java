package swing;

import javax.swing.*;
import java.awt.*;

public class NewFrame2 extends JFrame {
    private Container descrip1;
    private ImageIcon img1;
    private  JLabel user_labe5;
    private  JLabel user_labe6,user_labe7,user_labe8;
    private Font formula_two,formula_three;
    NewFrame2(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(0,0,1500,1300);
        this.setTitle("Another Profile");
        interface1();
    }
    public  void  interface1(){
        descrip1 = this.getContentPane();
        formula_two = new Font("Approach",Font.BOLD,32);
        formula_three = new Font("Text",Font.BOLD,22);

        descrip1.setLayout(null);
        descrip1.setBounds(0,0,1500,1300);
        descrip1.setBackground(Color.blue);

        img1 = new ImageIcon(getClass().getResource("AI.jpg"));
        user_labe5 = new JLabel(img1);
        user_labe5.setBounds(300,0,600,400);
        descrip1.add(user_labe5);

        user_labe6 = new JLabel();
        user_labe6.setText("       Artificial Intelligence");
        user_labe6.setBounds(300,400,600,100);
        user_labe6.setFont(formula_two);
        user_labe6.setForeground(Color.red);
        user_labe6.setOpaque(true);
        user_labe6.setBackground(Color.green);
        descrip1.add(user_labe6);
        user_labe7 = new JLabel();
        user_labe7.setText("The simulation of human intelligence processes by machines, especially computer systems. These processes include learning , reasoning and self-correction.");
        user_labe7.setBounds(0,500,1500,200);
        user_labe7.setFont(formula_three);
        user_labe7.setForeground(Color.black);
        user_labe7.setOpaque(true);
        user_labe7.setBackground(Color.cyan);
        descrip1.add(user_labe7);
    }

    public static void main(String[] args) {

        NewFrame2 frame2 = new NewFrame2();
        frame2.setVisible(true);


    }
}
