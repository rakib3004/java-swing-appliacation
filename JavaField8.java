package UserSection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxDemo  extends JFrame {
    private Container container;
    private JTextField jTextField, jTextField2;
    private JTextArea jTextArea;
    private  Font font;
    private JScrollPane jScrollPane,jScrollPane2;
    private JButton button,button1,button0;
    private Cursor cursor;
    private  JPanel jPanel,jPanel2,jPanel3,jPanel4,jPanel5;
    private JButton jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9,jButton10;
    private JSpinner jSpinner;
    private JTabbedPane jTabbedPane;
    private JLabel jLabel , jLabel12,jLabel3;
    private JTable jTable;
    private String[] cols ={"Name","College","University","Dept."};
    private String[][] rows = {{"Rakib","NDC","DU","IIT"},
            {"Irfan","NDC","CUET","EEE"},
            {"Mahin","NDC","IUT","CSE"},
            {"Rafi","RUMC","CUET","CSE"},
            {"Musfique","DRMC","DU","IIT"} ,
            {"Nadim","ACC","RUET","ETE"} ,
            {"Shihab","JJBSMRGC","BUTEX","WPE"} ,        {"Tahmeed","NDC","DU","IIT"} ,

            {"Galib","NDC","DU","IIT"} ,
            {"Tunan","NDC","SUST","SWE"} ,
            {"Afnan","NDC","KUET","CE"}

    };
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
        button0 = new JButton("Color");
        button0.setBounds(450,275,120,65);
        button0.setForeground(Color.WHITE);
        button0.setCursor(cursor);
        button0.setOpaque(true);
        button0.setBackground(Color.blue);
        button0.setFont(font);
        container.add(button0);

        cursor = new Cursor(Cursor.HAND_CURSOR);
        button = new JButton("Clear");
        button.setBounds(450,200,120,65);
        button.setForeground(Color.WHITE);
        button.setCursor(cursor);
        button.setOpaque(true);
        button.setBackground(Color.cyan);
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

        jPanel = new JPanel();
        jPanel.setBounds(600,120,330,150);
        jPanel.setBackground(Color.BLUE);
        container.add(jPanel);


        jPanel2 = new JPanel();
        jPanel2.setBounds(600,280,330,150);
        jPanel2.setBackground(Color.GREEN);
        container.add(jPanel2);

        jTabbedPane = new JTabbedPane();
        jTabbedPane.setBounds(600,450,330,200);
        jTabbedPane.setBackground(Color.white);
        container.add(jTabbedPane);

        jPanel3 = new JPanel();
        jPanel3.setBackground(Color.RED);
        jPanel3.setForeground(Color.orange);
        jPanel4 = new JPanel();
        jPanel4.setBackground(Color.blue);
        jPanel3.setForeground(Color.magenta);
        jPanel5 = new JPanel();
        jPanel3.setForeground(Color.cyan);
        jPanel5.setBackground(Color.green);


        jTabbedPane.addTab("Start",jPanel3);
        jTabbedPane.addTab("Stop",jPanel4);
        jTabbedPane.addTab("Control",jPanel5);

        jButton1 = new JButton("1");
        jButton2 = new JButton("2");
        jButton3 = new JButton("3");
        jButton4 = new JButton("4");
        jButton5 = new JButton("5");
        jButton6 = new JButton("6");
        jButton7 = new JButton("7");
        jButton8 = new JButton("8");
        jButton9 = new JButton("9");
        jButton10 = new JButton("10");



        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);
        jPanel2.add(jButton6);
        jPanel2.add(jButton7);
        jPanel2.add(jButton8);
        jPanel2.add(jButton9);
        jPanel2.add(jButton10);

        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(1129,1101,1133,1);

        jSpinner = new JSpinner(spinnerNumberModel );
        jSpinner.setBounds(620,20,140,50);
        jSpinner.setFont(font);
        container.add(jSpinner);

        jLabel = new JLabel();
        jLabel.setBounds(950, 30, 300, 400);
        jLabel.setFont(font);
        jLabel.setBackground(Color.white);
        container.add(jLabel);
        jTable = new JTable(rows,cols);
        jTable.setSelectionBackground(Color.cyan);
        jTable.setEnabled(true);

        jScrollPane2 = new JScrollPane(jTable);
        jScrollPane2.setBounds(950, 30, 300, 400);
        container.add(jScrollPane2);

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
                jTextField.setText("");
                jTextField2.setText("");
            }
        });

        button0.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null,"Select a Color", Color.yellow);
                container.setBackground(color);
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
