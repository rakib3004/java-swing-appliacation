package swing;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class StudentTable  extends JFrame{

    private Container container;
    private JLabel jLabel,jLabel2,jLabel3,jLabel4,jLabel5;
    private JTextField jTextField,jTextField2,jTextField3,jTextField4;
    private JButton jButton,jButton2,jButton3,jButton4;
private JTable jTable;
private JScrollPane jScrollPane;
private DefaultTableModel defaultTableModel;
private String []  columms = {"Name","Dept.","Course","Course"};
private String [] rows = new String[4];
    StudentTable(){
        induction();
    }
    public void induction(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(780,690);
        this.setLocationRelativeTo(null);
        this.setTitle("Student Management System");

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.blue);

        Font font = new Font("Font",Font.BOLD,18);

        jLabel = new JLabel("Student Registration");
        jLabel.setFont(font);
        jLabel.setForeground(Color.magenta);
        jLabel.setBounds(140,10,250,50);
        container.add(jLabel);

        jLabel2 = new JLabel("Name :");
        jLabel2.setFont(font);
        jLabel2.setForeground(Color.green);
        jLabel2.setBounds(10,80,140,30);
        container.add(jLabel2);

        jTextField = new JTextField();
        jTextField.setFont(font);
        jTextField.setBounds(110,80,200,30);
        container.add(jTextField);

        jButton = new JButton("Add");
        jButton.setFont(font);
        jButton.setBounds(400,80,100,30);
        container.add(jButton);

        jLabel3 = new JLabel("Dept :");
        jLabel3.setFont(font);
        jLabel3.setForeground(Color.green);
        jLabel3.setBounds(10,130,150,30);
        container.add(jLabel3);

        jTextField2 = new JTextField();
        jTextField2.setFont(font);
        jTextField2.setBounds(110,130,200,30);
        container.add(jTextField2);

        jButton2 = new JButton("Update");
        jButton2.setFont(font);
        jButton2.setBounds(400,130,100,30);
        container.add(jButton2);

        jLabel4 = new JLabel("Course :");
        jLabel4.setFont(font);
        jLabel4.setForeground(Color.green);
        jLabel4.setBounds(10,180,150,30);
        container.add(jLabel4);

        jTextField3 = new JTextField();
        jTextField3.setFont(font);
        jTextField3.setBounds(110,180,200,30);
        container.add(jTextField3);

        jButton3 = new JButton("Delete");
        jButton3.setFont(font);
        jButton3.setBounds(400,180,100,30);
        container.add(jButton3);

        jLabel5 = new JLabel("Course2 :");
        jLabel5.setFont(font);
        jLabel5.setForeground(Color.green);
        jLabel5.setBounds(10,230,150,30);
        container.add(jLabel5);

        jTextField4 = new JTextField();
        jTextField4.setFont(font);
        jTextField4.setBounds(110,230,200,30);
        container.add(jTextField4);

        jButton4 = new JButton("Clear ");
        jButton4.setFont(font);
        jButton4.setBounds(400,230,100,30);
        container.add(jButton4);

        jTable = new JTable();
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.setColumnIdentifiers(columms);
        jTable.setModel(defaultTableModel);
        jTable.setFont(font);
        jTable.setSelectionBackground(Color.ORANGE);
        jTable.setOpaque(true);
        jTable.setBackground(Color.GREEN);
        jTable.setRowHeight(30);

        jScrollPane = new JScrollPane(jTable);
        jScrollPane.setBounds(10,360,740,265);
        container.add(jScrollPane);
    }

    public static void main(String[] args) {
        StudentTable frame = new StudentTable();
        frame.setVisible(true);
    }
}
