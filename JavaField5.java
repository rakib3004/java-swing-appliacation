package swing;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Test extends JFrame {
    private Container descrip;
    private JLabel img_label,text_label;
    private JTextArea text_area;
    private JTextField text_field;
    private JButton button;
    private ImageIcon image;
    private Font front_style;

    Test()
    {
    descrip  = this.getContentPane();
    descrip.setLayout(null);
    descrip.setBackground(Color.black);
   front_style = new Font("Style",Font.BOLD,25);
    image = new ImageIcon(getClass().getResource("MATH.jpg"));
    img_label = new JLabel(image);
    img_label.setBounds(0,0,image.getIconWidth(),image.getIconHeight()-45);
    descrip.add(img_label);
    text_label =new JLabel("Mathematical System Management");
    text_label.setBounds(image.getIconWidth(),0,900-image.getIconWidth(),(image.getIconHeight()-45));
    text_label.setForeground(Color.BLUE);
    text_label.setOpaque(true);
    text_label.setBackground(Color.RED);
    text_label.setFont(front_style);
    descrip.add(text_label);

    }
public static void main(String[] args){

   Test frame = new Test();
   frame.setVisible(true);
   frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
   frame.setTitle("Operation Overdrive");
   frame.setBounds(100,0,900,800);

}
}
