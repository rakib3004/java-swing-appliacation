package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class TextFieldDemo extends JFrame {
    private Container conver;
    private JTextField j_field1,j_field2;
    private JLabel user_label,user_labe2,user_labe3,img_label;
    private Font fbs;
    TextFieldDemo(){
        initialization();
    }
    public void initialization() {
        conver = this.getContentPane();
        fbs = new Font("Arial", Font.BOLD, 20);
        conver.setLayout(null);
        conver.setBackground(Color.blue);
        user_label = new JLabel();
        user_label.setText("Enter your Department name : ");
        user_label.setBounds(0, 0, 750, 100);
        user_label.setFont(fbs);
        user_label.setForeground(Color.GREEN);
        user_label.setOpaque(true);
        user_label.setBackground(Color.RED);
        user_label.setToolTipText("Ex. Computer Science & Engineering");
        conver.add(user_label);
        j_field1 = new JTextField();
        j_field1.setBounds(750, 0, 250, 100);
        j_field1.setFont(fbs);
        j_field1.setForeground(Color.BLACK);
        j_field1.setOpaque(true);
        j_field1.setBackground(Color.GREEN);
        conver.add(j_field1);



        user_labe2 = new JLabel();
        user_labe2.setText("Enter your Course name : ");
        user_labe2.setBounds(0, 150, 750, 100);
        user_labe2.setFont(fbs);
        user_labe2.setForeground(Color.BLUE);
        user_labe2.setOpaque(true);
        user_labe2.setBackground(Color.YELLOW);
        user_labe2.setToolTipText("Ex. Artificial Intelligence");
        conver.add(user_labe2);

        j_field2 = new JTextField();
        j_field2.setBounds(750, 150, 250, 100);
        j_field2.setFont(fbs);
        j_field2.setForeground(Color.black);
        j_field2.setOpaque(true);
        j_field2.setBackground(Color.MAGENTA);
        conver.add(j_field2);
        Handler handler = new Handler();
   j_field2.addActionListener(handler);
   j_field1.addActionListener(handler);
    }

    class Handler implements ActionListener{
            public void actionPerformed(ActionEvent event) {
                if(event.getSource()==j_field1){
                    String statement1 = j_field1.getText();
                    if (statement1.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please enter your department name");
                    } else {
                        JOptionPane.showMessageDialog(null, "Department Name : " + statement1);
                    }

                }
                else if(event.getSource()==j_field2){

                    String statement2 = j_field2.getText();
                    if (statement2.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please enter your course name");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Course Name : " + statement2);
                    }
                }

            }

    }
    public static void main(String[] args) {
        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1500,1300);
    }
}


