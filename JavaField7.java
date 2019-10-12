package swing;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;

public class RadioButtonDemo extends  JFrame {

    private Container concepts;
    private JRadioButton radio1,radio2,radio3,radio4,radio5;
    private  JLabel label;
    private Font font_style,font_style2;
    private ButtonGroup buttonGroup;
    private Cursor cursor;
    private JTextArea jTextArea;
    private  JCheckBox jCheckBox1,jCheckBox2,jCheckBox3,jCheckBox4,jCheckBox5;
    RadioButtonDemo(){
initialization();
    }
    public void initialization(){
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setBounds(0,0,1500,1300);
this.setTitle("Radio Button");
font_style = new Font("Switch",Font.BOLD,23);
font_style = new Font("Key",Font.BOLD,13);


 concepts = this.getContentPane();
 concepts.setLayout(null);
 concepts.setBackground(Color.red);



 label = new JLabel("  What is your interesting field");
 label.setBounds(50,0,400,175);
 label.setFont(font_style);
 label.setForeground(Color.black);
 label.setOpaque(true);
 label.setBackground(Color.green);
 concepts.add(label);

 cursor = new Cursor(Cursor.HAND_CURSOR);

 radio1 = new JRadioButton("Engineering & Technology");
 radio1.setBounds(50,200,400,50);
 radio1.setFont(font_style);
 radio1.setCursor(cursor);
 radio1.setForeground(Color.black);
 radio1.setOpaque(true);
 radio1.setBackground(Color.blue);
 radio1.setSelected(false);
 concepts.add(radio1);

 radio2 = new JRadioButton("Biological Science");
 radio2.setBounds(50,300,400,50);
 radio2.setFont(font_style);
 radio2.setCursor(cursor);
 radio2.setForeground(Color.black);
 radio2.setOpaque(true);
 radio2.setBackground(Color.blue);
 concepts.add(radio2);



 radio3 = new JRadioButton("Business Studies");
 radio3.setBounds(50,400,400,50);
 radio3.setFont(font_style);
 radio3.setCursor(cursor);
 radio3.setForeground(Color.black);
 radio3.setOpaque(true);
 radio3.setBackground(Color.blue);
 concepts.add(radio3);

radio4 = new JRadioButton("History & Culture");
 radio4.setBounds(50,500,400,50);
 radio4.setFont(font_style);
 radio4.setCursor(cursor);
 radio4.setForeground(Color.black);
 radio4.setOpaque(true);
 radio4.setBackground(Color.blue);
 concepts.add(radio4);

radio5 = new JRadioButton("Environment Science");
 radio5.setBounds(50,600,400,50);
 radio5.setFont(font_style);
 radio5.setCursor(cursor);
 radio5.setForeground(Color.black);
 radio5.setOpaque(true);
 radio5.setBackground(Color.blue);
 concepts.add(radio5);

       /* buttonGroup.add(radio1);

        buttonGroup.add(radio2);

        buttonGroup.add(radio3);

        buttonGroup.add(radio4);

        buttonGroup.add(radio5);*/

        jTextArea = new JTextArea();
        jTextArea.setBounds(500,50,1000,250);
        jTextArea.setForeground(Color.ORANGE);
        jTextArea.setFont(font_style);
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        jTextArea.setOpaque(true);
        jTextArea.setBackground(Color.GRAY);
        concepts.add(jTextArea);

        buttonGroup = new ButtonGroup();

        jCheckBox1 = new JCheckBox("Computer");
        jCheckBox1.setBounds(550,300,100,70);
        concepts.add(jCheckBox1);


         jCheckBox3 = new JCheckBox("Books");
        jCheckBox3.setBounds(550,500,100,70);
        concepts.add(jCheckBox3);

         jCheckBox4 = new JCheckBox("Laboratory");
        jCheckBox4.setBounds(550,600,100,70);
        concepts.add(jCheckBox4);

         jCheckBox5 = new JCheckBox("Library");
        jCheckBox5.setBounds(550,400,100,70);
        concepts.add(jCheckBox5);

/* buttonGroup.add(jCheckBox1);
buttonGroup.add(jCheckBox3);
buttonGroup.add(jCheckBox4);
buttonGroup.add(jCheckBox5);*/


       Handler  handler = new Handler();

radio5.addActionListener(handler);
radio4.addActionListener(handler);
radio3.addActionListener(handler);
radio2.addActionListener(handler);
radio1.addActionListener(handler);
    }


    class Handler implements ActionListener {


        public void actionPerformed(ActionEvent event) {
            jTextArea.setText("");
                if(event.getSource()==radio1){
                    jTextArea.setText("Engineering & Technology is one of the most interesting \n sectors which describes and analysis about applied\n science and its application.");
                }
                else if(event.getSource()==radio2){
                    jTextArea.setText("Biological Science describes about planets and animals\n about their growth , behaviour ,\nfunctionality and research about biological science. ");
                }
                else if(event.getSource()==radio3){
                    jTextArea.setText("Business Studies is a very important study sector ,\n  marketing ,management,  business\n communication are some important factor in there . ");
                }
                else if(event.getSource()==radio4){
                    jTextArea.setText("History and culture  is a part and parcel of a nation\n which describes the past politics ,\neconomy , culture , religion , lifestyle  etc.");
                }
                else if(event.getSource()==radio5){
                    jTextArea.setText("Environment science study about nature , ecological diversity , ecological diversity and others impact by natural or artificial activities on environment.");
                }
        }
    }
    public static void main(String[] args) {
        RadioButtonDemo frame = new RadioButtonDemo();
        frame.setVisible(true);
    }
}
