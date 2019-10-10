package swing;
import javax.swing.*;
import java.awt.*;
public class TextFieldDemo extends JFrame {
    private Container conver;
    private JTextField j_field1,j_field2;
    private JLabel user_label,user_labe2,user_labe3,img_label;
    private Font fbs;
    TextFieldDemo(){
        initialization();
    }
    public void initialization(){
        conver = this.getContentPane();
        fbs = new Font("Arial",Font.BOLD,20);
        conver.setLayout(null);
        conver.setBackground(Color.blue);
        user_label = new JLabel();
        user_label.setText("Enter your Department name : ");
        user_label.setBounds(0,0,750,100);
        user_label.setFont(fbs);
        user_label.setForeground(Color.GREEN);
        user_label.setOpaque(true);
        user_label.setBackground(Color.RED);
        conver.add(user_label);
        j_field1 = new JTextField();
        j_field1.setBounds(750,0,250,100);
        j_field1.setFont(fbs);
        j_field1.setForeground(Color.RED);
        j_field1.setOpaque(true);
        j_field1.setBackground(Color.GRAY);
        conver.add(j_field1);

        user_labe2 = new JLabel();
        user_labe2.setText("Enter your Course name : ");
        user_labe2.setBounds(0,150,750,100);
        user_labe2.setFont(fbs);
        user_labe2.setForeground(Color.blue);
        user_labe2.setOpaque(true);
        user_labe2.setBackground(Color.CYAN);
        user_labe2.setToolTipText("Ex. Institute of Information Technology");
        conver.add(user_labe2);

        j_field2 = new JTextField();
        j_field2.setBounds(750,150,250,100);
        j_field2.setFont(fbs);
        j_field2.setForeground(Color.orange);
        j_field2.setOpaque(true);
        j_field2.setBackground(Color.RED);
        conver.add(j_field2);

    }
    public static void main(String[] args) {
        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1500,1300);

    }
}
