package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame {
    private Container descrip;
    private JLabel img_label,text_label;
    private JTextArea text_area;
    private JTextField text_field,text_field2;
    private JButton button,button1;
    private ImageIcon image;
    private Font front_style,front_style2;
    private Cursor cursor;

    Test()
    {
    descrip  = this.getContentPane();
    descrip.setLayout(null);
    descrip.setBackground(Color.black);
   front_style = new Font("Style",Font.BOLD,20);
   front_style2 = new Font("Style1",Font.BOLD,15);
    image = new ImageIcon(getClass().getResource("MATH.jpg"));
    img_label = new JLabel(image);
    img_label.setBounds(0,0,image.getIconWidth(),image.getIconHeight()-45);
    descrip.add(img_label);
    text_label =new JLabel("Enter Any  Number :");
    text_label.setBounds(image.getIconWidth(),0,(900-image.getIconWidth())/2,(image.getIconHeight()-45)/2);
    text_label.setForeground(Color.BLUE);
    text_label.setOpaque(true);
    text_label.setBackground(Color.RED);
    text_label.setFont(front_style);
    descrip.add(text_label);

    text_field = new JTextField();
    text_field.setBounds(image.getIconWidth()+(900-image.getIconWidth())/2,0,(900-image.getIconWidth())/2,(image.getIconHeight()-45)/2);
    text_field.setForeground(Color.black);
    text_field.setOpaque(true);
    text_field.setBackground(Color.CYAN);
    text_field.setFont(front_style);
    text_field.setHorizontalAlignment(JTextField.CENTER);
    descrip.add(text_field);

    cursor = new Cursor(Cursor.HAND_CURSOR);
    button = new JButton("Clear");
    button.setBounds(500,image.getIconHeight()-200,120,75);
    button.setForeground(Color.WHITE);
    button.setCursor(cursor);
    button.setOpaque(true);
    button.setBackground(Color.MAGENTA);
    button.setFont(front_style2);
    descrip.add(button);

    cursor = new Cursor(Cursor.HAND_CURSOR);
    button1 = new JButton("Close");
    button1.setBounds(700,image.getIconHeight()-200,120,75);
    button1.setForeground(Color.WHITE);
    button1.setCursor(cursor);
    button1.setOpaque(true);
    button1.setBackground(Color.BLUE);
    button1.setFont(front_style2);
    descrip.add(button1);

    text_area = new JTextArea();
    text_area.setBounds(450,400,600,400);
    text_area.setFont(front_style);
    text_area.setForeground(Color.black);
        text_area.setOpaque(true);
        text_area.setBackground(Color.GREEN);
    descrip.add(text_area);
    text_field.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            text_area.setText("");
            int number = Integer.parseInt(text_field.getText());
            int iterator,calculation;
         String   get_number, get_iterator , get_calculation;
            for(iterator=1;iterator<=10;iterator++){
                calculation = number * iterator;

               get_calculation= String.valueOf(calculation);
                get_number = String.valueOf(number);
               get_iterator =String.valueOf(iterator);
               text_area.append(get_number+" X "+get_iterator+" = "+get_calculation+"\n");
            }
        }
    });

    button.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            text_area.setText("");
        }
    });

        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

public static void main(String[] args){

   Test frame = new Test();
   frame.setVisible(true);
   frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
   frame.setTitle("Operation Overdrive");
   frame.setBounds(100,0,900,800);
    }
}
