package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldDemo extends JFrame {
    private Container conver,descrip2,descrip3;
    private JTextField j_field1,j_field2;
    private JLabel user_label,user_labe2,user_labe3,user_labe4,user_labe5,user_labe6,img_label;
    private Font formula_one;
    private JPasswordField password_file;
    private JButton button1,button2,button3,login,clear;
    TextFieldDemo(){
        initialization();
    }
    public void initialization() {
        conver = this.getContentPane();
        formula_one = new Font("Arial", Font.BOLD, 25 );
        conver.setLayout(null);
        conver.setBackground(Color.blue);

        user_label = new JLabel();
        user_label.setText("Enter Your University Name");
        user_label.setBounds(0, 0, 750, 100);
        user_label.setFont(formula_one);
        user_label.setForeground(Color.GREEN);
        user_label.setOpaque(true);
        user_label.setBackground(Color.RED);
        user_label.setToolTipText("Ex. Jahangirnagar University");
        conver.add(user_label);

        j_field1 = new JTextField();
        j_field1.setBounds(750, 0, 250, 100);
        j_field1.setFont(formula_one);
        j_field1.setForeground(Color.BLACK);
        j_field1.setOpaque(true);
        j_field1.setBackground(Color.GREEN);
        conver.add(j_field1);



        user_labe2 = new JLabel();
        user_labe2.setText("Enter Your Department Name : ");
        user_labe2.setBounds(0, 150, 750, 100);
        user_labe2.setFont(formula_one);
        user_labe2.setForeground(Color.BLUE);
        user_labe2.setOpaque(true);
        user_labe2.setBackground(Color.YELLOW);
        user_labe2.setToolTipText("Ex. Computer Science & Engineering");
        conver.add(user_labe2);

        j_field2 = new JTextField();
        j_field2.setBounds(750, 150, 250, 100);
        j_field2.setFont(formula_one);
        j_field2.setForeground(Color.black);
        j_field2.setOpaque(true);
        j_field2.setBackground(Color.MAGENTA);
        conver.add(j_field2);

        user_labe3 = new JLabel();
        user_labe3.setText("Enter Your ID NO : ");
        user_labe3.setBounds(0,300,750,100);
        user_labe3.setFont(formula_one);
        user_labe3.setForeground(Color.cyan);
        user_labe3.setOpaque(true);
        user_labe3.setBackground(Color.magenta);
        user_labe3.setToolTipText("Ex. BSSE1010");
        conver.add(user_labe3);

        password_file = new JPasswordField();
        password_file.setEchoChar('*');
        password_file.setBounds(750,300,250,100);
        password_file.setFont(formula_one);
        password_file.setBackground(Color.WHITE);
        conver.add(password_file);

        user_labe4 = new JLabel();
        user_labe4.setText("                                               Select Your Course : ");
        user_labe4.setBounds(50,430,1000,100);
        user_labe4.setFont(formula_one);
        user_labe4.setForeground(Color.BLACK);
        user_labe4.setOpaque(true);
        user_labe4.setBackground(Color.cyan);
        user_labe4.setToolTipText("Ex. Artificial Intelligence");
        conver.add(user_labe4);

        button1 = new JButton("Data Structure & Algorithm");
        button1.setFont(formula_one);
        button1.setBounds(100,530,300,100);
        button1.setForeground(Color.GRAY);
        button1.setOpaque(true);
        button1.setBackground(Color.RED);
        conver.add(button1);

        button2 = new JButton("Artificial Intelligence");
        button2.setFont(formula_one);
        button2.setBounds(400,530,300,100);
        button2.setForeground(Color.GRAY);
        button2.setOpaque(true);
        button2.setBackground(Color.BLUE);
        conver.add(button2);

        button3 = new JButton("Database Management System");
        button3.setFont(formula_one);
        button3.setBounds(700,530,300,100);
        button3.setForeground(Color.GRAY);
        button3.setOpaque(true);
        button3.setBackground(Color.GREEN);
        conver.add(button3);
        Handler handler = new Handler();
   j_field2.addActionListener(handler);
   j_field1.addActionListener(handler);
   password_file.addActionListener(handler);
   button1.addActionListener(handler);
   button2.addActionListener(handler);
   button3.addActionListener(handler);
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
                else if(event.getSource()==password_file){
                    String password = password_file.getText();
                    if(password.equals("bsse1129")){
                        JOptionPane.showMessageDialog(null,"Your Password is correct");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Your Password is not correct");
                        System.exit(0);
                    }
                }
                else if(event.getSource()==button1){
                    NewFrame frame = new NewFrame();
                    frame.setVisible(true);
                }

            else if(event.getSource()==button2){
                    NewFrame2 frame = new NewFrame2();
                    frame.setVisible(true);
                }

            else if(event.getSource()==button3){
NewFrame3 frame = new NewFrame3();
frame.setVisible(true);
                }


            }

    }

    public static void main(String[] args) {
        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(0,0,1500,1300);
    }
}
