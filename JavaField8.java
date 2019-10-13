package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxDemo  extends JFrame {
 private Container container;
private JTextField jTextField, jTextField2;
private JTextArea jTextArea;
private  Font font;
private JScrollPane jScrollPane;
    private JButton button,button1;
    private Cursor cursor;


    ComboBoxDemo(){
    primary_function();
}
public void primary_function(){
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setBounds(0,0,1500,1300);
 this.setBackground(Color.MAGENTA);
 this.setTitle("Differential Function");

 container = this.getContentPane();
    container.setLayout(null);
    container.setBackground(Color.MAGENTA);

    font = new Font("Auxilary",Font.BOLD,23);
    jTextField = new JTextField();
    jTextField.setBounds(10,20,190,90);
    jTextField.setForeground(Color.black);
    jTextField.setOpaque(true);
    jTextField.setBackground(Color.blue);
    jTextField.setFont(font);
    container.add(jTextField);

    jTextArea = new JTextArea();
    jTextArea.setBounds(10,110,440,300);
    jTextArea.setForeground(Color.black);
    jTextArea.setOpaque(true);
    jTextArea.setBackground(Color.green);
    jTextArea.setFont(font);
    jTextArea.setLineWrap(true);
    jTextArea.setWrapStyleWord(true);
    container.add(jTextArea);

    jTextField2 = new JTextField();
    jTextField2.setBounds(10,500,440,100);
    jTextField2.setForeground(Color.black);
    jTextField2.setOpaque(true);
    jTextField2.setBackground(Color.blue);
    jTextField2.setFont(font);
   // jTextField2.setLineWrap(true);
   // jTextField2.setWrapStyleWord(true);
    container.add(jTextField2);


    jScrollPane = new JScrollPane(jTextArea);
    jScrollPane.setBounds(10,110,440,300);
    container.add(jScrollPane);

    cursor = new Cursor(Cursor.HAND_CURSOR);
    button = new JButton("Clear");
    button.setBounds(450,20,120,65);
    button.setForeground(Color.WHITE);
    button.setCursor(cursor);
    button.setOpaque(true);
    button.setBackground(Color.MAGENTA);
    button.setFont(font);
    container.add(button);

    cursor = new Cursor(Cursor.HAND_CURSOR);
    button1 = new JButton("Close");
    button1.setBounds(450,120,120,65);
    button1.setForeground(Color.WHITE);
    button1.setCursor(cursor);
    button1.setOpaque(true);
    button1.setBackground(Color.BLUE);
    button1.setFont(font);
    container.add(button1);

jTextField.addKeyListener(new KeyListener() {
    @Override
    public void keyTyped(KeyEvent e) {
        jTextArea.append("You Typed : "+e.getKeyChar()+"\n");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        jTextArea.append("You Pressed : "+e.getKeyChar()+"\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        jTextArea.append("You Released : "+e.getKeyChar()+"\n");
    }
});
button.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {
        jTextArea.setText("");
    }
});

    button1.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    jTextArea.addMouseMotionListener(new MouseMotionListener() {
        @Override
        public void mouseDragged(MouseEvent e) {
jTextField2.setText("Mouse Dragged :"+e.getX() +" "+ e.getY());
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            jTextField2.setText("Mouse Moved :"+e.getX() +" "+ e.getY());

        }
    });

}
    public static void main(String[] args) {
ComboBoxDemo  combo = new ComboBoxDemo();
combo.setVisible(true);
    }
}
